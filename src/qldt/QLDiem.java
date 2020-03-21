/**@author honor */
package qldt;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class QLDiem {
	
	private static String MaSV, MaLop, Diem, TenMH, TenSV, NamHoc, HocKi;
	@SuppressWarnings("FieldMayBeFinal")
	private static String[]
			titles1 = {"", "Mã Lớp", "Mã SV", "Họ và tên SV", "Điểm"},
			titles2 = {"", "Mã Lớp", "Tên môn", "Năm học", "Học kì", "Điểm"},
			titles3 = {"", "Mã SV", "Tên SV", "Điểm"};
	static String getMaMH, getTenMH, getSoTC, MaCu;
	
	private static void copyValues() {		
		MaSV = UI.st4;
		MaLop = UI.st5;
		Diem = UI.st6;
	}
	
	private static boolean findSVLop() {
		copyValues();
		QLDT.command = String.format("SELECT * FROM SinhVienLop WHERE MaLop = '%s' AND MaSV = '%s';", MaLop, MaSV);
		try {
			QLDT.rs = QLDT.stmt.executeQuery(QLDT.command);
			if (!QLDT.rs.next()) {
				QLDT.append +=QLDT.tab(2) + QLDT.command;
				QLDT.append = QLDT.tab(2) + "Không tìm thấy mục để sửa. Mời xem lại các giá trị nhập.";
				return false;
			}
		} catch (SQLException ex) {
			QLDT.append = QLDT.tab(2) + "Lỗi: " + ex.getMessage();
			return false;
		}
		return true;
	}
	
	static void editDiem() {
		if (findSVLop()) {
			QLDT.command = String.format("UPDATE SinhVienLop SET Diem = '%s' WHERE MaLop = '%s' AND MaSV = '%s';", Diem, MaLop, MaSV);
			try {
				QLDT.rsb = QLDT.stmt.execute(QLDT.command);
				if (QLDT.stmt.getUpdateCount() > 0) {
					QLDT.append = QLDT.tab(2) + "Cập nhật điểm thành công.";
				}
			} catch (SQLException ex) {
				QLDT.append = QLDT.tab(2) + "Lỗi: " + ex.getMessage();
			}
		}
	}
	
	static void printDiemLop() {
		copyValues();
		QLDT.command = String.format("SELECT MonHoc.TenMH FROM Lop, MonHoc WHERE Lop.MaMH = MonHoc.MaMH AND Lop.MaLop = '%s';", MaLop);
		try {
			QLDT.rs = QLDT.stmt.executeQuery(QLDT.command);
			if (QLDT.rs.next()) {
				TenMH = QLDT.rs.getString(1);
				titles1[0] = MaLop + " " + TenMH;
				QLDT.command = String.format("SELECT SinhVienLop.MaLop, SinhVienLop.MaSV, CONCAT(SinhVien.HoSV, ' ', SinhVien.TenSV) AS HoVaTen, SinhVienLop.Diem "
						+ "FROM SinhVien, SinhVienLop WHERE SinhVien.MaSV = SinhVienLop.MaSV AND SinhVienLop.MaLop = '%s';", MaLop);
				QLDT.rs = QLDT.stmt.executeQuery(QLDT.command);				
				QLDT.append = QLDT.displayResultSet(QLDT.rs, titles1);
			} else
				QLDT.append = QLDT.tab(2) + "Không tìm thấy lớp hoặc lớp không có sinh viên.";
		} catch (SQLException ex) {
			QLDT.append = QLDT.tab(2) + "Lỗi: " + ex.getMessage();
		}
	}
	
	static void printDiemSV() {
		copyValues();
		QLDT.command = String.format("SELECT CONCAT(HoSV, ' ', TenSV) AS HoVaTen FROM SinhVien WHERE MaSV = '%s';", MaSV);
		try {
			QLDT.rs = QLDT.stmt.executeQuery(QLDT.command);
			if (QLDT.rs.next()) {
				TenSV = QLDT.rs.getString(1);
				titles2[0] = MaSV + " " + TenSV;
				QLDT.command = String.format("SELECT SinhVienLop.MaLop, MonHoc.TenMH, Lop.NamHoc, Lop.HocKi, SinhVienLop.Diem FROM SinhVienLop, Lop, MonHoc "
						+ "WHERE SinhVienLop.MaLop = Lop.MaLop AND Lop.MaMH = MonHoc.MaMH AND SinhVienLop.MaSV = '%s';", MaSV);
				QLDT.rs = QLDT.stmt.executeQuery(QLDT.command);
				QLDT.append = QLDT.displayResultSet(QLDT.rs, titles2);
			} else 
				QLDT.append = QLDT.tab(2) + "Không tìm thấy sinh viên hoặc sinh viên chưa từng học lớp nào.";
		} catch (SQLException ex) {
			QLDT.append = QLDT.tab(2) + "Lỗi: " + ex.getMessage();
		}
	}
	
	static void top() {
		NamHoc = UI.st2;
		HocKi = UI.st3;
			
		try {
			QLDT.command = String.format("SELECT sinhvienlop.masv, CONCAT(sinhvien.HoSV, ' ', sinhvien.TenSV) AS HoVaTen, sum(sinhvienlop.diem * monhoc.sotc)/sum(monhoc.sotc) as dtb FROM sinhvien, sinhvienlop, lop, monhoc where sinhvienlop.masv = sinhvien.masv and sinhvienlop.malop = lop.malop and lop.mamh = monhoc.mamh and lop.namhoc = %s and lop.hocki = %s group by sinhvienlop.masv order by dtb desc limit 3;", NamHoc, HocKi);
			QLDT.rs = QLDT.stmt.executeQuery(QLDT.command);
			QLDT.append = QLDT.displayResultSet(QLDT.rs, titles3);
		} catch (SQLException ex) {
			QLDT.append = QLDT.tab(2) + "Lỗi: " + ex.getMessage();
		}
	}
}

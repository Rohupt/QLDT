/**@author honor */
package qldt;

import java.sql.SQLException;

public class QLLop {
	
	private static String MaLop, MaMH, NamHoc, HocKi, MaGV, MaSV, Diem;
	private static final String[] TITLES = {"Danh sách lớp", "Mã Lớp", "Mã SV", "Họ", "Tên", "Ngày sinh", "Nơi sinh"};
	static String getMaLop, getMaGV, getMaMH, getNamHoc, getHocKi, MaCu;
	
	private static void copyValuesA() {
		MaLop = UI.st2;
		MaMH = UI.st3;
		NamHoc = UI.st4;
		HocKi = UI.st5;
		MaGV = UI.st6;
	}
	
	private static void copyValuesB() {
		MaLop = UI.st2;
		MaSV = UI.st3;
	}
	
	static void addLop() {
		copyValuesA();
		QLDT.command = "INSERT INTO Lop VALUES ('" + MaLop + "', '" + MaMH + "', '" + NamHoc + "', '" + HocKi + "', '" + MaGV + "')";
		QLDT.command = String.format("INSERT INTO Lop VALUES ('%s', '%s', %s, '%s', '%s');", MaLop, MaMH, NamHoc, HocKi, MaGV);
		try {
			QLDT.rsb = QLDT.stmt.execute(QLDT.command);
			QLDT.append = QLDT.tab(2) + "Thêm lớp thành công.";
		} catch (SQLException ex) {
			QLDT.append = QLDT.tab(2) + "Lỗi: " + ex.getMessage();
		}
	}
	
	static boolean findLop() {
		copyValuesA();
		try {			
			QLDT.command = "SELECT * FROM Lop WHERE MaLop = '" + MaLop + "';";			
			QLDT.rs = QLDT.stmt.executeQuery(QLDT.command);
			if (QLDT.rs.next()) {
				QLDT.append = QLDT.tab(2) + "Tìm thấy lớp.";
				getMaLop = QLDT.rs.getString(1);
				getMaMH = QLDT.rs.getString(2);
				getNamHoc = QLDT.rs.getString(3);
				getHocKi = QLDT.rs.getString(4);
				getMaGV = QLDT.rs.getString(5);
				MaCu = MaLop;
			} else {
				QLDT.append = String.format(QLDT.tab(2) + "Không tìm thấy lớp %s.", MaLop);
				return false;
			}
		} catch (SQLException ex) {
			QLDT.append = QLDT.tab(2) + "Lỗi: " + ex.getMessage();
			return false;
		}		
		return true;
	}
	
	static boolean editLop() {
		copyValuesA();
		QLDT.command = String.format("UPDATE Lop SET MaLop = '%s', MaMH = '%s', NamHoc = %s, HocKi = '%s', MaGV = '%s' WHERE MaLop = '%s';",
				MaLop, MaMH, NamHoc, HocKi, MaGV, MaCu);
		try {
			QLDT.rsb = QLDT.stmt.execute(QLDT.command);
			if(QLDT.stmt.getUpdateCount() > 0)
				QLDT.append = QLDT.tab(2) + "Sửa thông tin lớp thành công.";
			else {
				QLDT.append = QLDT.tab(2) + "Không sửa được thông tin lớp. Mời xem lại các thông tin nhập.";
				return false;
			}
		} catch (SQLException ex) {
			QLDT.append = QLDT.tab(2) + "Lỗi: " + ex.getMessage();
			return false;
		}
		return true;
	}
	
	static void addSinhVien() {
		copyValuesB();
		QLDT.command = String.format("INSERT INTO SinhVienLop VALUES ('%s', '%s', null);", MaSV, MaLop);
		try {
			QLDT.rsb = QLDT.stmt.execute(QLDT.command);
			if(QLDT.stmt.getUpdateCount() > 0)
				QLDT.append += QLDT.tab(2) + "Thêm sinh viên thành công.";
			else {
				QLDT.append += QLDT.tab(2) + "Không thực hiện được. Mời xem lại các thông tin nhập.";
			}
		} catch (SQLException ex) {
			QLDT.append += QLDT.tab(2) + "Lỗi: " + ex.getMessage();
		}
	}
	
	static void removeSinhVien() {
		copyValuesB();
		QLDT.command = String.format("DELETE FROM SinhVienLop WHERE MaLop = '%s' AND MaSV = '%s';", MaLop, MaSV);
		try {
			QLDT.rsb = QLDT.stmt.execute(QLDT.command);
			if(QLDT.stmt.getUpdateCount() > 0)
				QLDT.append += QLDT.tab(2) + "Loại bỏ sinh viên thành công.";
			else {
				QLDT.append += QLDT.tab(2) + "Không thực hiện được. Mời xem lại các thông tin nhập.";
			}
		} catch (SQLException ex) {
			QLDT.append += QLDT.tab(2) + "Lỗi: " + ex.getMessage();
		}
	}
	
	static void removeLop() {
		copyValuesA();
		QLDT.command = String.format("DELETE FROM Lop WHERE MaLop = '%s';", MaLop);
		try {
			QLDT.rsb = QLDT.stmt.execute(QLDT.command);
			if(QLDT.stmt.getUpdateCount() > 0)
				QLDT.append = QLDT.tab(2) + "Huỷ lớp thành công.";
			else {
				QLDT.append = QLDT.tab(2) + "Không thực hiện được. Mời xem lại các thông tin nhập.";
			}
		} catch (SQLException ex) {
			QLDT.append = QLDT.tab(2) + "Lỗi: " + ex.getMessage();
		}
	}
	
	static void printDSLop() {
		try {
			if (findLop()) {
				QLDT.command = String.format("SELECT SinhVienLop.MaLop, SinhVien.MaSV, SinhVien.HoSV, SinhVien.TenSV, SinhVien.NgaySinh, SinhVien.NoiSinh"
						+ " FROM SinhVien, SinhVienLop WHERE SinhVien.MaSV = SinhVienLop.MaSV AND SinhVienLop.MaLop = '%s';", MaLop);
				QLDT.rs = QLDT.stmt.executeQuery(QLDT.command);
				QLDT.append = QLDT.displayResultSet(QLDT.rs, TITLES);
			}
		} catch (SQLException ex) {
			QLDT.append = QLDT.tab(2) + "Lỗi: " + ex.getMessage();
		}
	}
}

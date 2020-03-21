/**@author honor */
package qldt;

import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class QLSinhVien {
	
	private static String MaSV, HoSV, TenSV, NgaySinh, NoiSinh;
	private static final String[] TITLES = {"Danh sách sinh viên", "Mã SV", "Họ", "Tên", "Ngày sinh", "Nơi sinh"};
	static String getMaSV, getHoSV, getTenSV, getNgaySinh, getNoiSinh, MaCu;
	
	private static void copyValues() {
		MaSV = UI.st2;
		HoSV = UI.st3;
		TenSV = UI.st4;
		if (dateCheck(UI.st5)) NgaySinh = UI.st5; else NgaySinh = "";
		NoiSinh = UI.st6;
	}
	
	private static boolean dateCheck(String date) {
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
		formatter.setLenient(false);
		Date parsedDate = null;
		try {
			parsedDate = formatter.parse(date);
			if (!date.equals(formatter.format(parsedDate))) date = null;
		} catch (ParseException ex) {
			QLDT.append = QLDT.tab(2) + "Lỗi: " + ex.getMessage();
		}
		return (date != null);
	}
	
	static void addSinhVien() {
		copyValues();
		if (dateCheck(UI.st5)) {
			QLDT.command = String.format("INSERT INTO SinhVien VALUES ('%s', '%s', '%s', STR_TO_DATE('%s', '%%d/%%m/%%Y'), '%s');",
					MaSV, HoSV, TenSV, NgaySinh, NoiSinh);
			try {
				QLDT.rsb = QLDT.stmt.execute(QLDT.command);
				QLDT.append = QLDT.tab(2) + "Thêm hồ sơ sinh viên thành công.";
			} catch (SQLException ex) {
				QLDT.append = QLDT.tab(2) + "Lỗi: " + ex.getMessage();
			}
		} else {
			QLDT.append = QLDT.tab(2) + "Ngày sinh không hợp lệ.";
		}
	}
	
	static boolean findSinhVien() throws SQLException {
		copyValues();
		QLDT.command = "SELECT * FROM SinhVien WHERE MaSV = '" + MaSV + "';";
		try {
			QLDT.rs = QLDT.stmt.executeQuery(QLDT.command);
		} catch (SQLException ex) {
			QLDT.append = QLDT.tab(2) + "Lỗi: " + ex.getMessage();
			return false;
		}
		if (QLDT.rs.next()) {
			QLDT.append = QLDT.tab(2) + "Tìm thấy sinh viên.";
			getMaSV = QLDT.rs.getString(1);
			getHoSV = QLDT.rs.getString(2);
			getTenSV = QLDT.rs.getString(3);
			getNoiSinh = QLDT.rs.getString(5);
			MaCu = MaSV;
			
			SimpleDateFormat format1 = new SimpleDateFormat("dd/MM/yyyy"), format2 = new SimpleDateFormat("yyyy-MM-dd");
			try {
				Date date = format2.parse(QLDT.rs.getString(4));
				getNgaySinh = format1.format(date);
			} catch (ParseException ex) {
				QLDT.append += QLDT.tab(2) + "Lỗi chuyển ngày sinh.";
				return false;
			}
		} else {
			QLDT.append = QLDT.tab(2) + "Không tìm thấy sinh viên.";
			return false;
		}
		return true;
	}
	
	static boolean editSinhVien() {
		copyValues();
		if (dateCheck(UI.st5)) {			
			QLDT.command = String.format("UPDATE SinhVien SET MaSV = '%s', HoSV = '%s', TenSV = '%s', "
					+ "NgaySinh = STR_TO_DATE('%s', '%%d/%%m/%%Y'), NoiSinh = '%s' WHERE MaSV = '%s';",
					MaSV, HoSV, TenSV, NgaySinh, NoiSinh, MaCu);
			try {
				QLDT.rsb = QLDT.stmt.execute(QLDT.command);
				if(QLDT.stmt.getUpdateCount() > 0)
					QLDT.append = QLDT.tab(2) + "Sửa hồ sơ sinh viên thành công.";
				else {
					QLDT.append = QLDT.tab(2) + "Không sửa được hồ sơ sinh viên. Mời xem lại các thông tin nhập.";
					return false;
				}
			} catch (SQLException ex) {
				QLDT.append = QLDT.tab(2) + "Lỗi: " + ex.getMessage();
				return false;
			}
		} else {
			QLDT.append = QLDT.tab(2) + "Ngày sinh không hợp lệ.";
			return false;
		}
		return true;
	}
	
	static void searchSinhVien() {
		copyValues();
		String query = "SELECT * FROM SinhVien";
		if (dateCheck(UI.st5) || ("".equals(UI.st5))) {
			if ((!"".equals(MaSV)) || (!"".equals(HoSV)) || (!"".equals(TenSV)) || (!"".equals(NgaySinh)) || (!"".equals(NoiSinh))) {
				query += " WHERE ";
				if (!"".equals(MaSV)) query += "MaSV = " + MaSV;
				if (!"".equals(HoSV)) {
					if (!"".equals(MaSV)) query += " AND ";
					query += "HoSV = '" + HoSV + "'";
				}
				if (!"".equals(TenSV)) {
					if ((!"".equals(MaSV)) || (!"".equals(HoSV))) query += " AND ";
					query += "TenSV = '" + TenSV + "'";
				}
				if (!"".equals(NgaySinh)) {
					if ((!"".equals(MaSV)) || (!"".equals(HoSV)) || (!"".equals(TenSV))) query += " AND ";
					query += "NgaySinh = STR_TO_DATE('" + NgaySinh + "', '%d/%m/%Y')";
				}
				if (!"".equals(NoiSinh)) {
					if ((!"".equals(MaSV)) || (!"".equals(HoSV)) || (!"".equals(TenSV)) || (!"".equals(NgaySinh))) query += " AND ";
					query += "NoiSinh = '" + NoiSinh + "'";
				}
			}
			query += ";";
			try {
				QLDT.rs = QLDT.stmt.executeQuery(query);
				QLDT.append = QLDT.displayResultSet(QLDT.rs, TITLES);
			} catch (SQLException ex) {
				QLDT.append = QLDT.tab(2) + "Lỗi: " + ex.getMessage();
			}
		} else
			QLDT.append = QLDT.tab(2) + "Ngày sinh không hợp lệ.";
	}
}

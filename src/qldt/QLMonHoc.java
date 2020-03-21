/**@author honor */
package qldt;

import java.sql.SQLException;


public class QLMonHoc {
	
	private static String MaMH, TenMH, SoTC;
	private static final String[] TITLES = {"Danh sách môn học", "Mã MH", "Tên MH", "Số TC"};
	static String getMaMH, getTenMH, getSoTC, MaCu;
	
	private static void copyValues() {		
		MaMH = UI.st4;
		TenMH = UI.st5;
		SoTC = UI.st6;
	}
	
	static void addMonHoc() {
		copyValues();
		QLDT.command = String.format("INSERT INTO MonHoc VALUES ('%s', '%s', '%s');", MaMH, TenMH, SoTC);
		try {
			QLDT.rsb = QLDT.stmt.execute(QLDT.command);
			QLDT.append = QLDT.tab(2) + "Thêm môn học thành công.";
		} catch (SQLException ex) {
			QLDT.append = QLDT.tab(2) + "Lỗi: " + ex.getMessage();
		}
	}
	
	static boolean findMonHoc() {
		copyValues();
		QLDT.command = String.format("SELECT * FROM MonHoc WHERE MaGV = '%s';", MaMH);
		try {
			QLDT.rs = QLDT.stmt.executeQuery(QLDT.command);
		} catch (SQLException ex) {
			QLDT.append = QLDT.tab(2) + "Lỗi: " + ex.getMessage();
			return false;
		}		
		
		try {
			if (QLDT.rs.next()) {
				QLDT.append = QLDT.tab(2) + "Tìm thấy môn học.";
				getMaMH = QLDT.rs.getString(1);
				getTenMH = QLDT.rs.getString(2);
				getSoTC = QLDT.rs.getString(3);
				MaCu = MaMH;
			} else {
				QLDT.append = QLDT.tab(2) + "Không tìm thấy môn học.";
				return false;
			}
		} catch (SQLException ex) {
			QLDT.append = QLDT.tab(2) + "Lỗi: " + ex.getMessage();
		}
		
		return true;
	}
	
	static boolean editMonHoc() {
		copyValues();
		QLDT.command = String.format("UPDATE MonHoc SET MaMH = '%s', TenMH = '%s', SoTC = '%s' WHERE MaMH = '%s';", MaMH, TenMH, SoTC, MaMH);
		try {
			QLDT.rsb = QLDT.stmt.execute(QLDT.command);
			if(QLDT.stmt.getUpdateCount() > 0)
				QLDT.append = QLDT.tab(2) + "Sửa môn học thành công.";
			else {
				QLDT.append = QLDT.tab(2) + "Không sửa được thông tin môn học. Mời xem lại các thông tin nhập.";
				return false;
			}
		} catch (SQLException ex) {
			QLDT.append = QLDT.tab(2) + "Lỗi: " + ex.getMessage();
			return false;
		}
		return true;
	}
	
	static void printMonHoc() {
		try {
			QLDT.rs = QLDT.stmt.executeQuery("SELECT * FROM MonHoc");
			QLDT.append = QLDT.displayResultSet(QLDT.rs, TITLES);
		} catch (SQLException ex) {
			QLDT.append = QLDT.tab(2) + "Lỗi: " + ex.getMessage();
		}
	}
	
}

/**@author honor */
package qldt;

import java.sql.SQLException;

public class QLGiaoVien {
	
	private static String MaGV, HoGV, TenGV, DonVi;
	private static final String[] TITLES = {"Danh sách giáo viên", "Mã GV", "Họ", "Tên", "Đơn vị"};
	static String getMaGV, getHoGV, getTenGV, getDonVi, MaCu;
	
	private static void copyValues() {
		MaGV = UI.st3;
		HoGV = UI.st4;
		TenGV = UI.st5;
		DonVi = UI.st6;
	}
	
	static void addGiaoVien() {
		copyValues();
		QLDT.command = String.format("INSERT INTO GiaoVien VALUES ('%s', '%s', '%s', '%s');", MaGV, HoGV, TenGV, DonVi);
		try {
			QLDT.rsb = QLDT.stmt.execute(QLDT.command);
			QLDT.append = QLDT.tab(2) + "Thêm hồ sơ giáo viên thành công.";
		} catch (SQLException ex) {
			QLDT.append = QLDT.tab(2) + "Lỗi: " + ex.getMessage();
		}
	}
	
	static boolean findGiaoVien() {
		copyValues();
		QLDT.command = String.format("SELECT * FROM GiaoVien WHERE MaGV = '%s';", MaGV);
		try {
			QLDT.rs = QLDT.stmt.executeQuery(QLDT.command);
		} catch (SQLException ex) {
			QLDT.append = QLDT.tab(2) + "Lỗi: " + ex.getMessage();
			return false;
		}
		
		try {
			if (QLDT.rs.next()) {
				QLDT.append = QLDT.tab(2) + "Tìm thấy giáo viên.";
				getMaGV = QLDT.rs.getString(1);
				getHoGV = QLDT.rs.getString(2);
				getTenGV = QLDT.rs.getString(3);
				getDonVi = QLDT.rs.getString(4);
				MaCu = MaGV;
			} else {
				QLDT.append = QLDT.tab(2) + "Không tìm thấy giáo viên.";
				return false;
			}
		} catch (SQLException ex) {
			QLDT.append = QLDT.tab(2) + "Lỗi: " + ex.getMessage();
		}
		
		return true;
	}
	
	static boolean editGiaoVien() {
		copyValues();
		QLDT.command = String.format("UPDATE GiaoVien SET MaGV = '%s', HoGV = '%s', TenGV = '%s', DonVi = '%s' WHERE MaGV = '%s';",
				MaGV, HoGV, TenGV, DonVi, MaCu);
		try {
			QLDT.rsb = QLDT.stmt.execute(QLDT.command);
			if(QLDT.stmt.getUpdateCount() > 0)
				QLDT.append = QLDT.tab(2) + "Sửa hồ sơ giáo viên thành công.";
			else {
				QLDT.append = QLDT.tab(2) + "Không sửa được hồ sơ giáo viên. Mời xem lại các thông tin nhập.";
				return false;
			}
		} catch (SQLException ex) {
			QLDT.append = QLDT.tab(2) + "Lỗi: " + ex.getMessage();
			return false;
		}
		return true;
	}
	
	static void printGiaoVien() {
		try {
			QLDT.rs = QLDT.stmt.executeQuery("SELECT * FROM GiaoVien");
			QLDT.append = QLDT.displayResultSet(QLDT.rs, TITLES);
		} catch (SQLException ex) {
			QLDT.append = QLDT.tab(2) + "Lỗi: " + ex.getMessage();
		}
	}
	
	static void searchGiaoVien() {
		copyValues();
		String query = "SELECT * FROM GiaoVien";
		if ((!"".equals(MaGV)) || (!"".equals(HoGV)) || (!"".equals(TenGV)) || (!"".equals(DonVi))) {
			query += " WHERE ";
			if (!"".equals(MaGV)) query += "MaGV = '" + MaGV + "'";
			if (!"".equals(HoGV)) {
				if (!"".equals(MaGV)) query += " AND ";
				query += "HoGV = '" + HoGV + "'";
			}
			if (!"".equals(TenGV)) {
				if ((!"".equals(MaGV)) || (!"".equals(HoGV))) query += " AND ";
				query += "TenGV = '" + TenGV + "'";
			}
			if (!"".equals(DonVi)) {
				if ((!"".equals(MaGV)) || (!"".equals(HoGV)) || (!"".equals(TenGV))) query += " AND ";
				query += "DonVi = '" + DonVi + "'";
			}
		}
		query += ";";
		try {
			QLDT.rs = QLDT.stmt.executeQuery(query);
			QLDT.append = QLDT.displayResultSet(QLDT.rs, TITLES);
		} catch (SQLException ex) {
			QLDT.append = QLDT.tab(2) + "Lỗi: " + ex.getMessage();
		}
	}
	
}

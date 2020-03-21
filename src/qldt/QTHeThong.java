/**@author honor */
package qldt;

import java.io.File;
import java.sql.SQLException;

public class QTHeThong {
	
	private static String dir, vardir;
	private static int menu;
	private static final String DEFAULT_DIR = "D:/Coding/NetBeansProjects/QLDT/backup/";
	private static final String[] FILES = {"MonHoc.csv", "GiaoVien.csv", "SinhVien.csv", "Lop.csv", "SinhVienLop.csv", "Login.csv"};
	static String getName;
	
	private static void copyValues() {		
		dir = UI.st;
		if (!"".equals(UI.st6))
			menu = Integer.parseInt(UI.st6);
	}
	
	static void backup() {
		copyValues();
		dir = DEFAULT_DIR + dir; vardir = dir.replace("/", "\\");
		File file = new File(vardir);
		if (file.mkdirs()) {
			String[] command = new String[6];
			command[2] = "SELECT * INTO OUTFILE '"+ dir + "/SinhVien.csv' FIELDS TERMINATED BY ','  OPTIONALLY ENCLOSED BY '\"' ESCAPED BY '\"' LINES TERMINATED BY '\\n' FROM QLDT.SinhVien;";
			command[1] = "SELECT * INTO OUTFILE '"+ dir + "/GiaoVien.csv' FIELDS TERMINATED BY ',' OPTIONALLY ENCLOSED BY '\"' ESCAPED BY '\"' LINES TERMINATED BY '\\n' FROM QLDT.GiaoVien;";
			command[3] = "SELECT * INTO OUTFILE '"+ dir + "/Lop.csv' FIELDS TERMINATED BY ',' OPTIONALLY ENCLOSED BY '\"' ESCAPED BY '\"' LINES TERMINATED BY '\\n' FROM QLDT.Lop;";
			command[0] = "SELECT * INTO OUTFILE '"+ dir + "/MonHoc.csv' FIELDS TERMINATED BY ',' OPTIONALLY ENCLOSED BY '\"' ESCAPED BY '\"' LINES TERMINATED BY '\\n' FROM QLDT.MonHoc;";
			command[5] = "SELECT * INTO OUTFILE '"+ dir + "/Login.csv' FIELDS TERMINATED BY ',' OPTIONALLY ENCLOSED BY '\"' ESCAPED BY '\"' LINES TERMINATED BY '\\n' FROM QLDT.login;";
			command[4] = "SELECT * INTO OUTFILE '"+ dir + "/SinhVienLop.csv' FIELDS TERMINATED BY ',' ENCLOSED BY '\"' ESCAPED BY '\\\\' LINES TERMINATED BY '\\n' FROM QLDT.SinhVienLop;";
			try {
				for (int i = 0; i < 6; i++)
					QLDT.rsb = QLDT.stmt.execute(command[i]);
				QLDT.append = QLDT.tab(2) + "Sao lưu thành công.";
			} catch (SQLException ex) {
				QLDT.append = QLDT.tab(2) + "Lỗi: " + ex.getMessage();
			}
		} else {
			QLDT.append = QLDT.tab(2) + "Không tạo được đường dẫn mới với tên này. Có thể đường dẫn đã tồn tại.";
		}
	}
	
	static void truncate() {
		String[] tables = {"SinhVien", "GiaoVien", "MonHoc", "Lop", "SinhVienLop"};
		try {
			for (int i = 0; i < 5; i++) {
				QLDT.command = "DELETE FROM " + tables[i] + ";";
				QLDT.rsb = QLDT.stmt.execute(QLDT.command);
			}
			QLDT.append += QLDT.tab(2) + "Xoá dữ liệu thành công";
		} catch (SQLException ex) {
			QLDT.append += QLDT.tab(2) + "Lỗi: " + ex.getMessage();
		}
	}
	
	static void restore() {
		copyValues();
		dir = DEFAULT_DIR + dir; vardir = dir.replace("/", "\\");
		File file = new File(vardir);
		if (file.exists() && file.isDirectory()) {
			String[] command = new String[6];
			command[2] = "LOAD DATA LOW_PRIORITY LOCAL INFILE '" + dir + "/SinhVien.csv' REPLACE INTO TABLE `qldt`.`sinhvien` CHARACTER SET utf8mb4 FIELDS TERMINATED BY ',' OPTIONALLY ENCLOSED BY '\"' ESCAPED BY '\"' LINES TERMINATED BY '\\n' (`MaSV`, `HoSV`, `TenSV`, `NgaySinh`, `NoiSinh`);";
			command[1] = "LOAD DATA LOW_PRIORITY LOCAL INFILE '" + dir + "/GiaoVien.csv' REPLACE INTO TABLE `qldt`.`giaovien` CHARACTER SET utf8mb4 FIELDS TERMINATED BY ',' OPTIONALLY ENCLOSED BY '\"' ESCAPED BY '\"' LINES TERMINATED BY '\\n' (`MaGV`, `HoGV`, `TenGV`, `DonVi`);";
			command[0] = "LOAD DATA LOW_PRIORITY LOCAL INFILE '" + dir + "/MonHoc.csv' REPLACE INTO TABLE `qldt`.`monhoc` CHARACTER SET utf8mb4 FIELDS TERMINATED BY ',' OPTIONALLY ENCLOSED BY '\"' ESCAPED BY '\"' LINES TERMINATED BY '\\n' (`MaMH`, `TenMH`, `SoTC`);";
			command[3] = "LOAD DATA LOW_PRIORITY LOCAL INFILE '" + dir + "/Lop.csv' REPLACE INTO TABLE `qldt`.`lop` CHARACTER SET utf8mb4 FIELDS TERMINATED BY ',' OPTIONALLY ENCLOSED BY '\"' ESCAPED BY '\"' LINES TERMINATED BY '\\n' (`MaLop`, `MaMH`, `NamHoc`, `HocKi`, `MaGV`);";
			command[5] = "LOAD DATA LOW_PRIORITY LOCAL INFILE '" + dir + "/Login.csv' REPLACE INTO TABLE `qldt`.`login` CHARACTER SET utf8mb4 FIELDS TERMINATED BY ',' OPTIONALLY ENCLOSED BY '\"' ESCAPED BY '\"' LINES TERMINATED BY '\\n' (`MSSV`, `password`, `isAdmin`);";
			command[4] = "LOAD DATA LOW_PRIORITY LOCAL INFILE '" + dir + "/SinhVienLop.csv' REPLACE INTO TABLE `qldt`.`sinhvienlop` CHARACTER SET utf8mb4 FIELDS TERMINATED BY ',' OPTIONALLY ENCLOSED BY '\"' ESCAPED BY '\\\\' LINES TERMINATED BY '\\n' (`MaSV`, `MaLop`, `Diem`);";
			try {
				for (int i = 0; i < 6; i++) {
					file = new File(vardir + "\\" + FILES[i]);
					if (file.exists() && file.isFile() && (i+1 == menu || menu == 6)) {
						QLDT.rsb = QLDT.stmt.execute(command[i]);
						QLDT.append += QLDT.tab(2) + "Nhập file " + FILES[i] + "...";
					}	
				}
			} catch (SQLException ex) {
				QLDT.append += QLDT.tab(2) + "Lỗi: " + ex.getMessage();
			}
			QLDT.append += "";
		} else {
			QLDT.append = QLDT.tab(2) + "Không tìm thấy bản sao lưu này.";
		}
	}
}

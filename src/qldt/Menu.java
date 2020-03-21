/** @author honor */
package qldt;

public class Menu {
	
	final static String MAIN_MENU = 
			"\n\t\tMENU CHÍNH========\n"
			+ "\t\t0. Thực hiện lệnh MySQL tự do\n"
			+ "\t\t1. Quản lí môn học\n"
			+ "\t\t2. Quản lí giáo viên\n"
			+ "\t\t3. Quản lí sinh viên\n"
			+ "\t\t4. Quản lí lớp\n"
			+ "\t\t5. Quản lí điểm\n"
			+ "\t\t6. Quản trị hệ thống\n"
			+ "\t\t7. Đăng xuất";
	
	final static String QL_MON_HOC = 
			"\n\t\tQUẢN LÍ MÔN HỌC=========\n"
			+ "\t\t1. Thêm môn học mới\n"
			+ "\t\t2. Sửa thông tin môn học\n"
			+ "\t\t3. In danh sách môn học\n"
			+ "\t\t4. Thoát";
	
	final static String QL_GIAO_VIEN = 
			"\n\t\tQUẢN LÍ GIÁO VIÊN========\n"
			+ "\t\t1. Thêm hồ sơ giáo viên\n"
			+ "\t\t2. Sửa thông tin giáo viên\n"
			+ "\t\t3. In danh sách giáo viên\n"
			+ "\t\t4. Tìm kiếm giáo viên\n"
			+ "\t\t5. Thoát\n";
	
	final static String QL_SINH_VIEN = 
			"\n\t\tQUẢN LÍ SINH VIÊN========\n"
			+ "\t\t1. Thêm hồ sơ sinh viên\n"
			+ "\t\t2. Sửa thông tin sinh viên\n"
			+ "\t\t3. Tìm kiếm sinh viên\n"
			+ "\t\t4. Thoát\n";
	
	final static String QL_LOP = 
			"\n\t\tQUẢN LÍ LỚP========\n"
			+ "\t\t1. Tạo lớp mới\n"
			+ "\t\t2. Sửa đổi thông tin lớp\n"
			+ "\t\t3. Bổ sung sinh viên vào lớp\n"
			+ "\t\t4. Loại bỏ sinh viên khỏi lớp\n"
			+ "\t\t5. Huỷ lớp\n"
			+ "\t\t6. In danh sách lớp\n"
			+ "\t\t7. Thoát\n";
	
	final static String QL_DIEM = 
			"\n\t\tQUẢN LÍ ĐIỂM========\n"
			+ "\t\t1. Cập nhật điểm\n"
			+ "\t\t2. In bảng điểm cho lớp\n"
			+ "\t\t3. In bảng điểm cho sinh viên\n"
			+ "\t\t4. In bảng điểm cao nhất\n"
			+ "\t\t5. Thoát\n";
	
	final static String QT_HE_THONG = 
			"\n\t\tQUẢN TRỊ HỆ THỐNG========\n"
			+ "\t\t1. Sao lưu dữ liệu\n"
			+ "\t\t2. Phục hồi dữ liệu\n"
			+ "\t\t3. Xoá dữ liệu\n"
			+ "\t\t4. Thoát\n";
	
	final static String PHUC_HOI =
			QLDT.tab(2) +"1. MonHoc.csv" +
			QLDT.tab(2) +"2. GiaoVien.csv" +
			QLDT.tab(2) +"3. SinhVien.csv" +
			QLDT.tab(2) +"4. Lop.csv" +
			QLDT.tab(2) +"5. SinhVienLop.csv" +
			QLDT.tab(2) +"6. Tất cả";
}

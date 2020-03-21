USE QLDT;

CREATE TABLE `monhoc` (
	`MaMH` VARCHAR(10) NOT NULL COLLATE 'utf8mb4_vietnamese_ci',
	`TenMH` TINYTEXT NULL DEFAULT NULL COLLATE 'utf8mb4_vietnamese_ci',
	`SoTC` TINYINT(4) NULL DEFAULT NULL,
	PRIMARY KEY (`MaMH`)
)
COLLATE='utf8mb4_vietnamese_ci'
ENGINE=InnoDB
;

CREATE TABLE `giaovien` (
	`MaGV` VARCHAR(10) NOT NULL COLLATE 'utf8mb4_vietnamese_ci',
	`HoGV` VARCHAR(15) NULL DEFAULT NULL COLLATE 'utf8mb4_vietnamese_ci',
	`TenGV` VARCHAR(40) NULL DEFAULT NULL COLLATE 'utf8mb4_vietnamese_ci',
	`DonVi` TINYTEXT NULL DEFAULT NULL COLLATE 'utf8mb4_vietnamese_ci',
	PRIMARY KEY (`MaGV`)
)
COLLATE='utf8mb4_vietnamese_ci'
ENGINE=InnoDB
;

CREATE TABLE `sinhvien` (
	`MaSV` VARCHAR(10) NOT NULL COLLATE 'utf8mb4_vietnamese_ci',
	`HoSV` VARCHAR(15) NULL DEFAULT NULL COLLATE 'utf8mb4_vietnamese_ci',
	`TenSV` VARCHAR(40) NULL DEFAULT NULL COLLATE 'utf8mb4_vietnamese_ci',
	`NgaySinh` DATE NULL DEFAULT NULL,
	`NoiSinh` TINYTEXT NULL DEFAULT NULL COLLATE 'utf8mb4_vietnamese_ci',
	PRIMARY KEY (`MaSV`)
)
COLLATE='utf8mb4_vietnamese_ci'
ENGINE=InnoDB
;

CREATE TABLE `lop` (
	`MaLop` VARCHAR(10) NOT NULL COLLATE 'utf8mb4_vietnamese_ci',
	`MaMH` VARCHAR(10) NOT NULL COLLATE 'utf8mb4_vietnamese_ci',
	`NamHoc` INT(4) NULL DEFAULT NULL,
	`HocKi` VARCHAR(8) NULL DEFAULT NULL COLLATE 'utf8mb4_vietnamese_ci',
	`MaGV` VARCHAR(10) NOT NULL COLLATE 'utf8mb4_vietnamese_ci',
	PRIMARY KEY (`MaLop`),
	INDEX `MaMH` (`MaMH`),
	INDEX `MaGV` (`MaGV`),
	CONSTRAINT `lop_ibfk_1` FOREIGN KEY (`MaMH`) REFERENCES `monhoc` (`MaMH`),
	CONSTRAINT `lop_ibfk_2` FOREIGN KEY (`MaGV`) REFERENCES `giaovien` (`MaGV`)
)
COLLATE='utf8mb4_vietnamese_ci'
ENGINE=InnoDB
;

CREATE TABLE `sinhvienlop` (
	`MaSV` VARCHAR(10) NOT NULL COLLATE 'utf8mb4_vietnamese_ci',
	`MaLop` VARCHAR(10) NOT NULL COLLATE 'utf8mb4_vietnamese_ci',
	`Diem` DOUBLE NULL DEFAULT NULL,
	PRIMARY KEY (`MaSV`, `MaLop`),
	INDEX `MaLop` (`MaLop`),
	INDEX `MaSV` (`MaSV`),
	CONSTRAINT `sinhvienlop_ibfk_1` FOREIGN KEY (`MaSV`) REFERENCES `sinhvien` (`MaSV`),
	CONSTRAINT `sinhvienlop_ibfk_2` FOREIGN KEY (`MaLop`) REFERENCES `lop` (`MaLop`)
)
COLLATE='utf8mb4_vietnamese_ci'
ENGINE=InnoDB
;

CREATE TABLE `login` (
	`MSSV` VARCHAR(8) NOT NULL COLLATE 'utf8mb4_vietnamese_ci',
	`password` VARCHAR(64) NULL DEFAULT NULL COLLATE 'utf8mb4_vietnamese_ci',
	`isAdmin` BIT(1) NOT NULL DEFAULT b'0',
	PRIMARY KEY (`MSSV`)
)
COLLATE='utf8mb4_vietnamese_ci'
ENGINE=InnoDB
;

INSERT INTO Login VALUES ('20176757', 'e60d4ab6733f65d9ad8e4ab0fa1c6ef57950d5954abdb18cddf288aab34d89ad', 1);

DELIMITER $$

CREATE TRIGGER before_class_deletion
BEFORE DELETE
ON Lop FOR EACH ROW
BEGIN
DELETE FROM SinhVienLop WHERE MaLop = OLD.MaLop;
END$$

CREATE TRIGGER before_student_deletion
BEFORE DELETE
ON SinhVien FOR EACH ROW
BEGIN
DELETE FROM SinhVienLop WHERE MaSV = OLD.MaSV;
END$$

CREATE TRIGGER before_lecturer_deletion
BEFORE DELETE
ON GiaoVien FOR EACH ROW
BEGIN
DELETE FROM Lop WHERE MaGV = OLD.MaGV;
END$$

DELIMITER ;

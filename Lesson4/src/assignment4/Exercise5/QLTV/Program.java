package assignment4.Exercise5.QLTV;

import java.text.ParseException;

public class Program {
	public static void main(String[] args) throws ParseException {
		QuanLySach qls = new QuanLySach();
		// Thêm mới sách
		String[] thongTinThem = new String[] {"Trung", "100"};
		qls.themMoiTaiLieu(100, "HN", 10, 1, thongTinThem);
		
		thongTinThem = new String[]{"1", "08-09-2000"};
		qls.themMoiTaiLieu(101, "HCM", 2, 2, thongTinThem);
		
		thongTinThem = new String[]{"08-12-2021"};
		qls.themMoiTaiLieu(102, "HCM", 5, 3, thongTinThem);
		// Hiển thị tài liệu
		qls.hienThiThongTin();
		System.out.println("\n");
		// Xóa tài liệu
		qls.xoaTaiLieu(100);
		qls.hienThiThongTin();
		System.out.println("\n");
	}
}

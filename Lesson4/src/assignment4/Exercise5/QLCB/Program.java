package assignment4.Exercise5.QLCB;

public class Program {
	public static void main(String[] args) {
		QLCB qlcb = new QLCB();
		qlcb.themMoiCanBo(1, "Trung1", 24, Gender.MALE, "HN", (short) 1, "8");
		qlcb.themMoiCanBo(2, "Trung2", 24, Gender.MALE, "HN", (short) 2, "IT");
		qlcb.themMoiCanBo(3, "Trung3", 24, Gender.MALE, "HN", (short) 3, "Sale");
		qlcb.themMoiCanBo(4, "Test", 24, Gender.MALE, "HN", (short) 3, "Marketing");
		qlcb.themMoiCanBo(5, "Hoang", 24, Gender.MALE, "HN", (short) 3, "Sale");
		qlcb.themMoiCanBo(6, "Hoang", 24, Gender.MALE, "HN", (short) 3, "IT");
		
		System.out.println("Danh sách cán bộ: ");
		qlcb.hienThiThongTin();
		
		System.out.println("Tìm kiếm: ");
		for (CanBo cb : qlcb.timKiemTheoHoTen("Test")) {
			System.out.println(cb.toString());
		}
		
		System.out.println("Xóa 1 cán bộ: ");
		qlcb.xoaCanBo("Hoang");
		
		System.out.println("Danh sách cán bộ: ");
		qlcb.hienThiThongTin();
	}
}

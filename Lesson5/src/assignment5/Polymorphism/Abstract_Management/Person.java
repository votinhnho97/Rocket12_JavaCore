package assignment5.Polymorphism.Abstract_Management;

import java.util.Scanner;

public class Person {
	private String ten;
	private GioiTinh gioiTinh;
	private String ngaySinh;
	private String diaChi;
	public Scanner scan;

	public Person() {
	}

	public Person(String ten, GioiTinh gioiTinh, String ngaySinh, String diaChi) {
		super();
		this.ten = ten;
		this.gioiTinh = gioiTinh;
		this.ngaySinh = ngaySinh;
		this.diaChi = diaChi;
	}

	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	public GioiTinh getGioiTinh() {
		return gioiTinh;
	}

	public void setGioiTinh(GioiTinh gioiTinh) {
		this.gioiTinh = gioiTinh;
	}

	public String getNgaySinh() {
		return ngaySinh;
	}

	public void setNgaySinh(String ngaySinh) {
		this.ngaySinh = ngaySinh;
	}

	public String getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

	public void inputInfo() {
		scan = new Scanner(System.in);
		System.out.println("Nhập thông tin Person:");
		System.out.println("Tên: ");
		setTen(scan.next());
		System.out.println("Ngày sinh: ");
		setNgaySinh(scan.next());
		System.out.println("Địa chỉ: ");
		setDiaChi(scan.next());
		// scan.close();
	};

	public void showInfo() {
		System.out.println("\nTHÔNG TIN");
		System.out.println("Tên: " + getTen());
		System.out.println("Ngày sinh: " + getNgaySinh());
		System.out.println("Địa chỉ: " + getDiaChi());
	};
}

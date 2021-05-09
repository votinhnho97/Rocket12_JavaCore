package assignment5.Polymorphism.Abstract_Management;

public class Student extends Person {
	private int maSinhVien;
	private float diemTB;
	private String email;

	public Student() {
		super();
	}

	public int getMaSinhVien() {
		return maSinhVien;
	}

	public void setMaSinhVien(int maSinhVien) {
		this.maSinhVien = maSinhVien;
	}

	public float getDiemTB() {
		return diemTB;
	}

	public void setDiemTB(float diemTB) {
		this.diemTB = diemTB;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public void inputInfo() {
		super.inputInfo();
		System.out.println("Nhập thông tin Student:");
		System.out.println("Mã sinh viên: ");
		setMaSinhVien(Integer.valueOf(scan.next()));
		System.out.println("Điểm TB: ");
		setDiemTB(Float.valueOf(scan.next()));
		System.out.println("Email: ");
		setEmail(scan.next());
		// scan.close();
	}

	@Override
	public void showInfo() {
		super.showInfo();
		System.out.println("Mã sinh viên: " + getMaSinhVien());
		System.out.println("Điểm TB: " + getDiemTB());
		System.out.println("Email: " + getEmail());
	}

	public boolean checkHocBong() {
		return getDiemTB() > 8 ? true : false;
	}

}

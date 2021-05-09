package assignment4.Exercise5.QLCB;

public class NhanVien extends CanBo {
	private String congViec;

	public NhanVien(int id, String hoTen, int tuoi, Gender gioiTinh, String diaChi, String congViec) {
		super(id, hoTen, tuoi, gioiTinh, diaChi);
		this.congViec = congViec;
	}

	public String getCongViec() {
		return congViec;
	}

	public void setCongViec(String congViec) {
		this.congViec = congViec;
	}

	@Override
	public String toString() {
		return super.toString() + " - Công việc: " + congViec;
	}
	
}

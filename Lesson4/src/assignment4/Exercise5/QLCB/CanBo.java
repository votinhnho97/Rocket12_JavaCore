package assignment4.Exercise5.QLCB;

public class CanBo {
	private int id;
	private String hoTen;
	private int tuoi;
	private Gender gioiTinh;
	private String diaChi;

	public CanBo(int id, String hoTen, int tuoi, Gender gioiTinh, String diaChi) {
		this.id = id;
		this.hoTen = hoTen;
		this.tuoi = tuoi;
		this.gioiTinh = gioiTinh;
		this.diaChi = diaChi;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public int getTuoi() {
		return tuoi;
	}

	public void setTuoi(int tuoi) {
		this.tuoi = tuoi;
	}

	public Gender getGioiTinh() {
		return gioiTinh;
	}

	public void setGioiTinh(Gender gioiTinh) {
		this.gioiTinh = gioiTinh;
	}

	public String getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

	@Override
	public String toString() {
		return "Họ tên: " + hoTen + " - Tuổi: " + tuoi + " - Giới tính: " + gioiTinh + " - Địa chỉ: " + diaChi;
	}

}

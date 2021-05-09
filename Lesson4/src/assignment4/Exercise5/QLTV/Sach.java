package assignment4.Exercise5.QLTV;

public class Sach extends TaiLieu {
	private String tacGia;
	private int soTrang;

	public String getTacGia() {
		return tacGia;
	}

	public void setTacGia(String tacGia) {
		this.tacGia = tacGia;
	}

	public int getSoTrang() {
		return soTrang;
	}

	public void setSoTrang(int soTrang) {
		this.soTrang = soTrang;
	}

	public Sach(int maTaiLieu, String tenNXB, int soBanPhatHanh, String tacGia, int soTrang) {
		super(maTaiLieu, tenNXB, soBanPhatHanh);
		this.tacGia = tacGia;
		this.soTrang = soTrang;
	}

	@Override
	public String toString() {
		return super.toString() + " - Tác giả: " + tacGia + " - Số trang: " + soTrang;
	}

}

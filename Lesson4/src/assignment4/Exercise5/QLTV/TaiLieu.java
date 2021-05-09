package assignment4.Exercise5.QLTV;

public class TaiLieu {
	private int maTaiLieu;
	private String tenNXB;
	private int soBanPhatHanh;

	public int getMaTaiLieu() {
		return maTaiLieu;
	}

	public void setMaTaiLieu(int maTaiLieu) {
		this.maTaiLieu = maTaiLieu;
	}

	public String getTenNXB() {
		return tenNXB;
	}

	public void setTenNXB(String tenNXB) {
		this.tenNXB = tenNXB;
	}

	public int getSoBanPhatHanh() {
		return soBanPhatHanh;
	}

	public void setSoBanPhatHanh(int soBanPhatHanh) {
		this.soBanPhatHanh = soBanPhatHanh;
	}

	public TaiLieu(int maTaiLieu, String tenNXB, int soBanPhatHanh) {
		super();
		this.maTaiLieu = maTaiLieu;
		this.tenNXB = tenNXB;
		this.soBanPhatHanh = soBanPhatHanh;
	}

	@Override
	public String toString() {
		return "Mã tài liệu: " + maTaiLieu + " - Tên NXB : " + tenNXB + " - Số bản phát hành : " + soBanPhatHanh;
	}

}

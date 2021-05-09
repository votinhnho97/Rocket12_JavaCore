package assignment4.Exercise5.QLTV;

import java.util.Date;

public class Bao extends TaiLieu {
	private Date ngayPhatHanh;

	public Date getNgayPhatHanh() {
		return ngayPhatHanh;
	}

	public void setNgayPhatHanh(Date ngayPhatHanh) {
		this.ngayPhatHanh = ngayPhatHanh;
	}

	public Bao(int maTaiLieu, String tenNXB, int soBanPhatHanh, Date ngayPhatHanh) {
		super(maTaiLieu, tenNXB, soBanPhatHanh);
		this.ngayPhatHanh = ngayPhatHanh;
	}

	@Override
	public String toString() {
		return super.toString() + " - Ngày phát hành: " + ngayPhatHanh;
	}

}

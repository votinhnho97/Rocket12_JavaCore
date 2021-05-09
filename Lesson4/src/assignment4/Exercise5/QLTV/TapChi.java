package assignment4.Exercise5.QLTV;

import java.util.Date;

public class TapChi extends TaiLieu {
	private int soPhatHanh;
	private Date thangPhatHanh;

	public int getSoPhatHanh() {
		return soPhatHanh;
	}

	public void setSoPhatHanh(int soPhatHanh) {
		this.soPhatHanh = soPhatHanh;
	}

	public Date getThangPhatHanh() {
		return thangPhatHanh;
	}

	public void setThangPhatHanh(Date thangPhatHanh) {
		this.thangPhatHanh = thangPhatHanh;
	}

	public TapChi(int maTaiLieu, String tenNXB, int soBanPhatHanh, int soPhatHanh, Date thangPhatHanh) {
		super(maTaiLieu, tenNXB, soBanPhatHanh);
		this.soPhatHanh = soPhatHanh;
		this.thangPhatHanh = thangPhatHanh;
	}

	@Override
	public String toString() {
		return super.toString() + " - Số phát hành: " + soPhatHanh + " - Tháng phát hành: " + thangPhatHanh;
	}

}

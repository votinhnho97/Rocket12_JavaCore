package assignment4.Exercise5.QLTV;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class QuanLySach {
	private ArrayList<TaiLieu> dsTaiLieu;
	private SimpleDateFormat dateFormat;

	public QuanLySach() {
		dsTaiLieu = new ArrayList<TaiLieu>();
		dateFormat = new SimpleDateFormat("MM-dd-yyyy");
	}

	public void themMoiTaiLieu(int maTaiLieu, String tenNXB, int soBanPhatHanh, int loaiTaiLieu, String[] thongTinThem)
			throws ParseException {
		switch (loaiTaiLieu) {
		case 1:
			// Sách
			Sach s = new Sach(maTaiLieu, tenNXB, soBanPhatHanh, thongTinThem[0], Integer.valueOf(thongTinThem[1]));
			dsTaiLieu.add(s);
			break;
		case 2:
			// Tạp chí
			int soPhatHanh = Integer.valueOf(thongTinThem[0]);
			Date thangPhatHanh = dateFormat.parse(thongTinThem[1]);

			TapChi tc = new TapChi(maTaiLieu, tenNXB, soBanPhatHanh, soPhatHanh, thangPhatHanh);
			dsTaiLieu.add(tc);
			break;
		case 3:
			// Báo
			Date ngayPhatHanh = dateFormat.parse(thongTinThem[0]);

			Bao b = new Bao(maTaiLieu, tenNXB, soBanPhatHanh, ngayPhatHanh);
			dsTaiLieu.add(b);
			break;
		default:
			break;
		}
	}

	public void xoaTaiLieu(int maTaiLieu) {
		for (int i = 0; i < dsTaiLieu.size(); i++) {
			if (dsTaiLieu.get(i).getMaTaiLieu() == maTaiLieu) {
				dsTaiLieu.remove(i);
				i--;
			}
		}
	}

	public void hienThiThongTin() {
		for (TaiLieu taiLieu : dsTaiLieu) {
			System.out.println(taiLieu.toString());
		}
	}

	public void timKiemTaiLieu(int loaiTaiLieu) {
		
	}
}

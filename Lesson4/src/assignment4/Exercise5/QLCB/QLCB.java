package assignment4.Exercise5.QLCB;

import java.util.ArrayList;

public class QLCB {
	private ArrayList<CanBo> dsCanBo;

	public QLCB() {
		dsCanBo = new ArrayList<CanBo>();
	}

	public void themMoiCanBo(int id, String hoTen, int tuoi, Gender gioiTinh, String diaChi, int i,
			String thuocTinhThem) {
		switch (i) {
		case 1:
			// Công nhân
			CongNhan cn = new CongNhan(id, hoTen, tuoi, gioiTinh, diaChi, Short.valueOf(thuocTinhThem));
			dsCanBo.add(cn);
			break;
		case 2:
			// Kỹ sư
			KySu ks = new KySu(id, hoTen, tuoi, gioiTinh, diaChi, thuocTinhThem);
			dsCanBo.add(ks);
			break;
		case 3:
			// Nhân viên
			NhanVien nv = new NhanVien(id, hoTen, tuoi, gioiTinh, diaChi, thuocTinhThem);
			dsCanBo.add(nv);
			break;
		default:
			break;
		}
	}

	public ArrayList<CanBo> timKiemTheoHoTen(String hoTen) {
		ArrayList<CanBo> results = new ArrayList<CanBo>();
		for (CanBo cb : dsCanBo) {
			if (cb.getHoTen().equals(hoTen)) {
				results.add(cb);
			}
		}
		return results;
	}

	public void hienThiThongTin() {
		for (CanBo cb : dsCanBo) {
			System.out.println(cb.toString());
		}
	}

	public void xoaCanBo(String hoTen) {
		for (int i = 0; i < dsCanBo.size(); i++) {
			if (dsCanBo.get(i).getHoTen().equals(hoTen)) {
				dsCanBo.remove(i);
				i--;
			}
		}
	}

	public void thoat() {

	}
}

package assignment4.Exercise5.QLCB;

public class CongNhan extends CanBo {
	private short capBac;

	public CongNhan(int id, String hoTen, int tuoi, Gender gioiTinh, String diaChi, short capBac) {
		super(id, hoTen, tuoi, gioiTinh, diaChi);
		this.capBac = capBac;
	}

	public short getCapBac() {
		return capBac;
	}

	public void setCapBac(short capBac) {
		this.capBac = capBac;
	}

	@Override
	public String toString() {
		return super.toString() + " - Cấp bậc: " + capBac;
	}
	
}

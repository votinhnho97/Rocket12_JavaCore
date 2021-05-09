package assignment4.Exercise5.QLCB;

public class KySu extends CanBo {
	private String nganhDaoTao;

	public KySu(int id, String hoTen, int tuoi, Gender gioiTinh, String diaChi, String nganhDaoTao) {
		super(id, hoTen, tuoi, gioiTinh, diaChi);
		this.nganhDaoTao = nganhDaoTao;
	}

	public String getNganhDaoTao() {
		return nganhDaoTao;
	}

	public void setNganhDaoTao(String nganhDaoTao) {
		this.nganhDaoTao = nganhDaoTao;
	}

	@Override
	public String toString() {
		return super.toString() +  " - Ngành đào tạo: " + nganhDaoTao;
	}

}

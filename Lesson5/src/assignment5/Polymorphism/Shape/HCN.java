package assignment5.Polymorphism.Shape;

public class HCN {
	private float chieuDai;
	private float chieuRong;

	public HCN(float chieuDai, float chieuRong) {
		super();
		this.chieuDai = chieuDai;
		this.chieuRong = chieuRong;
	}

	public float getChieuDai() {
		return chieuDai;
	}

	public void setChieuDai(float chieuDai) {
		this.chieuDai = chieuDai;
	}

	public float getChieuRong() {
		return chieuRong;
	}

	public void setChieuRong(float chieuRong) {
		this.chieuRong = chieuRong;
	}

	public float tinhChuVi() {
		System.out.println("Tính chu vi theo HCN");
		return 2 * (chieuDai + chieuRong);
	}

	public float tinhDienTich() {
		System.out.println("Tính diện tích theo HCN");
		return chieuDai * chieuRong;
	}
}

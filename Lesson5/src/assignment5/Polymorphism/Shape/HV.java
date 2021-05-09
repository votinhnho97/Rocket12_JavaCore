package assignment5.Polymorphism.Shape;

public class HV extends HCN {
	private float canh;

	public HV(float canh) {
		super(canh, canh);
		this.canh = canh;
	}

	public float getCanh() {
		return canh;
	}

	public void setCanh(float canh) {
		this.canh = canh;
	}

	@Override
	public float tinhChuVi() {
		System.out.println("Tính chu vi theo HV");
		return super.tinhChuVi();
	}

	@Override
	public float tinhDienTich() {
		System.out.println("Tính diện tích theo HV");
		return super.tinhDienTich();
	}
}

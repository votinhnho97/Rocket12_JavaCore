package assignment5.Polymorphism.Shape;

public class Program {
	public static void main(String[] args) {
		HCN hcn = new HCN(1f, 3f);
		HV hv = new HV(5f);
		System.out.println(hcn.tinhChuVi());
		System.out.println(hcn.tinhDienTich());
		System.out.println(hv.tinhChuVi());
		System.out.println(hv.tinhDienTich());
	}
}

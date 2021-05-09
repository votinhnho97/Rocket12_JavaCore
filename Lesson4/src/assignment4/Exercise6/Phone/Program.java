package assignment4.Exercise6.Phone;

public class Program {
	public static void main(String[] args) {
		VietnamesePhone v = new VietnamesePhone();
		v.insertContact("Trung", "0987654321");
		v.removeContact("Trung");
		v.updateContact("Trung", "0123456789");
		v.searchContact("Trung");
	}
}

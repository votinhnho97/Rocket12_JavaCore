package assignment3;

/*
 * private: chỉ được sử dụng bên trong lớp, các hàm trong lớp
 * protected: những lớp cùng chung package truy cập được và trong lớp kế thừa của nó
 * default: những lớp cùng chung package truy cập được
 * public: bất kỳ ở đâu cũng có thể gọi ra được.
 * 
 */
public class Exercise3 {
	public static void main(String[] args) {
		q1();
		q2();
		q3();
	}

	private static void q1() {
		Integer luong = new Integer(5000);
		float luongFloat = luong.floatValue();
		System.out.printf("Lương (float): %.2f\n", luongFloat);
	}

	private static void q2() {
		String str = "1234567";
		int str2Int = Integer.valueOf(str);
		System.out.println("String to Int: " + str2Int);
	}

	private static void q3() {
		Integer number1 = new Integer("1234567");
		int number2 = number1.intValue();
	}
}

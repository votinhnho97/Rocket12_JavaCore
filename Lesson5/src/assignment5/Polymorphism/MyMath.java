package assignment5.Polymorphism;

public class MyMath {
	public static void main(String[] args) {
		System.out.println(sum(1, 2));
		System.out.println(sum(1f,2f));
		System.out.println(sum((byte)1, (byte)2));
	}

	private static int sum(int a, int b) {
		return a + b;
	}

	private static float sum(float a, float b) {
		return a + b;
	}

	private static byte sum(byte a, byte b) {
		return (byte) (a + b);
	}
}

package assignment2;

import java.time.LocalDate;
import java.util.Random;

public class Exercise4 {
	public static void main(String[] args) {
		q4();
	}

	static void q4() {
		// Question 4
		Random random = new Random();
		int minDay = (int) LocalDate.of(1995, 07, 24).toEpochDay();
		int maxDay = (int) LocalDate.of(1995, 12, 20).toEpochDay();
		long randomInt = minDay + random.nextInt(maxDay - minDay);
		LocalDate randomDay = LocalDate.ofEpochDay(randomInt);
		System.out.println(randomDay);
	}

	static void q5() {
		// Question 5
		Random random = new Random();
		int maxDay = (int) LocalDate.now().toEpochDay();
		int minDay = maxDay - 365;
		long randomInt = minDay + random.nextInt(maxDay - minDay);
		LocalDate randomDay = LocalDate.ofEpochDay(randomInt);
		System.out.println(randomDay);
	}
}

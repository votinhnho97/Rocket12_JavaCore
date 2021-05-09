package com.vti.frontend;

import com.vti.backend.*;
import com.vti.entity.Student1;

public class Program3 {
	public static void main(String[] args) {
		Exercise3 e = new Exercise3();
		e.q1();
		
		Student1 s1 = new Student1("Trung");
		e.q2(s1);
		e.q2(4);
		e.q2(4.0f);

		Integer arrInt[] = { 1, 2, 3, 4, 5 };
		Float arrFloat[] = { 1f, 2f, 3f, 4f, 5f };
		Double arrDouble[] = { 1d, 2d, 3d, 4d, 5d };
		e.q4(arrInt);
		e.q4(arrFloat);
		e.q4(arrDouble);

		e.q5();
		
		e.q6();
		
		e.q7();
		
		e.q8();
	}
}

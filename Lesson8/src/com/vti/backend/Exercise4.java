package com.vti.backend;

import com.vti.entity.MyMath;
import com.vti.entity.Salary;

public class Exercise4 {
	public void q1() {
		System.out.println("=============================");
		Salary<Number> s = new Salary<Number>(123.5f);
		s.showSalaries();
	}
	
	public void q3() {
		System.out.println("=============================");
		System.out.println(MyMath.max(10.9f, 2f));
	}
	
	public void q4() {
		System.out.println("=============================");
		MyMath<Number> math = new MyMath<Number>();
		// a) tính tổng của 2 số
		System.out.println(math.add(10.2f, 20.6f));
		System.out.println("=============================");
		// b) tính tổng của 3 số
		System.out.println(math.add(10.2f, 20.6f, 30d));
		System.out.println("=============================");
		// c) tính tổng của 4 số
		System.out.println(math.add(10.2f, 20.6f, 30d));
		System.out.println("=============================");
		// d) tính hiệu của 2 số
		
		System.out.println("=============================");
		// e) hàm tính số mũ (a,b)
		
	}
}

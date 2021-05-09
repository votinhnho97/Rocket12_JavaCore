package com.vti.backend;

import com.vti.entity.*;

public class Exercise3 {
	public void q1() {
		Student2<Integer> s1 = new Student2<Integer>(1, "Trung");
		Student2<Long> s2 = new Student2<Long>(1l, "Trung");
		Student2<Float> s3 = new Student2<Float>(1.0f, "Trung");
		System.out.println("=============================");
		System.out.println(s1.toString());
		System.out.println(s2.toString());
		System.out.println(s3.toString());
	}

	public <T> void q2(T t) {
		System.out.println("=============================");
		System.out.println(t.toString());
	}

	public <T> void q4(T[] arrayNumber) {
		System.out.println("=============================");
		for (T number : arrayNumber) {
			System.out.println(number);
		}
	}

	public void q5() {
		Integer[] salariesInt = { 1000, 2000, 5000 };
		Employee<Integer> e1 = new Employee<Integer>("NV1", salariesInt);
		System.out.println("=============================");
		e1.showInfo1();
		e1.showInfo2();
		
		Float[] salariesFloat = { 3000f, 5000f, 6000f };
		Employee<Float> e2 = new Employee<Float>("NV2", salariesFloat);
		System.out.println("=============================");
		e2.showInfo1();
		e2.showInfo2();
		
		Double[] salariesDouble = { 1000d, 2000d, 5000d, 5500.9d };
		Employee<Double> e3 = new Employee<Double>("NV3", salariesDouble);
		System.out.println("=============================");
		e3.showInfo1();
		e3.showInfo2();
	}
	
	public void q6() {
		MyMap<Integer, String> student = new MyMap<Integer, String>(1, "Trung");
		System.out.println("=============================");
		System.out.println(student.getKey());
		System.out.println(student.getValue());
	}
	
	public void q7() {
		Phone<String> p1 = new Phone<String>("trung@gmail.com", "123456789");
		System.out.println("=============================");
		System.out.println(p1.getPhoneNumber());
		System.out.println(p1.getKey());
		
		Phone<Integer> p2 = new Phone<Integer>(1, "123456789");
		System.out.println("=============================");
		System.out.println(p2.getPhoneNumber());
		System.out.println(p2.getKey());
		
		Phone<String> p3 = new Phone<String>("trung", "123456789");
		System.out.println("=============================");
		System.out.println(p3.getPhoneNumber());
		System.out.println(p3.getKey());
	}
	
	public void q8() {
		Staff<Integer> s1 = new Staff<Integer>(1, "123456789");
		System.out.println("=============================");
		System.out.println(s1.getName());
		System.out.println(s1.getID());
		
		Staff<Long> s2 = new Staff<Long>(2l, "123456789");
		System.out.println("=============================");
		System.out.println(s2.getName());
		System.out.println(s2.getID());
	}
}
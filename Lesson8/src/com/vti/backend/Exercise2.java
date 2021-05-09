package com.vti.backend;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.vti.entity.SortByDate;
import com.vti.entity.SortByName;
import com.vti.entity.SortByPoint;
import com.vti.entity.Student;

public class Exercise2 {
	private List<Student> students;
	private SimpleDateFormat dateFormat = new SimpleDateFormat("mm-DD-yyyy");
	
	public Exercise2() throws ParseException {
		super();
		students = new ArrayList<Student>();
		students.add(new Student("Trung", dateFormat.parse("08-09-1997"), 9.5f));
		students.add(new Student("Trung", dateFormat.parse("08-10-1997"), 5.5f));
		students.add(new Student("Binh", dateFormat.parse("08-09-1997"), 6.5f));
		students.add(new Student("Ha", dateFormat.parse("08-10-1997"), 9.5f));
		students.add(new Student("Tinh", dateFormat.parse("09-09-1997"), 8.5f));
	}

	public void q1() throws ParseException {
		System.out.println("Before sort by Name");
		for (Student student : students) {
			System.out.println(student.toString());
		}
		Collections.sort(students);
		System.out.println("After sort by Name");
		for (Student student : students) {
			System.out.println(student.toString());
		}
	}

	public void q2() {
		System.out.println("Before sort by Name");
		for (Student student : students) {
			System.out.println(student.toString());
		}
		Collections.sort(students, new SortByName().thenComparing(new SortByDate().thenComparing(new SortByPoint())));
		System.out.println("After sort by Name > Date > Point");
		for (Student student : students) {
			System.out.println(student.toString());
		}
	}
}

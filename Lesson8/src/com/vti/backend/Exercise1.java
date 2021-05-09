package com.vti.backend;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.vti.entity.*;

public class Exercise1 {
	public void q1() {
		List<Student1> students = new ArrayList<Student1>();
		for (int i = 0; i < 3; i++) {
			students.add(new Student1("Trung"));
		}
//		a) In ra tổng số phần tử của students
		System.out.println(students.size());

//		b) Lấy phần tử thứ 4 của students

//		c) In ra phần tử đầu và phần tử cuối của students
		System.out.println("First: " + students.get(0).toString());
		System.out.println("Last:" + students.get(students.size() - 1).toString());

//		d) Thêm 1 phần tử vào vị trí đầu của students
		students.add(0, new Student1("Nam"));
//		e) Thêm 1 phần tử vào vị trí cuối của students
		students.add(new Student1("Quý"));
		for (Student1 student : students) {
			System.out.println(student.toString());
		}
//		f) Đảo ngược vị trí của students
		Collections.reverse(students);
		System.out.println("\n\nREVERSE");
		for (Student1 student : students) {
			System.out.println(student.toString());
		}
//		g) Tạo 1 method tìm kiếm student theo id
		System.out.println("\n\nTìm kiếm Student theo ID");
		for (Student1 student : q1_g(1, students)) {
			System.out.println(student.toString());
		}
//		h) Tạo 1 method tìm kiếm student theo name
		System.out.println("\n\nTìm kiếm Student theo Name");
		for (Student1 student : q1_h("Nam", students)) {
			System.out.println(student.toString());
		}
//		i) Tạo 1 method để in ra các student có trùng tên
		System.out.println("\n\nStudent trùng tên");
		for (Student1 student : q1_h("Trung", students)) {
			System.out.println(student.toString());
		}
//		j) Xóa name của student có id = 2;
		students.get(1).setName("");
//		k) Delete student có id = 5;
		q1_k(5, students);
//		l) Tạo 1 ArrayList tên là studentCopies và add tất cả students vào studentCopies
		List<Student1> studentCopies = new ArrayList<Student1>(students);
		System.out.println("\n\nSRC");
		for (Student1 student : students) {
			System.out.println(student);
		}
		System.out.println("\n\nDEST");
		for (Student1 student : studentCopies) {
			System.out.println(student);
		}
	}

	public void q6() {
		Map<Integer, String> students = new HashMap<Integer, String>();
		students.put(0, "Trung");
		students.put(1, "Trung");
		students.put(2, "Phong");
		students.put(3, "Nam");
		// Question 7
		// In ra các key của students
		System.out.println(students.keySet());
		// In ra các values của students
		System.out.println(students.values());
		// In ra danh sách students được sắp xếp theo tên của student
		List<String> valuesSort = new ArrayList<String>(students.values());
		Collections.sort(valuesSort);
		System.out.println(valuesSort);
		// Chuyển đổi Map sang Set
		Set<String> valuesSet = new HashSet<String>(students.values());
		System.out.println(valuesSet);
	}

	public List<Student1> q1_g(int id, List<Student1> students) {
		List<Student1> tmp = new ArrayList<Student1>();
		for (Student1 student : students) {
			if (student.getId() == id)
				tmp.add(student);
		}
		return tmp;
	}

	public List<Student1> q1_h(String name, List<Student1> students) {
		List<Student1> tmp = new ArrayList<Student1>();
		for (Student1 student : students) {
			if (student.getName().equals(name))
				tmp.add(student);
		}
		return tmp;
	}

	public List<Student1> q1_i(String name, List<Student1> students) {
		return q1_h(name, students);
	}

	public void q1_k(int id, List<Student1> students) {
		for (Student1 student : students) {
			if (student.getId() == id)
				students.remove(id);
		}
	}
}

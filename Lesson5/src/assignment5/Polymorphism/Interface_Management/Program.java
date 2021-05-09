package assignment5.Polymorphism.Interface_Management;

import java.util.ArrayList;

public class Program {
	public static void main(String[] args) {
		ArrayList<Student> students = new ArrayList<Student>();

		// Tạo 10 học sinh, chia thành 3 nhóm
		for (int i = 0; i < 10; i++) {
			Student s = new Student(i, "HocSinh" + i);
			s.setGroup(i % 3 + 1);
			students.add(s);
		}

		// Kêu gọi cả lớp điểm danh.
		for (Student student : students) {
			student.diemDanh();
		}

		// Gọi nhóm 1 đi học bài
		for (Student student : students) {
			if (student.getGroup() == 1)
				student.hocBai();
		}

		// Gọi nhóm 2 đi dọn vệ sinh
		for (Student student : students) {
			if (student.getGroup() == 2)
				student.diDonVeSinh();
		}
	}
}

package demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Collections_Test {
	public static void main(String[] args) {
//		List<Integer> arrList = new ArrayList<Integer>(2);
//		// Thêm vào danh sách, mặc định thêm vào cuối danh sách
//		arrList.add(5);
//		arrList.add(6);
//		// a = [5, 6]
//		// b = new int[3]; (x1,5) mảng ban đầu = [0, 0, 0]
//		arrList.add(7);
//		//b = [5, 6, 7]
//		arrList.add(8);
//		// Duyệt phần tử đi từ trái sang
//		System.out.println(arrList.indexOf(6));;
//		// Duyệt phần tử đi từ phải sang
//		System.out.println(arrList.lastIndexOf(6));
//		
//		// Sửa phần tử
//		arrList.set(0, 10);
//		System.out.println(arrList);

//		Set<Integer> set = new TreeSet<Integer>();
//		set.add(5);
//		set.add(2);
//		set.add(6);
//		set.add(3);
//		set.add(1);
//		for(Integer number : set) {
//			System.out.println(number);
//		}

//		Map<String, String> hocViens = new HashMap<String, String>();
//		hocViens.put("Kien", "Mac");
//		hocViens.put("Chuc", "Dell");
//		hocViens.put("Thuy", "Dell");
//		
//		System.out.println(hocViens.get("Thuy"));
//		// Kiểm tra Key(Value) có trong Map không.
//		System.out.println(hocViens.containsKey("Trung"));
//		
//		// Xóa theo Key
//		hocViens.remove("Kien");
//		
//		// Sửa
//		hocViens.replace("Chuc", "Mac");
		
		List<Student> students = new ArrayList<Student>();
		students.add(new Student("Kien", 8, 20));
		students.add(new Student("Binh", 8, 19));
		students.add(new Student("Long", 9, 18));
		students.add(new Student("Ha", 7, 22));
		
		Collections.sort(students, new SortByAge());
		for (Student student : students) {
			System.out.println(student.toString());
		}
		System.out.println("-------------");
		Collections.sort(students, new SortByMark());
		for (Student student : students) {
			System.out.println(student.toString());
		}
		System.out.println("-------------");
		Collections.sort(students, new SortByMark().thenComparing(new SortByAge()));
		for (Student student : students) {
			System.out.println(student.toString());
		}
	}
}

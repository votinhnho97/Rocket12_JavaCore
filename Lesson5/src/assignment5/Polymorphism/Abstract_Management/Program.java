package assignment5.Polymorphism.Abstract_Management;

public class Program {
	public static void main(String[] args) {
		Person[] persons = new Person[3];
		persons[0] = new Person();
		persons[0].inputInfo();
		persons[1] = new Student();
		persons[1].inputInfo();
		persons[2] = new Student();
		persons[2].inputInfo();

		persons[0].scan.close();

		for (int i = 0; i < persons.length; i++) {
			persons[i].showInfo();
			if (persons[i] instanceof Student) {
				System.out.println(((Student) persons[i]).checkHocBong() ? "Đạt HB" : "Không đạt HB");
			}
		}
	}
}

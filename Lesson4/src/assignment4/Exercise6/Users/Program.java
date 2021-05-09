package assignment4.Exercise6.Users;

public class Program {
	public static void main(String[] args) {
		Employee e = new Employee("Employee", 1.2d);
		e.displayInfo();
		Manager m = new Manager("Manager", 1.2d);
		m.displayInfo();
		Waiter w = new Waiter("Waiter", 1.2d);
		w.displayInfo();
	}
}

package assignment4.Exercise6.Users;

public class Employee extends User {
	public Employee(String name, double salaryRatio) {
		super(name, salaryRatio);
	}

	@Override
	public double calculatePay() {
		return getSalaryRatio() * 420;
	}
}

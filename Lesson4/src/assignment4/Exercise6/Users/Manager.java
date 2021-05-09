package assignment4.Exercise6.Users;

public class Manager extends User {
	public Manager(String name, double salaryRatio) {
		super(name, salaryRatio);
	}

	@Override
	public double calculatePay() {
		return getSalaryRatio() * 520;
	}
}

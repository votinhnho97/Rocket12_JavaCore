package assignment4.Exercise6.Users;

public abstract class User {
	private String name;
	private double salaryRatio;

	public User(String name, double salaryRatio) {
		super();
		this.name = name;
		this.salaryRatio = salaryRatio;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalaryRatio() {
		return salaryRatio;
	}

	public void setSalaryRatio(double salaryRatio) {
		this.salaryRatio = salaryRatio;
	}

	public abstract double calculatePay();

	public void displayInfo() {
		System.out.println("Name: " + name + " - Salary ratio: " + salaryRatio + " - Pay: " + calculatePay());
	}
}

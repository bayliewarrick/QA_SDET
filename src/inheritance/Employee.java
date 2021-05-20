package inheritance;

public class Employee extends Person {
	
	private double annualSalary;
	private double weeklySalary;

	
	public Employee() {
		this("unknown", 0.0);
	}

	public Employee(String name, double annualSalary) {
		// TODO Auto-generated constructor stub
		super.name = name;
		this.annualSalary = annualSalary;
	}
	
	public double calculateWeeklySalary() {
		return this.annualSalary / 52;
	}

	public double getAnnualSalary() {
		return annualSalary;
	}

	public void setAnnualSalary(double annualSalary) {
		this.annualSalary = annualSalary;
	}

	public double getWeeklySalary() {
		return weeklySalary;
	}
	

}

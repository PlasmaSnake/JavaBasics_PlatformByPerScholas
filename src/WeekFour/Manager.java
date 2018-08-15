package WeekFour;

public class Manager extends Employee{
	
	Manager(long id, String name, String address, long phone, double salary){
		super(id, name, address, phone);
		setBasicSalary(salary);
	}
	
	public double calculateTransportAllowance() {
		double allowance = (double)15/(double)100*basicSalary;
		System.out.printf("Travel Allowance is: %.2f\n", allowance);
		return allowance;
	}
	
}

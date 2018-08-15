package WeekFour;

public class Employee {

	protected long employeeID;
	protected String employeeName;
	protected String employeeAddress;
	protected long employeePhone;
	protected double basicSalary;
	protected double specialAllowance;
	protected double Hra;
	
	public Employee(){
		specialAllowance = 250.8;
		Hra = 1000.5;
	}
	
	public Employee(long id, String name, String address, long phone ){
		this();
		employeeID = id;
		employeeName = name;
		employeeAddress = address;
		employeePhone = phone;
	}
	
	public double calculateSalary() {
		double salary = basicSalary + (basicSalary * specialAllowance/100) + (basicSalary*Hra/100);	
		System.out.printf("Salary is: %.2f\n", salary);
		return salary;
	}
	
	public double calculateTransportAllowance() {
		double allowance = (.1)*basicSalary;
		System.out.printf("Travel Allowance is: %.2f\n", allowance);
		return allowance;
	}

	public long getEmployeeID() {
		return employeeID;
	}

	public void setEmployeeID(long employeeID) {
		this.employeeID = employeeID;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getEmployeeAddress() {
		return employeeAddress;
	}

	public void setEmployeeAddress(String employeeAddress) {
		this.employeeAddress = employeeAddress;
	}

	public long getEmployeePhone() {
		return employeePhone;
	}

	public void setEmployeePhone(long employeePhone) {
		this.employeePhone = employeePhone;
	}

	public double getBasicSalary() {
		return basicSalary;
	}

	public void setBasicSalary(double basicSalary) {
		this.basicSalary = basicSalary;
	}

	public double getSpecialAllowance() {
		return specialAllowance;
	}

	public void setSpecialAllowance(double specialAllowance) {
		this.specialAllowance = specialAllowance;
	}

	public double getHra() {
		return Hra;
	}

	public void setHra(double hra) {
		Hra = hra;
	}
	
}

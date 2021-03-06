package WeekFour;
/* 1. OOP
 *  	a. Constructors - Person.java class and Shape.java class
 * 		b. Student Exercise
 * 		c. Employee
 * 2. Exception handling 
 */		
public class Exercises {

	public static void main(String[] args) {
//		Person bob = new Person("Bob", 24, "Microcenter", "Cashier", "Biking");
//		bob.displayInfo();
//		Shape circle = new Shape(2.5);
//		Shape rectangle = new Shape(10, 5);
//		Student s1 = new Student("0001", "Gabriel", "Michael", "mgabriel@perscholas.org", "123-456-7890");
//		Student s2 = new Student();
//		s2.setEmail("bvasquez@perscholas.org");
//		s2.setFirstName("Bairon");
//		s2.setLastName("Vasquez");
//		s2.setId("0002");
//		s2.setPhone("123-456-7890");
//		displayInfo(s1);
//		displayInfo(s2);
		
//		Manager m1 = new Manager(1001,"Bob","123 Fake Street", 12345678, 65000 );
//		Trainee t1 = new Trainee(1002,"Rob","321 Fake Street", 87654321, 45000 );
//		System.out.print("Manager's ");
//		m1.calculateSalary();
//		System.out.print("Trainee's ");
//		t1.calculateSalary();
//		System.out.print("Manager's ");
//		m1.calculateTransportAllowance();
//		System.out.print("Trainee's ");
//		t1.calculateTransportAllowance();
		
		double tax = TaxCalculator.calculateTax("s", true, 19999d);
		System.out.println(tax);
		
	}

	public static void displayInfo(Student s) {
		System.out.printf("ID: %s\n"
				+ "Name: %s %s\n"
				+ "Email: %s\n"
				+ "Phone #: %s\n", s.getId(), s.getFirstName(), s.getLastName(), s.getEmail(), s.getPhone());
	}
}

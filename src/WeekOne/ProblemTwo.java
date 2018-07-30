package WeekOne;
import java.util.Scanner;
public class ProblemTwo {
	public static void main(String[] args) {
		String name;
		int age;
		double wage;
		Scanner in = new Scanner(System.in);
		
		System.out.print("Hello. What's your name? ");
		name = in.next();
		
		System.out.printf("Hi, %s! How old are you? ", name);
		age = in.nextInt();
		
		System.out.printf("So you're %d, eh? That's not old at all!\n"
				+ "How much do you make, %s? ", age, name);
		wage = in.nextDouble();
		
		System.out.printf("%.2f! I hope that's per hour and not per year! \n", wage);
		////////////End of Problem 1
		String lname, fname, login;
		int grade, id;
		double gpa;
		System.out.print("Please enter the following information so I can sell it for a profit! \nFirst Name: ");
		fname = in.next();
		System.out.print("Last Name: ");
		lname = in.next();
		System.out.print("Grade between 9th and 12th ");
		grade = in.nextInt();
		System.out.print("Student ID: ");
		id = in.nextInt();
		System.out.print("Login Name: ");
		login = in.next();
		System.out.print("GPA (0.0 to 4.0): ");
		gpa = in.nextDouble();
		
		System.out.printf("Your Information:\nLogin: %s\n"
				+ "ID: %s\n"
				+ "Name: %s, %s\n"
				+ "GPA: %.1f\n"
				+ "Grade: %d\n", login, id, lname, fname, gpa, grade);
		////////////End of Problem 2
		System.out.print("Greetings. What is your name? ");
		name = in.next();
		
		System.out.printf("%s? What a strange name. You don't seem that much older than I do."
				+ "\nWhat's your age in human years? ", name);
		age = in.nextInt();
		
		System.out.printf("Wow I could've sworn you were %d. Did you know if you added ten years to that"
				+ " you would have my age? I'm %d!\n", (age-5), (age+5));
		////////////End of Problem 3
		double n1,n2,n3;
		System.out.print("Enter Three Numbers: ");
		n1 = in.nextDouble();
		n2 = in.nextDouble();
		n3 = in.nextDouble();
		double result = (n1+n2+n3)/2;
		System.out.printf("(%.1f + %.1f + %.1f) / 2 = %.2f\n", n1,n2,n3,result);
		////////////End of Problem 4
		System.out.print("Your body weight in kilograms? ");
		double weight = in.nextDouble();
		System.out.print("Your height in meters? ");
		double height = in.nextDouble();
		System.out.printf("Your BMI is %f\n", weight/(Math.pow(height, 2)));
		in.close();
		////////////End of Problem 5
	}
}

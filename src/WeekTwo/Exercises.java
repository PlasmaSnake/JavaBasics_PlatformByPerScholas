package WeekTwo;

import java.util.Scanner;

// Week Two In-Class lab exercises
// 1. Method Overloading
// 2. Math (random) and Type Broadening
// 3. Substrings
// 4. Conditionals
// 4a. Conditionals w/ BMI
// 4b. Conditionals w/ Taxes
// 5. Logical operators
public class Exercises {

	public static void main(String[] args) {
		// uncomment to test
	// 	System.out.println(max(1,2)); //test for max [wont work b.c. mismatched type]
	//	System.out.printf("Random Character: %s", randCharGenerator() );
	//	phoneFormatter("6462312422");
	//	addQuestion();
	//	determineBMI();
	//	computeTaxes();
		isDivisible();
	}
	
	//Method Overloading 
	public static double max(int num1, double num2) {
		if (num1 < num2) return num2;
		return num1;
	}
	
	public static double max(double num1, int num2) {
		if (num1 < num2) return num2;
		return num1;
	}
	//End Method Overloading 
	
	//Random number generator that produces a character from just A-Z
	public static char randCharGenerator() {
		int randomNumber = 65 + (int)(Math.random()*27);
		// char version of randomNumber
		//return (char)('a' + (Math.random()*('z'-'a'+1)));
		return (char)randomNumber;
	}
	//End Math and Type Broadening Exercise
	
	// Formats phone number by substring
	public static void phoneFormatter(String phoneNumber) {
		//expects a 10 digit number.
		System.out.printf("Formatted: (%s)%s-%s",
				phoneNumber.substring(0,3),
				phoneNumber.substring(3,6),
				phoneNumber.substring(6));
	// End Substring method
	}
	// Add two random number and query user for answer
	public static void addQuestion() {
		Scanner in = new Scanner(System.in);
		int n1 = (int)(Math.random()*100), n2 = (int)(Math.random()*100);
		System.out.printf("What is %d + %d? ", n1,n2);
		int answer = in.nextInt();
		if (n1+n2 == answer) System.out.print("You got it!");
		else System.out.printf("Wrong answer. It's %d", n1+n2); 
		in.close();
		}
	
	public static void determineBMI() {
		Scanner in = new Scanner(System.in);
		System.out.print("Your body weight in kilograms? ");
		double weight = in.nextDouble();
		System.out.print("Your height in meters? ");
		double height = in.nextDouble();
		double BMI = weight/(Math.pow(height, 2));
		String fatLevel = "";
		if (BMI < 18.5 ) fatLevel = "Underweight";
		else if (BMI < 25.0 ) fatLevel = "Normal";
		else if (BMI < 30.0 ) fatLevel = "Overweight";
		else if (BMI >= 30.0) fatLevel = "Obese";
		System.out.printf("Your BMI is %.2f. This is %s.\n", BMI, fatLevel);		
		in.close();
	}
	public static void computeTaxes() {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter your tax filing status:\n"
				+ "1 for Single\n"
				+ "2 for Married filing jointly\n"
				+ "3 for Married filing separately\n"
				+ "4 for Head of Household ");
		int houseStatus = in.nextInt();
		double taxRate;
		System.out.print("Enter your income: ");
		double income = in.nextDouble();
		
		switch (houseStatus) {
		case 1 : // Single
			if(income < 8351) taxRate = 10;
			else if (income < 33951) taxRate = 15;
			else if (income < 82251) taxRate = 25;
			else if (income < 171551) taxRate = 28;
			else if (income < 372951) taxRate = 33;
			else taxRate = 35; 
			System.out.printf("Tax rate is %.0f%%, tax amount is %.2f", 
					taxRate, income*taxRate/100);
			break;
		case 2 : // Married Filing Jointly
			if(income < 16701) taxRate = 10;
			else if (income < 67901) taxRate = 15;
			else if (income < 137051) taxRate = 25;
			else if (income < 208851) taxRate = 28;
			else if (income < 372951) taxRate = 33;
			else taxRate = 35; 
			System.out.printf("Tax rate is %.0f%%, tax amount is %.2f",
					taxRate, income*taxRate/100);
			break;
		case 3: // Married Filing Sep.
			if(income < 8351) taxRate = 10;
			else if (income < 33951) taxRate = 15;
			else if (income < 68526) taxRate = 25;
			else if (income < 104426) taxRate = 28;
			else if (income < 186476) taxRate = 33;
			else taxRate = 35; 
			System.out.printf("Tax rate is %.0f%%, tax amount is %.2f",
					taxRate, income*taxRate/100);
			break;
		case 4: // Head of Household
			if(income < 11950) taxRate = 10;
			else if (income < 45501) taxRate = 15;
			else if (income < 117451) taxRate = 25;
			else if (income < 190201) taxRate = 28;
			else if (income < 372951) taxRate = 33;
			else taxRate = 35; 
			System.out.printf("Tax rate is %.0f%%, tax amount is %.2f",
					taxRate, income*taxRate/100);
			break;
		default:
			System.out.print("Invalid input");
			break;
		}
		in.close();
	}	
	// End Conditional 
	// Logical Operators
	public static void isDivisible(){
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a number to see if divisible by two or three: ");
		int num = in.nextInt();
		boolean divByTwoAndThree = ((num % 2 == 0) && (num % 3 == 0));
		boolean divByTwoOrThree = ( num % 2 == 0 || num % 3 == 0);
		boolean divByTwoXorThree = ((num % 2) == 0 ^ (num % 3== 0));
		if (divByTwoOrThree) System.out.printf("%d is divisible by 2 or 3.\n", num);
		else System.out.printf("%d is not divisible by 2 or 3.", num);
		if (divByTwoAndThree) System.out.printf("%d is divisible by 2 and 3.\n", num);
		if (divByTwoXorThree) {
			if (num % 2 == 0)System.out.printf("%d is divisible only by 2.", num);
			else System.out.printf("%d is divisible by 3.", num);
		}
		in.close();
	}
}

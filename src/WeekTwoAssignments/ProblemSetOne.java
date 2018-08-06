package WeekTwoAssignments;

import java.util.Scanner;

public class ProblemSetOne {

	public static void main(String[] args) {
		
		ifStatement();
		legalProblems();
		carOrBus();
		specificLegalProblems();
		dayofWeek();
		spaceWeight();
	}
	//Problem One
	public static void ifStatement() {
		Scanner in = new Scanner(System.in);
		// Initialize integer variables with user input.
		int people, dogs, cats;
		System.out.print("Enter an amount of people: ");
		people = in.nextInt();
		System.out.print("Enter an amount of cats: ");
		cats = in.nextInt();
		System.out.print("Enter an amount of dogs: ");
		dogs = in.nextInt();
		
		// Conditional comparisons
		if (people < cats) System.out.print("Too many cats! The world is doomed!\n");
		if (people > cats) System.out.print("Too few cats! The world is saved for another day!\n");
		
		if (people < dogs) System.out.print("The world is drooled on!");
		if (people > dogs) System.out.print("The world is dry!");
		
		// No output if people are equal to dogs, or if people equal to cats
	} // End Problem 1
	public static void legalProblems() {
		Scanner in = new Scanner(System.in);
		System.out.print("\nWhat's your name? ");
		String name = in.nextLine();
		System.out.printf("What's your age, %s? ", name);
		int age = in.nextInt();
		if (age < 16) System.out.printf("You cannot drive, %s. " ,name);
		if (age < 18) System.out.printf("You cannot vote, %s. ", name);
		if (age < 25) System.out.printf("You cannot rent a car, %s. ", name);
		if (age >= 25) System.out.printf("%s, you can do anything that is legal.", name);
	} // End Problem 2
	public static void carOrBus() {
		Scanner in = new Scanner(System.in);
		// Initialize integer variables with user input.
		int people, cars, buses;
		System.out.print("\nEnter an amount of people: ");
		people = in.nextInt();
		System.out.print("Enter an amount of cars: ");
		cars = in.nextInt();
		System.out.print("Enter an amount of buses: ");
		buses = in.nextInt();
		
		// Conditional comparisons
		if (people < cars) System.out.print("We should take the cars.\n");
		else if (people > cars) System.out.print("We shouldn't take the cars.\n");
		else System.out.print("We can't decide.\n"); // people == cars case
		
		if (cars < buses) System.out.print("That's too many buses.\n");
		else if (cars > buses) System.out.print("Maybe we should take the buses?\n");
		else System.out.print("We still can't decide.\n");
		
		if (people > buses) System.out.print("Alright, let's just take the buses.");
		else System.out.print("Let's just take the cars.");
	} // End Problem 3
	public static void specificLegalProblems() {
		Scanner in = new Scanner(System.in);
		System.out.print("\nWhat's your name? ");
		String name = in.nextLine();
		System.out.printf("What's your age, %s? ", name);
		int age = in.nextInt();
		if (age < 16) System.out.printf("You cannot drive, %s." ,name);
		else if (age < 18) System.out.printf("You cannot vote, %s.", name);
		else if (age < 25) System.out.printf("You cannot rent a car, %s.", name);
		else if (age >= 25) System.out.printf("%s, you can do anything that is legal.", name);
	} // End Problem 4
	public static void dayofWeek() {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a number between 1-7 for the day: ");
		int day = in.nextInt();
		String dayName = new String();
		switch(day) {
		case 1:
			dayName = "Monday";
			break;
		case 2:
			dayName = "Tuesday";
			break;
		case 3:
			dayName = "Wednesday";
			break;
		case 4:
			dayName = "Thursday";
			break;
		case 5:
			dayName = "Friday";
			break;
		case 6:
			dayName = "Saturday";
			break;
		case 7:
			dayName = "Sunday";
			break;
		default:
			System.out.println("ERROR: Invalid input. ");
		}
		System.out.printf("Weekday %d is %s!", day, dayName);
	} //End Problem 5
	public static void spaceWeight() {
		Scanner in = new Scanner(System.in);
		System.out.print("\nEnter your weight on Earth: ");
		double weight = in.nextDouble();
		System.out.print("Enter a planet to calculate relative weight:\n"
				+ "1 Venus\n"
				+ "2 Mars\n"
				+ "3 Jupiter\n"
				+ "4 Saturn\n"
				+ "5 Uranus\n"
				+ "6 Neptune\n");
		int planet = in.nextInt();
		switch(planet) {
		case 1:
			weight *= 0.78;
			break;
		case 2:
			weight *= 0.39;
			break;
		case 3:
			weight *= 2.65;
			break;
		case 4:
			weight *= 1.17;
			break;
		case 5:
			weight *= 1.05;
			break;
		case 6:
			weight *= 1.23;
			break;
		default:
			System.out.println("ERROR: Invalid input. ");
		}
		System.out.printf("Your relative weight is %.2f!", weight);
		in.close();
	} //End problem 6
	
}
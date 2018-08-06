package WeekTwoAssignments;

import java.util.Scanner;


public class ProblemSetThree {
	public static void main(String[] args) {
		nameThatShape();
		
		displayDaysInMonth();
		
		nameThatTriangle();
		
		seasonFromMonthAndDay();
	}
	
	public static void nameThatShape() {
		Scanner in = new Scanner(System.in);
		System.out.print("Give number of sides to receive a shape! ");
		int sides = in.nextInt();
		String shape = new String();
		switch(sides) {
		case 3: shape = "triangle";
			break;
		case 4: shape = "quadrilateral";
			break;
		case 5: 
			shape = "pentagon";
			break;
		case 6: 
			shape = "hexagon";
			break;
		case 7: 
			shape = "heptagon";
			break;
		case 8: 
			shape = "octagon";
			break;
		case 9: 
			shape = "nonagon";
			break;
		case 10: 
			shape = "decagon";
			break;
		default:
			if (sides > 10) System.out.printf("%d is too high, my brian cannot compute." , sides);
			if (sides < 3) System.out.printf("%d is not a valid number. No shape can be made!" , sides);
			return;
		}
		System.out.printf("A %s can be made from %d sides." , shape, sides);
	}
	public static void displayDaysInMonth() {
		Scanner in = new Scanner(System.in);
		System.out.print("\nEnter a month to display the amount of days: ");
		String monthName = in.nextLine();
		int month = monthToDays(monthName);
		int[] monthDays = {31,28,31,30,31,30,31,31,30,31,30,31};
		int days = monthDays[month];
		if (month == 1) System.out.printf("There are %d OR %d days in February.", days, days+1);
		else System.out.printf("There are %d days in %s.", days, monthName);
	}
	// helper method for seasonFromMonthAndDays and displayDaysInMonth
	public static int monthToDays(String month) {
		int monthNumber = 0;
		switch(month.toLowerCase()) {
		case "january": 
			monthNumber = 0;
			break;
		case "february": 
			monthNumber = 1;
			break;
		case "march": 
			monthNumber = 2;
			break;
		case "april": 
			monthNumber = 3;
			break;
		case "may": 
			monthNumber = 4;
			break;
		case "june": 
			monthNumber = 5;
			break;
		case "july": 
			monthNumber = 6;
			break;
		case "august": 
			monthNumber = 7;
			break;
		case "september": 
			monthNumber = 8;
			break;
		case "october": 
			monthNumber = 9;
			break;
		case "november":
			monthNumber = 10;
			break;
		case "december": 
			monthNumber = 11;
			break;
		}
		return monthNumber;
	}
	
	static public void nameThatTriangle() {
		Scanner in = new Scanner(System.in);
		
		// 3 sides equal, 2 sides equal, 0 sides equal
		String[] triangleType = {"Equilateral", "Isoceles", "Scalene"};
		System.out.print("\nEnter a number for each side of a triangle:\n");
		int sideOne = in.nextInt(), sideTwo = in.nextInt(), sideThree = in.nextInt();
		if (sideOne == sideTwo)
		{
			if (sideOne == sideThree) System.out.printf("This triangle is a %s triangle." , triangleType[0]);
			else System.out.printf("This triangle is a %s triangle." , triangleType[1]);
		}
		else if (sideOne == sideThree) System.out.printf("This triangle is a %s triangle." , triangleType[1]);
		else if (sideTwo == sideThree) {
			System.out.printf("This triangle is a %s triangle." , triangleType[1]);
		}
		else System.out.printf("This triangle is a %s triangle." , triangleType[2]);
	}
	
	static public void seasonFromMonthAndDay() {
		Scanner in = new Scanner(System.in);
		// Array of the days of the month. 0 being January and 11 being December
		int[] monthDays = {31,28,31,30,31,30,31,31,30,31,30,31};
		System.out.print("\nInput the name of a month: ");
		String month = in.nextLine();
		System.out.print("Now, enter a day in numbers to get what season it is! ");
		int dayOfMonth = in.nextInt();
		int monthNumber = monthToDays(month);
		int calculateDays = 0;
		for (int i = 0; i < monthNumber; i++)
		{
			calculateDays+=monthDays[i]; // Should reach until the month specified.
		}
		// Add the days to calculated number.
		calculateDays += dayOfMonth;			
		// 	Season - Month A - Month B || Range in Day out of 365
		//	Spring - March 20 - June 20 || 79th Day + 92 days = 171th day 
		// 	Summer - June 21 - Sept 21 || 172rd day + 92 days = 264th day
		// 	Fall - September 22 - Dec 19 || 265th day + 88 days = 353th day
		//	Winter - December 20 - March 19 ||  354 TO 365 - 0 TO 79
		//  January 1 to March 19 || 78. 
		if(calculateDays < 79) System.out.println("It is Winter!");
		else if(calculateDays < 172) System.out.println("It is Spring!");
		else if(calculateDays < 265) System.out.println("It is Summer!");
		else if(calculateDays < 354) System.out.println("It is Fall!");
		else if(calculateDays < 366) System.out.println("It is Winter!"); // 355-365
	}
}

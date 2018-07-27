package WeekOne;

import java.util.Scanner;

public class Exercises_One {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String[] days = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
		System.out.print("Enter a day. (First three letters or whole name) ");
		String today = in.next();
		int todayIndex = indexOfDay(today);
		if (todayIndex < 0) {
			System.out.println("Error: Invalid day. Restart program.");
			in.close();
			return;
			}
		System.out.printf("Enter number of days to calculate the day after %s. ", days[todayIndex]);
		int targetDays = in.nextInt();
		int targetNumber = calculateTargetDay(todayIndex, targetDays);
		System.out.printf("%d days from %s is %s", targetDays, days[todayIndex], days[targetNumber]);
		
		in.close();
	}
	
	public static String evenOrOdd(int n) {
		if (n%2==0) return "even";
		else return "odd";
	}
	public static int calculateTargetDay(int todayIndex, int daysPass) {
		return 	((todayIndex+daysPass) % 7);
	}
	
	public static int indexOfDay(String day){
		day = day.toLowerCase();
		String[] shortDays = {"sun", "mon", "tue", "wed", "thu", "fri", "sat"};
		String[] days = {"sunday", "monday", "tuesday", "wednesday", "thursday", "friday", "saturday"};
		for (int i = 0; i < days.length; i++)
				if (day.equals(days[i]) || day.equals(shortDays[i])) return i;
		return -1;
	}
	
}
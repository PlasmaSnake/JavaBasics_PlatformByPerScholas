package WeekTwoAssignments;

import java.util.Scanner;

public class SwitchesAssn {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a number 1 to 7 to determine the day!");
		String dayName = intToStrDays(in.nextInt());
		System.out.println(dayName);
		in.reset();
		
		System.out.println("Enter a day to determine the day's number!");
		int dayNum = strToIntDays(in.next());
		System.out.println(dayNum);
		
		String suitName = randomSuit();
		System.out.printf("Here is a random suit: %s\n", suitName);
		System.out.printf("Converting random suit into a number 0-3 (Hearts, Clubs, Spades, Diamonds): %d\n", strToIntSuit(suitName));
		
		letterCount();
	}
	
	static String intToStrDays(int day) {
		String dayName = new String();
		switch(day) {
		case 1:
			dayName = "Sunday";
			break;
		case 2:
			dayName = "Monday";
			break;
		case 3:
			dayName = "Tuesday";
			break;
		case 4:
			dayName = "Wednesday";
			break;
		case 5:
			dayName = "Thursday";
			break;
		case 6:
			dayName = "Friday";
			break;
		case 7:
			dayName = "Saturday";
			break;
		default: dayName = "ERROR";
		}
		return dayName;
	}
	
	static int strToIntDays(String day) {
		int dayNum = 0;
		switch(day.toLowerCase()) {
		case "sunday":
			dayNum = 1;
			break;
		case "monday":
			dayNum = 2;
			break;
		case "tuesday":
			dayNum = 3;
			break;
		case "wednesday":
			dayNum = 4;
			break;
		case "thursday":
			dayNum = 5;
			break;
		case "friday":
			dayNum = 6;
			break;
		case "saturday":
			dayNum = 7;
			break;
		default: dayNum = -1;
		}
		return dayNum;
	}	
	
	static String randomSuit() {
		int suit = (int)(Math.random()*4); // 0-3
		String suitName = new String();
		switch(suit) {
		case 0:
			suitName = "Hearts";
			break;
		case 1:
			suitName = "Clubs";
			break;
		case 2:
			suitName = "Spades";
			break;
		case 3:
			suitName = "Diamonds";
			break;
		}
		return suitName;
	}
	static int strToIntSuit(String suitName) {
		int suitNumb = -1;
		switch(suitName) {
		case "Hearts":
			suitNumb = 0;
			break;
		case "Clubs":
			suitNumb = 1;
			break;
		case "Spades":
			suitNumb = 2;
			break;
		case "Diamonds":
			suitNumb = 3;
			break;
		}
		return suitNumb;
	}
	
	static void letterCount() {
		String test = "Apple";
		int vowelCount = 0, consonantCount = 0;
		// if letter is A-Z or a-z
		for (char letter: test.toCharArray()) {
			boolean isVowel = false;
			if ((letter > 64 && letter < 91) || (letter > 96 && letter < 123)) {
				// Checks to see if letter is equal to any of the vowels.
				String vowels = "aeiouAEIOU";
				char[] vowelArray = vowels.toCharArray();
				for(char a: vowelArray) {
					if (letter == a) {
						vowelCount++;
						isVowel = true;
					}
				}
				if (!isVowel) consonantCount++;
			}
		}
		System.out.printf("%s has - Consonant count: %d, Vowel count: %d", test, consonantCount, vowelCount);
	}
}

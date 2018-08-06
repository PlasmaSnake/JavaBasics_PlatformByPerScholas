package WeekTwoAssignments;

import java.util.Scanner;
import java.util.zip.ZipEntry;

public class ProblemSetTwo {
	public static void main(String[] args) {
		posOrNeg();
		maxThree();
		doubleCheck();
		vowelOrConsonant();
	}
	
	public static void posOrNeg() {
	Scanner in = new Scanner(System.in);
		System.out.print("Enter any signed number: ");
		int n1 = in.nextInt();
		if(n1 >= 0) System.out.print("Entered number is positive!");
		else System.out.print("Entered number is negative and doesn't think highly of you.");
	
	}
	
	public static void maxThree() {
		Scanner in = new Scanner(System.in);
		System.out.print("\nEnter three numbers.\n");
		int n1 = in.nextInt(), n2 = in.nextInt(), n3 = in.nextInt();
		// if n3 is bigger than any of the other numbers, replace it for Math.Max comparison
		if (n3 > n2) n2 = n3;
		else if (n3 > n1) n1 = n3;
		System.out.printf("%d is the biggest number!",Math.max(n1, n2));
	}
	
	public static void doubleCheck() {
		Scanner in = new Scanner(System.in);
		System.out.print("\nEnter a number with a decimal point: ");
		double d1 = in.nextDouble();
		if ((int)d1 == 0) System.out.println("Entered number is Zero.");
		else if ((int)d1 > 0) System.out.print("Entered number is positive. ");
		else if ((int)d1 < 0) System.out.print("Entered number is negative. ");
		
		if (d1 > Math.abs(1000000)) System.out.printf("%f is very large!", d1);
		else if (d1 < Math.abs(1)) System.out.printf("%f is very small.",d1);
	}
	public static void vowelOrConsonant() {
		String vowels = "aeiouAEIOU";
		String characterType = "bad input";
		Scanner in = new Scanner(System.in);
		System.out.println("\nPlease enter a character: ");
		String c1 = in.nextLine();
		// Checks c1 for valid input
		if (c1.length() > 1) System.out.print("ERROR: Input is not correct. ");
		else {
			// Checks if c1 is a letter. a - z and A - Z
			if((c1.charAt(0) >= 'a' && c1.charAt(0) <= 'z') ||
					(c1.charAt(0) >= 'a' && c1.charAt(0) <= 'z')) {
				characterType = "consonant";
				for(int i = 0; i < vowels.length(); i++) {
					if (vowels.charAt(i) == c1.charAt(0)) characterType = "vowel";
				}	
			}
			System.out.printf("%s is a %s!", c1, characterType);
		}
	}
	
}


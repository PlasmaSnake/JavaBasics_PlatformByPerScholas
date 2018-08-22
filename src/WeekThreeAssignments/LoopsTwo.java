package WeekThreeAssignments;

import java.util.Scanner;

public class LoopsTwo {

	public static void main(String[] args) {
		guessNumbers();
		puzzleOne();
		puzzleTwo();
		puzzleThree();
		puzzleFour();
	}
	public static void guessNumbers() {
		Scanner in = new Scanner(System.in);
		int randomNumber = 1+(int)(Math.random()*100); //1 - 100
		System.out.print("Guess a number from 1 to 100. You have 8 tries: "); 
		int count = 0;
		
			// user guess until correct answer
		while(count < 8) {
			int guess = in.nextInt();
			if(randomNumber == guess) {
				System.out.print("Congrats!");
				break;
			}
			if(randomNumber > guess) { 
				System.out.print("Guess too low. ");
				count ++;
			}
			if(randomNumber < guess) { 
				System.out.print("Guess too high. ");
				count ++;
			}	
			if (count == 8) System.out.println("You've run out of guesses. :(" );
			else System.out.println("Try again: ");
		}
	}
	
	public static void puzzleOne() {
		System.out.println("Printing all pairs that equal to 60 and have a difference of 14.");
		for(int i = 10; i <= 50; i++) {
			for (int j = 50; j >= 10; j --) 
				if (i - j == Math.abs(14) && i+j == 60) System.out.printf("%d and %d\n", i, j);
		} 
	}
	public static void puzzleTwo() {
		System.out.print("Printing list of all the two digit numbers which are less \r\n" + 
				"than or equal to fifty-six, and the sum of whose digits is greater than ten.");
		for(int i = 5; i >= 2; i--) {
			for (int j = 9; j >= 1; j --) {
				if(i == 5 && j > 6) continue;
				if (j+i > 10) System.out.printf("\n%d%d",i,j);
			}
		} 
	}
	
	public static void puzzleThree() {
		System.out.println("\nPrinting all 3 digit Armstrong numbers.");
		// 3 digits 3^9
		// 1 whole number 100-999 (900)
		for(int i = 100; i <= 999; i++) {
			int temp = i;
			int total = 0;
			while (temp != 0) {
				int digit = temp%10;
				total += (int)(Math.pow(digit,3));
				temp = temp/10;
			}
			if (total == i) System.out.printf("%d is an armstrong number.", i);
		}
	}
	public static void puzzleFour() {
		System.out.println("\nPrinting a list of four positive integers whose sum is 45, and such that \r\n" + 
				"the first plus 2, the second minus 2, the third multiplied by 2, and the \r\n" + 
				"fourth divided by 2 are all equal.");
		for(int i = 42; i >= 1; i--) {
			for(int j = 1; j < 45; j++) {
				for(int k = 1; k < 45; k++) {
					for(int l = 1; l < 45; l++) {
						if ((i+j+k+l == 45) && 
							(i+2 == j-2) && 
							(j-2 == k*2) &&
							(k*2 == l/2))System.out.println(i +" "+ j + " " + k + " "+ l);
					}
				}
			}
		}
	}
		
}

package WeekThree;

import java.util.Scanner;

/* Loops and Arrays
 * 	1. While Loops
 * 		a. addition loop until right number
 * 		b. guess numbers until right, with hints dependant on answer
 * 	2.
 * 	3.
 * 	4.
*/
public class Exercises {

	public static void main(String[] args) {
	//	addUntilRight();
		guessNumbers();
	}
	// Add two random number and query user for answer until right
	public static void addUntilRight() {
		Scanner in = new Scanner(System.in);
		boolean isWrong = true;
		int n1 = (int)(Math.random()*100), n2 = (int)(Math.random()*100);
		while(isWrong){
			System.out.printf("What is %d + %d? ", n1,n2);
			int answer = in.nextInt();
			isWrong = !(n1+n2 == answer);
			if(isWrong) System.out.print("Wrong answer. Try again. "); 
		}
		System.out.print("You got it!");
	}
	
	public static void guessNumbers() {
		// random number generator 0  to 100 
		// user input loops until guess == random number
		// if guess is lower than number : "guess too low" otherwise 
		// if guess is higher than number : "guess too high"
		Scanner in = new Scanner(System.in);
		int randomNumber = (int)(Math.random()*101); //0 - 100
		System.out.print("Enter a number from 1 to 100: "); 
		boolean correctAnswer = false;
		
			// user guess until correct answer
		while(!correctAnswer) {
			int guess = in.nextInt();
			if(randomNumber == guess) {
				System.out.print("Correct!");
				correctAnswer = true;
			}
			if(randomNumber > guess) { 
				System.out.print("Guess too low. Try again:  ");
			}
			if(randomNumber < guess) { 
				System.out.print("Guess too high. Try again: ");
			}	
		}
	}
}
package WeekThreeAssignments;

import java.util.Arrays;
import java.util.Scanner;
import java.util.PrimitiveIterator.OfDouble;

import javax.security.auth.kerberos.KerberosKey;
import javax.swing.text.StyledEditorKit.ForegroundAction;

import org.omg.CORBA.SystemException;

public class LoopsOne {
	public static void main(String[] args){
		pin();
		guessNumber();
		countLoop();
		hiLo();
		addVal();
		evenPrint();
		squareInt();
		pattern();
		patternTwo();
	}
	static void pin() {
		Scanner in = new Scanner(System.in);
		int[] PIN = {1,3,3,7};
		int[] answer = {0,0,0,0};
		boolean correctAnswer = false;
		System.out.println("Greeting. Enter the 4 digit pin to access your account!" );
		while(!correctAnswer) {
			correctAnswer = true;
			for (int i = 0; i < answer.length; i ++) {
				System.out.printf("Digit #%d: ", i+1);
				answer[i] = in.nextInt();
				if (answer[i]!=PIN[i]) correctAnswer = false;
			}
			if (correctAnswer == false) System.out.println("Try again.");
		}
		System.out.println("PIN ACCEPTED. YOU HAVE $0.00 IN YOUR ACCOUNT. GOODBYE.");
	}
	
	static void guessNumber() {
		Scanner in = new Scanner(System.in);
		int number = 5;
		int answer = 0;
		while (number!=answer) {
			System.out.println("Enter a number between 1 and 10");
			answer = in.nextInt();
			if (answer != number) System.out.print("Try again. ");
		}
		System.out.println("Correct!");
	}
	static void countLoop() {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a number to how to count to it: ");
		int duration = in.nextInt();
		for (int i = 0; i < duration; i ++) System.out.println(i+1);
	}
	static void hiLo() {
		Scanner in = new Scanner(System.in);
		int guesses = 1, answer = 1+(int)(Math.random()*100), guess = 0;
		System.out.println("Enter a number between 1 and 100: ");
		while (answer != guess) {
			guess = in.nextInt();
			if (answer < guess) System.out.println("Number was too high. Guess lower!" );
			if(answer>guess) System.out.println("Guess was too low. Aim for the clouds!" );
			if(answer!= guess) {
				guesses++;
			}
		}
		System.out.printf("Good job! You got it. It took %d number of guess(es) in total!", guesses);
	}
	static void addVal() {
		Scanner in = new Scanner(System.in);
		System.out.print("\nBig number calculator! To stop, input 0. ");
		
		int input = -1,total = 0;
		
		while (input != 0) {
			input = in.nextInt();
			total += input;
		}
		System.out.printf("Your total will be $%d. ", total);
	}
	
	static void evenPrint() {
		Scanner in = new Scanner(System.in);
		System.out.println("\nEnter a number to see all the even numbers until then. ");
		int n = in.nextInt();
		for(int i =1; i <= n; i+=2) {
			System.out.print(i + " ");
			if (i%12==0) System.out.println(); 
		}
	}
	
	static void squareInt() {
		Scanner in = new Scanner(System.in);
		System.out.println("\nEnter a number to see the square of it.");
		int s = in.nextInt();
		for (int i = 1; i <= s; i++) {
			System.out.print(i*i+ " ");
			if(i%12 == 0) System.out.println();
		}
	}
	static void pattern() {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a number higher than 0 to see something cool! " );
		int rows = in.nextInt();
		for (int i = 1; i <= rows; i++) {
			for(int j = 1; j < i; j++) {
				System.out.print(i);
			}
			System.out.println(i);
		}
	}
	static void patternTwo() {
		Scanner in = new Scanner(System.in);
		System.out.println("\nEnter a number that isn't 0 to see something cooler! " );
		int stars = in.nextInt(), starsLeft;
		for (int i = 0; i < stars; i++) {
			// for initial empty space
			for (int j = 1; j < stars-i; j++) System.out.print(" ");
			starsLeft = i;
				while(starsLeft>0) {
					System.out.print("*");
					System.out.print(" ");
					starsLeft--;
				}
			System.out.println("*");				
		}
	}
	
}

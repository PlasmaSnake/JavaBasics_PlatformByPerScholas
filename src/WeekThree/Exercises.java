package WeekThree;

import java.util.Scanner;
import java.util.PrimitiveIterator.OfDouble;
import java.util.concurrent.CountDownLatch;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;
import javax.swing.text.StyledEditorKit.ForegroundAction;

import com.sun.javafx.image.IntPixelAccessor;
import com.sun.scenario.effect.impl.prism.PrImage;

import jdk.management.resource.internal.TotalResourceContext;

/* Loops and Arrays
 * 	1. While Loops
 * 		a. addition loop until right number
 * 		b. guess numbers until right, with hints dependent on answer
 * 	2. For Loop
 * 		a. GCD brute force (Also EuclidGCD() most optimal algorithm)
 * 	3. Continue/Break
 * 	!!!!!! Arrays !!!!!!
 * 	4. fibonacciArray - Fill int[10] with fib numbers
*/
public class Exercises {

	public static void main(String[] args) {
	//	addUntilRight();
	//	guessNumbers();
	//	GCD();
	//	int gcd = EuclidGCD();
	//	System.out.printf("GCD: %d", gcd);
	//	doubleTuition();
	//	displayPrimeNumbers();
		fibonacciArray();
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
	public static void GCD() {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter two numbers to calculate their GCD: ");
		int n1 = in.nextInt(), n2 = in.nextInt();
		for (int i = Math.min(n1,n2); i> 0; i--) { // does not include 0
			if (n2 % i == 0 && n1 % i == 0) {
				System.out.printf("GCD is %d", i);
				break;
			}
		}
	}
	
	public static int EuclidGCD() {
		Scanner in = new Scanner(System.in);
		int n1 = in.nextInt(), n2 = in.nextInt();
		System.out.println("Enter two numbers to calculate their GCD: ");
		while (true) {
			int r = n1%n2;
			if (r==0) return n2;
			n1 = n2;
			n2 = r;
		}
	}
	public static void doubleTuition() {
		double initVal = 10000, tuition = initVal, yearlyRate = 1.07;
		int year = 1;
		for (; tuition < 2*initVal; ++year) tuition = tuition*yearlyRate;
		System.out.printf("%d year(s) until tuition is doubled. Cost will be %.2f.", year, tuition);
	}
	public static void displayPrimeNumbers() {
		System.out.print("Prime Numbers: \n");
		int numb = 2, count = 0, maxPrimeNumbers = 50;
		while(maxPrimeNumbers > 0) {
			// if numb is a prime number
			if (isPrime(numb)) {
				System.out.printf("%d ", numb);
				count++;
				// new line after 10 prime numbers
				if (count == 10) {
					count = 0;
					System.out.print("\n");
				}
				maxPrimeNumbers--;
			}
		numb++;
		}
	}
	private static boolean isPrime(int n1) {
		for (int j = 2; j <= (int)Math.sqrt(n1); j++) {
			if (n1 % j == 0) return false;
		}
		return true;
	}
	
	public static void fibonacciArray() {
		int[] fib = new int[10];
		for (int i = 0; i<fib.length;i++) {
			if (i < 2) fib[i] = i;
			else fib[i] = fib[i-2]+fib[i-1];
		}
		int addFib = 0;
		for(int i = 0; i < fib.length; i++ ) addFib += fib[i];
		
		int average = (int)addFib/fib.length;
		for (int i = 0; i < fib.length; i++) {
			if (average < fib[i]) System.out.println(fib[i] + " is larger than the average");
		}
	}	
	
}
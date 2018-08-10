package WeekThree;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.PrimitiveIterator.OfDouble;
import java.util.concurrent.CountDownLatch;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;
import javax.swing.text.StyledEditorKit.ForegroundAction;

import com.sun.corba.se.impl.oa.poa.ActiveObjectMap.Key;
import com.sun.corba.se.spi.orb.StringPair;
import com.sun.javafx.image.IntPixelAccessor;
import com.sun.javafx.scene.EnteredExitedHandler;
import com.sun.scenario.effect.impl.prism.PrImage;
import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;

import jdk.internal.org.objectweb.asm.tree.IntInsnNode;
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
 *  5. Reverse a string
 *  6. find the max of a number in an array int[]
 *  7. Use a helper method that has an array as argument
 *  8. Anagram checker
 *  **** Sort ****
 *  9. BinarySearch
 *  10. 2D Array
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
	//	fibonacciArray();
//		stringReverse();
	//	findMax();
//		findTen();
//		valuePassing();
//		anagramCheck();
//		int[] arr = {100, 50, 73, 15, 9};
//		int targetIndex = binarySearch(arr, 0, arr.length-1, 100);
//		int targetIndex = binarySearch(arr, 73);
//		System.out.print("Target index is " + targetIndex);
//		twoDArray();
		evenOrOddArray();
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
	
	public static void stringReverse() {
		String name = "I am a Java Basics Student";
		char[] nameArray = name.toCharArray();
		char[] reverseName = new char[name.length()];
		
		//Via new variable
		for (int i = nameArray.length-1, j = 0; i >= 0; i--, j++) {
			reverseName[j] = nameArray[i];
		}
		String rName = new String(reverseName);
		System.out.println(rName);
		
		//Via Swap
		for(int i = 0; i < nameArray.length/2; i++) {
			char temp = nameArray[i];
			nameArray[i] = nameArray[nameArray.length-1-i]; 
			nameArray[nameArray.length-i-1] = temp; 
		}
		System.out.println(nameArray);
	}
	
	public static void findMax() {
		int[] num = {5,3,7,3,2,7,7};
		int max = 0, minIndex = -1;
		for (int i = 0; i < num.length; i++) {
			if (max < num[i]) {
				max = num[i];
				minIndex = i;
			}
		}
		System.out.println(max + " is the biggest number at position " + minIndex);
	}
	
	public static void findTen() {
		int[] evenArray = new int[5];
		for (int i = 0; i<5; i++) {
			evenArray[i] = (i+1)*2;
		}
		System.out.println(adder(evenArray));
	}
	
	private static int adder(int[] a1) {
		int result = 0;
		for (int val:a1) result+=val;
		return result;
	}
	
	static void valuePassing() {
		String[] array = {"1","2","3"};
		System.out.println(methodA(array));
		methodB();
	}
	
	static String methodA(String[] a) {
		String concat = new String();
		for (String n:a) concat+=n;
		return concat;
	}
	static void methodB() {
		System.out.println(methodA(new String[] {"U", "S", "A"}));
	}

	static void anagramCheck() {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter two sequences of character to determine if they are anagrams.");
		String w1 = in.nextLine(), w2 = in.nextLine();
		char[] wordOne = w1.toUpperCase().toCharArray();
		char[] wordTwo = w2.toUpperCase().toCharArray();
		
		if(w1.equals(w2)) {
			System.out.printf("%s and %s are anagrams. ", w1,w2);
			return;
		}
		if(w1.length() != w2.length()) { 
			System.out.printf("%s and %s are not anagrams.", w1,w2);
			return;
		}
		
	}
	
	static void anagramCheckMap() {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter two sequences of character to determine if they are anagrams.");
		String w1 = in.nextLine(), w2 = in.nextLine();
		
		if(w1.equals(w2)) {
			System.out.printf("%s and %s are anagrams. ", w1,w2);
			return;
		}
		if(w1.length() != w2.length()) { 
			System.out.printf("%s and %s are not anagrams.", w1,w2);
			return;
		}
		// Make a map of upper case characters
		Map<Character, Integer> letterMap = new HashMap<Character, Integer>();
		for (int i = 65; i < 91; i++) letterMap.put((char)i, 0);
		char[] wordOne = w1.toUpperCase().toCharArray();
		char[] wordTwo = w2.toUpperCase().toCharArray();
		
		// Compares word one to keys and increments values by each occurrence.
		for (int i = 0; i<wordOne.length; i++) {
			if(letterMap.containsKey(wordOne[i])) {
				int value = letterMap.get(wordOne[i]);
				value++; 
				letterMap.put(wordOne[i], value);
			}
		}
		// Compares word two to current key/values in the map and decrements
		for (int i = 0; i < wordTwo.length;i++) {
			if(letterMap.containsKey(wordTwo[i])) {
				int value = letterMap.get(wordTwo[i]);
				value--; 
				// If value is negative, character did not exist 
				if (value < 0) {
					System.out.printf("%s and %s are not anagrams.", w1,w2);
					return;
				}
				letterMap.put(wordTwo[i], value);
			}
		}
		System.out.printf("%s and %s are anagrams!", w1,w2);
	}
	public static int binarySearch(int[] arr, int startIndex, int endIndex, int targetNumber) {
		Arrays.sort(arr);
		if (endIndex >= startIndex) {
			int mid = (endIndex+startIndex)/2;
			if (arr[mid]==targetNumber) return mid;
			else if (arr[mid] > targetNumber) { // ignore right
				return binarySearch(arr, startIndex, mid-1, targetNumber);
			}
			else if (arr[mid] < targetNumber) {
				return binarySearch(arr, mid+1, endIndex, targetNumber);
			}
		}
		return -1;
	}
	
	public static int binarySearch(int[] arr, int targetNumber) {
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		System.out.println("Looking for " + targetNumber);
		int left = 0, right = arr.length-1;
		while (left<=right) {
			int mid = (left+right)/2;
			if (arr[mid] == targetNumber) {
				return mid;
			}
			if (arr[mid] < targetNumber) {
				left = mid+1;
			}
			else {
				right = mid-1;
			}
		}
		return -1;
	}
	
	public static String[][] twoDArray() {
		Scanner in = new Scanner(System.in);
		System.out.print("Please enter the row size: " );
		int rowLength = in.nextInt();
		System.out.print("Please enter the column size: " );
		int colLength = in.nextInt();
		
		String[][] twoDee = new String[rowLength][colLength]; 
		
		for(int i = 0; i < twoDee.length; i ++) {
			System.out.print("Row " + i +":\n");
			for (int j = 0; j < twoDee[i].length; j++) {
				System.out.print("Enter data: ");
				twoDee[i][j]= in.next();
			}
		}
		printMatrix(twoDee);
		transposeMatrix(twoDee);
		in.close();
		return twoDee;
	}
	public static String[][] transposeMatrix(String[][] matrix) {
		if (matrix.length <= 1) {
			printMatrix(matrix);
			return matrix;
		}
		String[][] transpose = new String[matrix[0].length][matrix.length];
		for (int i = 0; i < matrix.length; i++) {
			for(int j = 0; j < matrix[i].length; j++) {
				transpose[j][i] = matrix[i][j];
			}
		}
		System.out.print("Transposed Matrix\n");
		printMatrix(transpose);
		return transpose;
	}
	
	static void printMatrix(String[][] twoDee) {
		for (String[] nestedArray: twoDee) {
			System.out.println(Arrays.toString(nestedArray));
		}
	}
	
	static void evenOrOddArray() {
		int[][] arr = {{-1, 9, 99},{25,35},{217,19,21},{26,-10,10}};
		//If arr is odd, there is always 1 more odd row.
		int[] max = new int[arr.length/2];
		int[] min = new int[arr.length/2+arr.length%2];
		int total = 0,largeTotal = 0, smallTotal = 0;

		for(int i = 0; i<arr.length; i++) {
			int tempMax = arr[i][0], tempMin = arr[i][0];
			for (int j = 1; j < arr[i].length; j++) {
				// find largest
				if (i%2 == 1)tempMax = Math.max(tempMax, arr[i][j]);
				// find smallest
				else tempMin = Math.min(tempMin, arr[i][j]);
			}
			if(i%2 == 1) max[i/2] = tempMax;
			else min[i/2] = tempMin;
		}	

		for(int i = 0; i<max.length;i++){
			largeTotal+=max[i];
			smallTotal+=min[i];
			total+=max[i]+min[i];
		}
		if (arr.length%2==1) smallTotal+=min[min.length-1];
		System.out.printf("Largest Numbers in array: %s\nTotal: %d", Arrays.toString(max),largeTotal);
		System.out.printf("\nSmallest #s in array: %s\nTotals: %d", Arrays.toString(min), smallTotal);
		System.out.printf("\nTotals of both: %d", total);
	}
	
}
package WeekThreeAssignments;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysOne {
	public static void main(String[] args) {
		int[] arr = copyArray();
		findValue(arr);
		findMaxVal(arr);
		repeatingValue(arr);
		commaWord();
	}
	
	static int[] copyArray() {
		int[] arr1 = new int[10];
		for(int i = 0; i < arr1.length; i++) {
			arr1[i] = (int)(Math.random()*101);
		}
		int[] arr2 = arr1;
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		return arr1;
	}
	static void findValue(int[] arr) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a number to find in this array from 0-100: ");
		int val = in.nextInt();
		for(int i = 0; i < arr.length;i++) {
			if(val==arr[i]) {
				System.out.printf("The value %d is in index %d", val, i);			
				return;
			}
		}
		System.out.print("Number not Found.");
	}
	static void findMaxVal(int[] arr) {
		int max = arr[0], i = 1, index = 0;
		for(; i < arr.length;i++) {
			if (max < arr[i]) index = i;
			max = Math.max(max, arr[i]);
		}
		System.out.printf("\nThe max value %d is in index %d", max, index);
	}
	
	static void repeatingValue(int[] arr) {
		Scanner in = new Scanner(System.in);
		System.out.print("\nEnter a number to find in this array from 0-100: ");
		int val = in.nextInt();
		int count = 0;
		for (int i = 0; i < arr.length;i++) if (val == arr[i]) count ++;
		System.out.printf("%d repeats %d time(s).", val , count);
	}
	
	static void commaWord() {
		Scanner in = new Scanner(System.in);
		System.out.print("\nEnter the amount of words you want: ");
		int amount = in.nextInt();
		String[] words = new String[amount];
		for (int i = 0; i < words.length;i++) {
			System.out.printf("Word %d: ", i+1);
			String word = in.next();
			words[i] = word;
		}
		if (words.length ==1) {
			System.out.print(words[0]);
			return;
		}
		for(int i = 0; i < words.length-1;i++) {
			System.out.print(words[i]+",");
		}
		System.out.print(words[words.length-1]+".");
		//separate with commas
	}
}
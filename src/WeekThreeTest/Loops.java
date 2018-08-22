package WeekThreeTest;

import java.util.Scanner;

public class Loops {
	
	public static void main(String[] args) {
		char[] message = { 'c', 'a', 'k', 'e', ' ', 'p', 'o', 'u', 'n', 'd', ' ', 's', 't', 'e', 'a', 'l' };
		String msg= reverseWords(message);
		System.out.println(msg); // prints: "steal pound cake"
		int[] numbers = new int[10];
		fillArray(numbers);
		repeatingValue(numbers);
	}
	
	public static String reverseWords(char[] msg) {
		String answer = "";
		String word = "";
		for (int i = msg.length-1; i >= 0; i--) {
			if (msg[i] != ' ') word += msg[i];
			if(msg[i] == ' ' || i == 0) {
				for (int j = word.length()-1; j >= 0; j--) {
					answer += word.charAt(j);
				}
				answer += " ";
				word = "";
			}
		}
		return answer;
	}
	
	static int[] fillArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			arr[i] = 1+(int)(Math.random()*50);
		}
		return arr;
	}
	static void repeatingValue(int[] arr) {
		Scanner in = new Scanner(System.in);
		for (int val: arr) System.out.print(val + " " );
		System.out.print("\nEnter a number to find in this array from 1-50: ");
		int val = in.nextInt();
		int count = 0;
		for (int i = 0; i < arr.length;i++) if (val == arr[i]) count ++;
		System.out.printf("%d repeats %d time(s).", val , count);
	}
	
}

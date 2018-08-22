package WeekFourTest;

import java.util.Arrays;
import java.util.Scanner;

public class SortTest {
	public static void main(String[] arg) {
		Scanner in = new Scanner(System.in);
		int[] array1 = {20,4, 65, 8, 12, 10, 28, 16};
		int[] array2 = {8, 4,78,20,49,1};
//		bubbleSort(array1);
//		bubbleSort(array2);
//		mergeSort(array1, 0, array1.length-1);
//		mergeSort(array2, 0, array2.length-1);
		System.out.println("Array One: "+ Arrays.toString(array1));
		System.out.println("Array Two: "+Arrays.toString(array2));
//		System.out.println("Enter an integer to find in the two arrays.");
//		int target = in.nextInt();
//		int index1 = binarySearch(array1, target);
//		int index2 = binarySearch(array2, target);
//		displayInfo(index1, index2, target);
	}
	
	static void displayInfo(int index1, int index2, int target) {
		if (index1 == -1) System.out.printf("%d was not found in array 1\n", target);
		else System.out.printf("%d was found in array 1 in position %d\n", target, index1);
		if (index2 == -1) System.out.printf("%d was not found in array 2", target);
		else System.out.printf("%d was found in array 2 in position %d", target, index2);
	}
	
	static int binarySearch(int[] arr, int target) {
		int l = 0, r = arr.length-1;
		while (l <= r) {
			int m = (l+r)/2;
			if (arr[m] == target) return m;
			else if (arr[m] > target) r = m-1;
			else l = m+1;
		}
		return -1;
	}
	
	static void bubbleSort(int[] arr) {
		boolean didSwap = true;
		for (int i = 0; i < arr.length-1;i++) {
			for (int j = i+1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
					didSwap = true;
				}
			}
			if (!didSwap) break;
			didSwap = false;
		}	
	}
	
	static void mergeSort(int[] arr, int l, int r) { 
		if (l < r) {
			int m = (l+r)/2;
			
			mergeSort(arr, l, m);
			mergeSort(arr, m+1, r);
			
			merge(arr, l, r, m);
		}
	}
	
	static void merge(int[] arr, int l, int r, int m) {
		int s1 = m - l + 1;
		int s2 = r - m;
		// create new arrays of l and r indexes
		int[] lArr = new int[s1];
		int[] rArr = new int[s2];
		for (int i = 0; i < s1; i++) {
			lArr[i] = arr[l+i];
		}
		for (int i = 0; i < s2; i++){
			rArr[i] = arr[i+m+1];
		}
		//Compare and merge arrays
		int i = 0, j = 0,k = l;
		while (i < s1 && j < s2) {
			if (lArr[i] <= rArr[j]) {
				arr[k] = lArr[i];
				i++;
			}
			else {
				arr[k] = rArr[j]; 
				j++;
			}
			k++;
		}
		while (i < s1) {
			arr[k] = lArr[i];
			i++;
			k++;
		}
		while (j < s2) {
			arr[k] = rArr[j]; 
			j++;
			k++;
		}
	}
	
	// Pivot point is last.
	// Initialize low at i-1
	static void quickSort(int[] arr, int low, int high) {
		if (low < high) {
			int point = pivotPoint(arr, low, high);
			quickSort(arr, low, point - 1);
			quickSort(arr, point+1, high);
		}
	}
	static int pivotPoint(int[] arr, int low, int high) {
		
		return -1;
	}
}

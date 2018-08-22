package WeekThreeAssignments;

import java.util.Arrays;

public class ArraySearch {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7,8,9,10} ;
		System.out.println(Arrays.toString(arr));
		System.out.println("Linear searching 5: " + linearSearch(arr,5));
		System.out.println("Binary searching 5: " + binarySearch(arr,5));
		System.out.println("Jump searching 8: " + jumpSearch(arr, 8));
	}
	static boolean linearSearch(int[] arr, int target) {
		for (int val: arr) if (val == target) return true;
		return false;
	}
	
	static int binarySearch(int[] arr, int target) {
		Arrays.sort(arr);
		int l = 0, r = arr.length-1;
		while(l<=r) {
			int m = (l+r)/2;
			if (arr[m]==target) return m;
			if (arr[m] < target) {
				l = m+1;
			}
			else {
				r = m-1;
			}
		}
		return -1;
	}
	static int jumpSearch(int[] arr, int target) {
		int optimalIndex = 0, i = 0;
		while (i < arr.length) {
			if (arr[i] == target) return i;
			if (arr[i] > target) {
				for(; optimalIndex < i; optimalIndex++){
					if (arr[optimalIndex] == target) return optimalIndex;
				}
			}
			optimalIndex = i;
			i+=(int)(Math.sqrt(arr.length-1));
		}
		
		return -1;
	}
	
}

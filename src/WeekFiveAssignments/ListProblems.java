package WeekFiveAssignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListProblems {
	public static void main (String[] args) {
		List<String> colors = new ArrayList<>();
		colors.add("Red");
		colors.add("Orange");
		colors.add("Green");
		colors.add("Yellow");
		colors.add("Indigo");
		colors.add("Violet");
		colors.add("Pink");
		System.out.println("Initialized color list: \n");
		display(colors);
		
		System.out.println("Updating fifth element: \n");
		updateFifth(colors);
	
		System.out.println("Deleting third element: \n");
		deleteThird(colors);
		display(colors);
		
		System.out.println("Searching for Pink in color list: \n");
		searchColor("Pink", colors);
		
		System.out.println("Sorting color list: \n");
		sortColors(colors);
		
		System.out.println("Reversing color list: \n");
		reverseColors(colors);
		
		List<String> copyColors = new ArrayList<>();
		copyColors = copyList(colors);
		System.out.println("Displaying copy of color list: \n");
		display(copyColors);
	}
	
	public static void display(List<String> items) {
		for (String val : items) {
			System.out.println(val);
		}
		System.out.println();
	}
	
	public static void updateFifth(List<String> items) {
		if(items.size() > 4) {
			items.set(4, "Magenta");
		}
		display(items);
		
	}
	
	public static void deleteThird(List<String> items) {
		if (items.size() > 2) items.remove(2);
	}
	
	public static String searchColor(String target, List<String> items) {
		int index = items.indexOf(target);
		System.out.printf("%s is at index %d\n", target, index);
		return items.get(index);
	}
	
	public static void sortColors(List<String> items) {
		Collections.sort(items);
		display(items);
	}
	
	public static void reverseColors(List<String> items) {
		Collections.reverse(items);
		display(items);
	}
	
	public static List<String> copyList(List<String>items ){
		List<String> copy = new ArrayList<>();
		copy.addAll(items);
		
		return copy;
	}
}
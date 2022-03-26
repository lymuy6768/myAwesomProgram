package December22_homework;

import java.util.ArrayList;
import java.util.Arrays;

public class Dec22_Task6_SearchAnElementInArray {

	public static void main(String[] args) {
		/*
		 * Task6: Write a Java program to search an element in a array list. Sample
		 * Output:
		 * 
		 * [Red, Green, Orange, White, Black]
		 * 
		 * 
		 * looking for "Orange" "Found the element"
		 * 
		 * looking for "Purple" "Element not found"
		 */
		ArrayList<String> color = new ArrayList<>(Arrays.asList("Red", "Green", "Orange", "While", "Black"));
		if (color.contains("Orange")) {
			System.out.println("Found the element");
		} else {
			System.out.println("Element not found");
		}

	}

}

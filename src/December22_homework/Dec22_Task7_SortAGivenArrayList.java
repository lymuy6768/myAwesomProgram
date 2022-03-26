package December22_homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Dec22_Task7_SortAGivenArrayList {

	public static void main(String[] args) {

		/*
		 * Task7: Write a Java program to sort a given array list. Sample Output:
		 * 
		 * List before sort: [Red, Green, Orange, White, Black] List after sort: [Black,
		 * Green, Orange, Red, White]
		 */

		ArrayList<String> color = new ArrayList<>(Arrays.asList("Red", "Green", "Orange", "White", "Black"));

		System.out.println("Color before sort: " + color);

		Collections.sort(color);

		System.out.println("Color after sort: " + color);

	}

}

package December22_homework;

import java.util.ArrayList;
import java.util.Arrays;

public class Dec22_Task4_RemoveTheThirdElement {

	public static void main(String[] args) {
		/*
		 * Task4: Write a Java program to remove the third element from a array list.
		 * Sample Output:
		 * 
		 * [Red, Green, Orange, White, Black]
		 * 
		 * After removing third element from the list: [Red, Green, White, Black]
		 */

		ArrayList<String> color = new ArrayList<>(Arrays.asList("Red", "Green", "Orange", "White", "Black"));

		color.remove(2);
		System.out.println(color);

	}

}

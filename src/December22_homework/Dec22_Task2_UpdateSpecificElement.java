package December22_homework;

import java.util.ArrayList;
import java.util.Arrays;

public class Dec22_Task2_UpdateSpecificElement {

	public static void main(String[] args) {
		/*
		 * Task2: Write a Java program to update specific array element by given
		 * element. Sample Output:
		 * 
		 * [Red, Green, Orange, White, Black] [Red, Green, Yellow, White, Black]
		 */
		ArrayList<String> color = new ArrayList<>(Arrays.asList("Red", "Green", "Orange", "White", "Black"));

		color.set(2, "Yellow");

		System.out.println(color);

	}

}

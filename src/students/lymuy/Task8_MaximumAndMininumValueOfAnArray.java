package students.lymuy;

import java.util.Arrays;

public class Task8_MaximumAndMininumValueOfAnArray {

	public static void main(String[] args) {
		// Task8:
//		Write a Java program to find the maximum and minimum value of an array.
//		
//		Original Array: [25, 14, 56, 15, 36, 56, 77, 18, 29, 49]                                                     
//				 Maximum value for the above array = 77                                                                       
//				 Minimum value for the
		
		
		int nums[]= {25,14,56,15,36,56,77,18,29,49};
		
		Arrays.sort(nums);
		
		System.out.println("The maximum value is :" + nums[nums.length-1]);
		System.out.println("The minimum value is : "+ nums[0]);
		
		
		
		
		
		
	}

}

package students.lymuy;

import java.util.Arrays;

public class Task3_AverageValueOfAnArray {

	public static void main(String[] args) {
		//Task3:
//		Write a Java program to calculate the average value of array elements.
//		
//		 int[] numbers = new int[]{20, 30, 25, 35, -16, 60, -100};
//	
//	Sample Output:
//
//		Average value of the array elements is : 7.0 
	
		int numbers[]= {20,30,25,35,-16,60,-100};
		float result=0f;
		int sum=0;
		System.out.println("Average value of the array elements is : ");
		
		for(int i=0;i<numbers.length;i++) {
			sum=sum+numbers[i];//sum=+numbers[]
			result=sum/numbers.length;
		}
		System.out.println(result);
		
		}
		
	}



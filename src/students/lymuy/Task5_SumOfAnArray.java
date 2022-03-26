package students.lymuy;

public class Task5_SumOfAnArray {

	public static void main(String[] args) {
		// Task5:
//		Write a Java program to sum values of an array
//		
//		int my_array[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//	
//	The sum is 55
		
		int numbers[]= new int[]{1,2,3,4,5,6,7,8,9,10}; 
		int sum=0;
		
		System.out.print("The sum is: ");
		for(int i=0;i<=numbers.length-1;i++) {
			sum=sum+numbers[i];
			
		
		
		
		}
		System.out.print(sum);
		
	}
	

}

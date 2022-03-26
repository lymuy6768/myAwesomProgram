package students.lymuy;

public class Task1_ReverseArray {

	public static void main(String[] args) {
		//Task1:
//		Given an array, the task is to reverse the given array in Java.
//		
//		Input : 1, 2, 3, 4, 5
//		Output :5, 4, 3, 2, 1
//
//		Input :  10, 20, 30, 40
//		Output : 40, 30, 20, 10
		
		
		int num1[]= {1,2,3,4,5};
		int num2[]= {10,20,30,40};
		
		for(int i=num1.length-1;i>=0;i--) {
			
			System.out.print(num1[i]);
		if(i!=0)
			System.out.print(",");
		}	
	System.out.println();
		for(int j=num2.length-1;j>=0;j--) {
		
				System.out.print(num2[j]);
				if(j!=0)
				System.out.print(",");
		}

}
}
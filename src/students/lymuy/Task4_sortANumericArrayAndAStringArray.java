package students.lymuy;

import java.util.Arrays;

public class Task4_sortANumericArrayAndAStringArray {

	public static void main(String[] args) {
	//	Task4:
//			Write a Java program to sort a numeric array and a string array.
//		    int[] my_array1 = {
//		            1789, 2035, 1899, 1456, 2013, 
//		            1458, 2458, 1254, 1472, 2365, 
//		            1456, 2165, 1457, 2456};
//		            
//		    String[] my_array2 = {
//		            "Java",
//					
//		            "Python",
//		            "PHP",
//		            "C#",
//		            "C Programming",
//		            "C++",
//			        "Jenkins",
//			        "SQL"
//		        };
			
			int myArray1[]= {1789,2035,1899,1456,2013,1458,2458,1254,1472,2365,1456,2165,1457,2456};
			
			String myArray2[]={"Java","Python","PHP","C#","C Programming","C++","Jenkins","SQL"};
			
			Arrays.sort(myArray1);
			Arrays.sort(myArray2);
			
			System.out.println(Arrays.toString(myArray1));
			System.out.println(Arrays.toString(myArray2));
			

	}

}

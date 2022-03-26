package students.lymuy;

public class JavaInterviewQuestion {
	public static void main(String[] args) {
		
		JavaInterviewQuestion jv= new JavaInterviewQuestion();
		
		int[] array= {23,60,23,100,78,100,-98,-3450};
		System.out.println("1. Find Maximum Number from int array: ");
		System.out.println(jv.findMaxNumberFromArray(array));
		
		System.out.println("\n2. Find Minimum Number from int array: ");
		System.out.println(jv.findMinNumberFromArray(array));
	}


	 /*
	  1.  Write a function that can find the maximum number from an int Array
	 */
	public int findMaxNumberFromArray(int array[]) {
		int maxNum=array[0];
		for(int i=0;i<array.length;i++) {
			if(array[i]>maxNum) {
				maxNum=array[i];
			}
		}
		return maxNum;
		
		}
		
	  /*
	   2. Write a function that can find the minimum number from an int Array
	  */
		
	public int findMinNumberFromArray(int array[]) {
		int minNum=array[0];
		for(int i=0;i<array.length;i++) {
			if(array[i]<minNum) {
				minNum=array[i];
			}
		}
		return minNum;
	}
	  /*
	   3. write a program that can find the first duplicated element from the array
	  */
		
	  /*
	   4. Write a return method that can concat two arrays
	  */
		
	   /*
	   5. write a program that can move all the zeros to the end of an array
	   */
		
	   /*
	   6. Given an array of 3 characters print all permutation combinations from the given characters
	   */
		
	   /*
	    7.Write a function that can remove the duplicates from an array of integers
	   */	
		
	   /*
	    8.write a function that can reverse an array
	   */
		
	   /*
	    9.Write a method that can sort an int array in Ascending order without using the sort method
	   */
		
	   /*
	   10. Write a return method that can sort an int array in descending order without using the sort method
	   */
		
	    /*
	   11. return the sum of the two elements closest to zero
	    */

		public static int getSumOfTwoClosestToZeroElements(int[] a) {
		    /*
		    If there are two elements equally close to zero like -2 and 2,
		    consider the positive element to be "closer" to zero than the negative one.
		    */
		
		    int b[] = new int[2];
		    int z = 0;
		    for (int i = 0; i < a.length; i++)
		        for (int j = i + 1; j < a.length; j++) {
		            int sum = a[i] + a[j];
		            if (z == 0)
		                z = sum;
		            if (Math.abs(sum) > 0 && Math.abs(sum) < Math.abs(z)) {
		                z = sum;
		                b[0] = a[i];
		                b[1] = a[j];
		            }
		        }
		    return z;
	    }
		
		
	    /*
	  12.  Given an array of integers, write a function to return the item in the array,
	    where the sum of all items on its left is equal to the sum of the ones on the right.

	    For example :
	            Given [4, 9, 1, 3, 6, 4]
	            your function should give item 1, because 4+9 = 3+6+4

	     */


	    // solution 1: (If there is only one such an item)

	    // solution 2: (if there are more than one such items, and asking you to print all of them)
		
	    /*
	 13.   Write a function:
	        that, given an integer N (1 < N < 100), returns an array containing N unique integers that sum up to 0.
	        The function can return any such array.
	        For example, given N = 4, the function could return [1,0, -3,2] or [-2,1, -4,5].
	        The answer [1, -1,1,3] would be incorrect (because value 1 occurs twice).
	        For N = 3 one of the possible answers is [-1,0,1] (but there are many more correct answers).
	    */
		
		
	


	

}

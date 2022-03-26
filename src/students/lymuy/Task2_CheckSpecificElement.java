package students.lymuy;
import java.util.Arrays;
public class Task2_CheckSpecificElement {

	public static void main(String[] args) {
		// Task2:
//		   Given an array, the task is to write a Java program to check whether a specific element is present in this Array or not.
//
//		   Input: arr[] = [5, 1, 1, 9, 7, 2, 6, 10], key = 7
//		   Output: true
//
//		   Input: arr[] = [-1, 1, 5, 8], key = -2
//		   Output: false
		
		
		int arr[]= {5,1,1,9,7,2,6,10};
		int key=10;
		boolean output=false;
		
		for(int i=0;i<arr.length;i++) {
			if(key==arr[i]) {
			output=true;
			break;
			}
				output=false;
			}System.out.println(output);
			

			 
			        int[] arrNum = { 20, 20, 30, 40, 50, 50, 50 };
			        int j = 0;
			        int n = arrNum.length;
			        int tempArr[] = new int[n];
			        // int[] expctednums = { 20, 30, 40, 50 };
			        for (int i = 0; i < n - 1; i++) {
			            if (arrNum[i] != arrNum[i + 1]) {
			                arrNum[j++] = arrNum[i]; // 20,30,40,50
			            }
			            
			        }
			        arrNum[j++] = arrNum[n - 1]; //Add last array element of arrNum to it
			        int newArr[] = new int[j];
			        for (int k = 0; k < j; k++) {
			            newArr[k] = arrNum[k];
			        }
			        System.out.println(Arrays.toString(newArr));
				
			}
					
		}
		
		
		
		
		

	



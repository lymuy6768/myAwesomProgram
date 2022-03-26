package week6;
import java.util.Arrays;
import java.util.Random;

public class AutoArray {

	public static void main(String[] args) {
		// / make a array with 100 length
	    
	    //add random numbers in each index
	    
	    //print out the array
	    
	    // use Arrays.toString(numberArray); to print your array.

		Random ran=new Random();
		int nums[]=new int[100];
		
		for(int i=0;i<100;i++) {
			nums[i]=ran.nextInt(100);
			
		}	
		System.out.println(Arrays.toString(nums));
		
	
	for(int j=0;j<100;j++) {
		if(nums[j]%2==0) {
			nums[j]=0;
			
	}}
		System.out.println(Arrays.toString(nums));
		
	}
	

}

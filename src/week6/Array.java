package week6;

import java.util.Arrays;
import java.util.Scanner;

public class Array {

	public static void main(String[] args) {

		String[] password= {"1922","1528","3452"};
		String[] userName=new String[3];
		
		Scanner scan=new Scanner(System.in);
		
		boolean x=true;
		do {
			System.out.println("What is the password");
		
		
	}while(!x==false);
		System.out.println("door unlocked");
		
		String [] name={"hello","world","tacobell"};
		
		System.out.println(Arrays.toString(name));
		
		name[2]="mcdonalds";
		for(int i=0;i<name.length;i++) {
		
		String[] nameCopy= new String[name.length];
		
		nameCopy[i]=name[i];
		}	
	int[] numberArray=new int[10];
	
	 numberArray[numberArray.length-1]=100;
	 System.out.println(numberArray[numberArray.length-1]);
	 
	 numberArray[numberArray.length-2]=22;//2nd of index of last index
	
	
	
	
	
	
	
	
	
	
	
	

}
}
package december8_homework;

import java.util.Arrays;

public class Task9_MultipleFunctions {

	public static void main(String[] args) {
//		1. create a function that can check if the given integer is positive, negative or zero
//			2. create a function that can calculate the grade of the student
//			3. create a function that can print out the combination of two integer arrays
//			4. create a function that can print a string without the duplicated characters
//			        "aaabbbccc"
//			        abc
//			5.  write a method that can print out the full name of a person in regular format
//			            ex:
//			               fullName("teChCirCle", "SCHOOL");
//			               	output:
//			               		"Techcircle School"
		Task9_MultipleFunctions mf= new Task9_MultipleFunctions();
		int num1[]= {1,2,3,4,5,6};
		int num2[]= {7,8,9,10,11};      		
		mf.checkInteger();
		mf.checkGrade();
		mf.combine2IntegerArray(num1, num2);
		mf.printUniqueChar();
		mf.printFullName("Jenny", "Cooper");
		

	}public static void checkInteger() {
		int a = 0;
		int positveNums = 1;
		int negativeNums = -1;
		int zeroNums = 0;

		if (a >= 1) {
			System.out.println("1.  "+ a + " is positive number");
		}
		if (a == 0) {
			System.out.println("1.  "+a + " is zero number");

		}
		if (a < 0) {
			System.out.println("1  "+a + " is negative number");
		}
	}

	public void checkGrade() {
		int score = 75;

		char grade = 'A';

		if (score >= 0 && score <= 100) {
			if (score >= 90 && score <= 100) {// multi branch if statement
				grade = 'A';
			} else if (score >= 80 && score <= 90) {
				grade = 'B';
			} else if (score >= 70 && score <= 80) {
				grade = 'C';
			} else if (score >= 60 && score <= 70) {
				grade = 'D';
			} else {
				grade = 'F';
			}

			System.out.println("2.  "+"Your grade is " + grade);

		} else {
			System.out.println("2.  "+"Invalid score");
		}
		}private void combine2IntegerArray(int[] num1, int[] num2) {
			int result[]=new int[num1.length+num2.length];
			
			for(int i=0;i<num1.length;i++) {
				result [i]=num1[i];
			}
			for(int i=0,j=num1.length;i<num2.length;i++,j++) {//check 2 arr
				result[j]=num2[i];
			}System.out.println("3.  "+Arrays.toString(result));
			
		
	}public void printUniqueChar() {
		String str="aaabbbccc";
		String unique="";
		
		for(int i=0;i<str.length();i++) {
			char currentChar=str.charAt(i);
			String s = String.valueOf(currentChar);
		if(!unique.contains(s)) {
			unique=unique+s;
		}
		}System.out.println("4.  "+unique);
	}public String printFullName(String firstName,String lastName) {
		
		String fullName=firstName+" "+lastName;
		System.out.println("5.  "+fullName);
		return fullName;
		
	}
	

}

package students.lymuy;

public class Task6_PrintTheFollowingGrid {

	public static void main(String[] args) {
//		Task6:
//		Write a Java program to print the following grid.
//		
//		
//		Expected Output :
//
//			- - - - - - - - - -                                                                                           
//			- - - - - - - - - -                                                                                           
//			- - - - - - - - - -                                                                                           
//			- - - - - - - - - -                                                                                           
//			- - - - - - - - - -                                                                                           
//			- - - - - - - - - -                                                                                           
//			- - - - - - - - - -                                                                                           
//			- - - - - - - - - -                                                                                           
//			- - - - - - - - - -                                                                                           
//			- - - - - - - - - - 
		
		for(int i=0;i<10;i++) {
			for(int j=0;j<10;j++) {
			if(j!=0) {
		System.out.print("- ");
	//System.out.println("j");
		
			}else {	System.out.println();
	}
		}
}
}}
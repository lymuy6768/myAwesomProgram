package december8_homework;

public class Task3_FrequencyOfEachChars {

	public static void main(String[] args) {
//		Task3

		/*
		 * /* FrequencyOfEachChars 1. write a program that can return the frequency of
		 * characters from a String Ex: str = "ababaac"; output: a3b2c1
		 */

		String str = "ababaac";
		

		for (char i = 'a'; i <= 'z'; i++) {
			int count = 0;
			for (int j = 0; j < str.length(); j++) {//a=a
				if (i == str.charAt(j)) { 
					count++;//1,2,3,4
				}	
			}
			
			if (count != 0) {//4
				System.out.print(String.valueOf(i) + count);
			//a4
			}
		}
		
	}
}

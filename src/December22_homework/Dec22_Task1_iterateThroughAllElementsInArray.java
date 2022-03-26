package December22_homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Dec22_Task1_iterateThroughAllElementsInArray {

	public static void main(String[] args) {
		
		/*Task1:
		Write a Java program to iterate through all elements in a array list
		Sample Output:

		Red                                                                    
		Green                                                                  
		Orange                                                                 
		White                                                                  
		Black 
	*/
	
		
		ArrayList<String> color = new ArrayList<>(Arrays.asList("Red", "Green", "Orange", "White", "Black"));		
		
		Iterator iter= color.iterator();
	
		while(iter.hasNext()) {
			System.out.println(iter.next());
		
		
		}	
	}

}

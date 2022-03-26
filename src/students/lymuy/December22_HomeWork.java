package students.lymuy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class December22_HomeWork {

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
	
		
		ArrayList <String> color= new ArrayList <>(Arrays.asList("Red","Green","Orange","White","Black"));
		ArrayList <String> newColor= new ArrayList<>();
		
		Iterator iter= color.iterator();
		System.out.println("Task1: Iterate through all elements: ");
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
	
	/*
	 * Task2:
	Write a Java program to update specific array element by given element.
	Sample Output:

		[Red, Green, Orange, White, Black]                                     
		[Red, Green, Yellow, White, Black] 
	 */
	System.out.println("\nTask2: ");
		newColor.addAll(color);
		System.out.println("Color before update:");
		System.out.println(newColor+"\n");
		
		newColor.set(2, "Yellow");
		System.out.println("Color after update:");
		System.out.println(newColor);
		
	/*
	 * Task3:
	Write a Java program to update specific array element by given element.
	Sample Output:

		[Red, Green, Orange, White, Black]                                     
		[Red, Green, Yellow, White, Black] 
	 */
	
		
		
		
		
	
	/*
	 * Task4:
	Write a Java program to remove the third element from a array list.
	Sample Output:

	[Red, Green, Orange, White, Black]     
	                                
	After removing third element from the list:                            
	[Red, Green, White, Black] 
	 */
		System.out.println("\nTask4. Remove the third element:");
		color.remove(2);
		System.out.println(color);
		
	/*
	 * Task5:
	Write a Java program to remove the third element from a array list.
	Sample Output:

	[Red, Green, Orange, White, Black]     
	                                
	After removing third element from the list:                            
	[Red, Green, White, Black] 
	 */
	
	/*
	 * Task6:
	Write a Java program to search an element in a array list.
	Sample Output:

	[Red, Green, Orange, White, Black]     
	                                
	
	looking for "Orange"
		"Found the element"
	
	looking for "Purple"
		"Element not found"
	 */
		color.add(2, "Orange");
		System.out.println("\nTask6: search an element:");
		if(color.contains("Orange")){
			System.out.println("Found the element");
		}else
		{
			System.out.println("Element not found");
		}
		
		
	
	/*
	 * Task7:
	Write a Java program to sort a given array list.
	Sample Output:

	List before sort: [Red, Green, Orange, White, Black]                   
    List after sort: [Black, Green, Orange, Red, White]
	 */
		System.out.println("\nTask7. Sort a given array list:");
		System.out.println("Color before sort: "+color);
		color.sort(null);
		System.out.println("Color after sort: "+color);

	
		
	}

}

package december29_Homework;

import java.util.ArrayList;
import java.util.Arrays;

public class ShoppingList {

	public static void main(String[] args) {
		
		Item it = new Item("Shoes",2,49.99);
		Item it1 = new Item("jeans",3,45.50);
		Item it2 = new Item("shirts",5,24.99);
		Item it3 = new Item("belt",1,35.00);
		Item it4 = new Item("hat",1,29.99);
		

		ArrayList<Item> list = new ArrayList<>();
		list.add(it);
		list.add(it1);
		list.add(it2);
		list.add(it3);
		list.add(it4);
		
		
		
		double totalCost = 0;
		for (int i = 0; i < list.size(); i++)

			totalCost +=list.get(i).calCost();// to get all cost from items in the list 
		System.out.println((list));
	
		System.out.println("\nTotal Cost for all items: " + totalCost);

	}
}
package december29_Homework;

public class Item {

	/*
	 * create a class called ShoppingList create 5 objects of Item and store them
	 * into ArrayList of Items calculate the total cost of all Items in the list
	 */
	private String name;
	private int quantity;
	private double unitPrice;

	public Item() {
	}

	public Item(String name, int quantity, double unitPrice) {
		this.name = name;
		this.quantity = quantity;
		this.unitPrice = unitPrice;

	}

	public void setInfo(String name, int quantity, double unitPrice) {
		this.name = name;
		this.quantity = quantity;
		this.unitPrice = unitPrice;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}

	public double calCost() {

		return quantity * unitPrice;
	}

	public String toString() {
		return "\nShopping list: \nName: " + name + "\nQuantity: " + quantity + "\nUnit Price: " + unitPrice
				+ "\nCalculate Cost: " + calCost();

	}

}
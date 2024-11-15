package ims;

public class Product {
	protected String productID;
	protected String name;
	protected double price = 0;
	protected int quantity = 0;
	protected String category;

	// Constructor for Product class
	public Product(String productID, String name, double price, int quantity, String category) {
		this.productID = productID;
		this.name = name;
		this.price = price;
		this.quantity = quantity;
		this.category = category;

	}

	// return product information
	public String getProductDetails() {
		return "Category: " + category + "\n" + "ID: " + productID + "\n" + "Name: " + name + "\n" + "Price: $" + price
				+ "\n" + "Quantity: " + quantity + "\n";
	}
	
	public void updateStock(int quantity) {
		this.quantity += quantity;
	}

}
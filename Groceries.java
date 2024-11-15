package ims;

public class Groceries extends Product {
	protected double weight;
	
	
	//Constructor for Groceries class
	public Groceries(String privateID, String name, double price, int quantity, double weight) {
		super(privateID, name, price, quantity, "Groceries");
		this.weight = weight;
		
	}

}

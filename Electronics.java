package ims;

public class Electronics extends Product {
	protected int warrantyPeriod;
	
	
	//Constructor for Electronics class
	public Electronics(String privateID, String name, double price, int quantity, int warrantyPeriod) {
		super(privateID, name, price, quantity,"Electronics");
		this.warrantyPeriod = warrantyPeriod;
	
	}
	
	
}

package ims;

public class Clothing extends Product {
	protected String color;
	protected String size;
	
	//Constructor for Clothing class
		public Clothing(String privateID, String name, double price, int quantity, String size, String color) {
			super(privateID, name, price, quantity,"Clothing");
			this.color = color;
			this.size = size;
		}
}

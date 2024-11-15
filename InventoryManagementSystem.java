package ims;

import java.util.HashMap;

public class InventoryManagementSystem {
	private HashMap<String, Product> inventoryDatabase;

	public InventoryManagementSystem() {
		this.inventoryDatabase = new HashMap<>();
	}

	public void addProduct(Product product) {
		inventoryDatabase.put(product.productID, product);

	}

	public void displayAllProducts() {
		for (Product product : inventoryDatabase.values()) {
			System.out.println(product.getProductDetails());

		}
	}



}

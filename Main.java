package ims;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InventoryManagementSystem ims = new InventoryManagementSystem();
		// Adding sample products
		ims.addProduct(new Electronics("E1001", "Smartphone", 699.99, 50, 24));
		ims.addProduct(new Electronics("E1002", "Laptop", 1299.99, 30, 36));
		ims.addProduct(new Clothing("C2001", "Jeans", 49.99, 100, "M", "Blue"));
		ims.addProduct(new Clothing("C2002", "T-Shirt", 19.99, 200, "L", "White"));
		ims.addProduct(new Groceries("G3001", "Apple", 3.99, 100, 1.0));
		ims.addProduct(new Groceries("G3002", "Milk", 1.99, 50, 2.0));
		// Displaying all products
		System.out.println("Displaying all products:");
		ims.displayAllProducts();
		
		
	}
}
		// Searching for a product by name
		/*System.out.println("\nSearching for product 'Laptop':");
		Product foundProduct = ims.searchProductByName("Laptop");
		System.out.println(foundProduct != null ? foundProduct : "Product not found.");
		// Sorting products by price
		System.out.println("\nSorted Products by Price:");
		ims.sortProductsByPrice();
		// Updating stock for a product
		System.out.println("\nUpdating stock for 'Smartphone' by 10 units.");
		Product smartphone = ims.searchProductByName("Smartphone");
		if (smartphone != null) {
			smartphone.updateStock(10);
			System.out.println("Updated Product Details: " + smartphone);
		}

		// Saving data to file
		String filename = "inventory_test.txt";
		try {
			ims.saveDataToFile(filename);
			System.out.println("\nData saved to file: " + filename);
		} catch (IOException e) {
			e.printStackTrace();
		}
		// Clearing current data and reloading from file
		ims = new InventoryManagementSystem();
		try {
			ims.loadDataFromFile(filename);
			System.out.println("\nData loaded from file and displaying all products:");
			ims.displayAllProducts();
		} catch (IOException e) {
			e.printStackTrace();
		}
		// Removing a product
		System.out.println("\nRemoving product with ID 'C2002' (T-Shirt).");
		ims.removeProduct("C2002");
		System.out.println("Displaying all products after removal:");
		ims.displayAllProducts();
	}

}
*/
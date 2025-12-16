package Module3;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapOperations {
    public static void main(String[] args) {
    	
    	String product;
    	int choice = 0;
    	
    	Scanner scanner = new Scanner(System.in);
        // Create a hash set of products with 5 initial data
        Map<String, Double> products = new HashMap<>();

        // Add 5 initial data
        products.put("Mouse", 49.99);
        products.put("Monitor", 199.99);
        products.put("Keyboard", 69.99);
        products.put("Headset", 89.99);
        products.put("RAM", 999.99);
        
        
        // Display menu repeatedly until the user choose to exit
        do {
        	System.out.println();
        	System.out.println("Select an option: ");
        	System.out.println("1. Search a product");
        	System.out.println("2. Add a product");
        	System.out.println("3. Print all products and prices");
        	System.out.println("4. Find the cheapest product");
        	System.out.println("5. Exit");
        	System.out.print("Select an option: ");
        	choice = scanner.nextInt();
        	System.out.println();
        	
        switch (choice) {
        case 1:
        	// Searching a product to hash map
        	
        	System.out.print("Enter product name to search: ");
        	product = scanner.nextLine();
        	
        	if (products.containsKey(product)) {
        		System.out.println("Product found: " + product + " - " + products.get(product));
        	} else {
        		System.out.println("Product not found!");
        	}
        	
//        	if (products.contains(product)){
//        		
//        	}else {
//        		System.out.println("Product not found!");
//        	}
//        	System.out.println("");
        	break;
        	
        case 2:
        	// Adding a product to hash set
        	
        	System.out.print("Enter product name to add: ");
        	product = scanner.nextLine();
        	
        	System.out.print("Enter price: ");
        	double price = scanner.nextDouble();
        	
        	products.put(product, price);
        	
        	System.out.println("Product " + product + " added!");
        	
//        	if(!products.contains(product)) {
//            	products.add(product);
//            	System.out.println("Product added: " + product);
//            	System.out.println("");
//        	}else {
//        		System.out.println("Product already in set");
//        		System.out.println("");
//        	}
        	

        	break;
        	
        case 3:
        	// Printing all products and count of hash set
        	
        	// Use of enhanced For, for iteration through hash set
        	System.out.println("List of products and its prices: ");
        	
        	for (Map.Entry<String, Double> entry : products.entrySet()) {
        		System.out.println(entry.getKey() + " - " + entry.getValue());	
        		
        	}
        	
//        	for(String item : products) {
//        		System.out.println(item);
//        	}
//        	// .size() for count of total items in set
//        	System.out.println("Total unique products: " + products.size());
//        	System.out.println("");
        	break;
        	
        case 4: 	
        	// Finding the cheapest products in the map
        	String cheapestProduct = null;
        	double cheapest = Double.MAX_VALUE; 	
        	
        	for (Map.Entry<String, Double> entry : products.entrySet()) {
        		// compare the highest to the items in the set
        		if(entry.getValue() < cheapest) {
        			cheapest = entry.getValue();
        			cheapestProduct = entry.getKey();
        		}
        	}
        	
        	System.out.println("Cheapest product in the set: " + cheapestProduct);
        	break;
        	
        case 5: 
        	System.out.println("Thank you for browsing!");
        	break;
        	
        default:
        	// if invalid option, bug for char inputs :)
        	System.out.println("Invalid option, please try again.");
        	break;
        }
        	
        }while (choice != 5);
        scanner.close();
    }
}

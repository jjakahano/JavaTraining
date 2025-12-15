package Module3;

import java.util.HashSet;
import java.util.Scanner;

public class SetOperations {
    public static void main(String[] args) {
    	
    	String product;
    	int choice = 0;
    	
    	Scanner scanner = new Scanner(System.in);
        // Create a hash set of products with 5 initial data
        HashSet<String> products = new HashSet<>();

        // Add 5 initial data
        products.add("data1");
        products.add("data2");
        products.add("data3");
        products.add("data4");
        products.add("data5");
        
        // Display menu repeatedly until the user choose to exit
        do {
        	System.out.println("Select an option: ");
        	System.out.println("1. Search a product");
        	System.out.println("2. Add a product");
        	System.out.println("3. Print all products and count");
        	System.out.println("4. Exit");
        	System.out.print("Select an option: ");
        	choice = scanner.nextInt();
        	System.out.println();
        	
        switch (choice) {
        case 1:
        	// Searching a product to hash set
        	
        	System.out.print("Enter product name to search: ");
        	product = scanner.next();
        	
        	if (products.contains(product)){
        		System.out.println("Product found: " + product);
        	}else {
        		System.out.println("Product not found!");
        	}
        	System.out.println("");
        	break;
        	
        case 2:
        	// Adding a product to hash set
        	
        	System.out.print("Enter product name to add: ");
        	product = scanner.next();
        	
        	if(!products.contains(product)) {
            	products.add(product);
            	System.out.println("Product added: " + product);
            	System.out.println("");
        	}else {
        		System.out.println("Product already in set");
        		System.out.println("");
        	}
        	

        	break;
        	
        case 3:
        	// Printing all products and count of hash set
        	
        	// Use of enhanced For, for iteration through hash set
        	System.out.println("List of all products: ");
        	for(String item : products) {
        		System.out.println(item);
        	}
        	// .size() for count of total items in set
        	System.out.println("Total unique products: " + products.size());
        	System.out.println("");
        	break;
        	
        default:
        	// if invalid option, bug for char inputs :)
        	System.out.println("Invalid option, please try again.");
        	System.out.println("");
        	break;
        }
        	
        }while (choice != 4);
        scanner.close();
    }
}

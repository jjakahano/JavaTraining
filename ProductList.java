package Module3;

import java.util.ArrayList;
import java.util.Scanner;

public class ProductList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String product;
		Scanner scanner = new Scanner(System.in);
		
		// Declaring and adding elements in list
		ArrayList<String> list = new ArrayList<>(10);
		
		list.add("Laptop");
		list.add("Mouse");
		list.add("Keyboard");
		list.add("Monitor");
		list.add("Printer");
		
		// Display list thru iteration
		products(list);
		
		// Adding and removing elements in ArrayList
		list.add("Webcam");
		list.remove(1);
		
		// Display Updated List after changes
		System.out.println("After adding and removing products:");
		products(list);
		
		// User input for search
		System.out.print("Enter product name to search: ");
		product = scanner.next();
		
		// Searching product through list using .contains()
		if (list.contains(product)){
			System.out.println("Product found: " + product);
		}else {
			System.out.println("Product not found.");
		}
			
		
		scanner.close();
	}
	
	// Iteration method using For Loop
	public static void products(ArrayList<String> list) {
		System.out.println();
		System.out.println("All products: ");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println("");
	}
	


}

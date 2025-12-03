package com.bpi.test.main;
import java.util.Scanner;

public class TestMain {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		/*
		 * int age; System.out.print("Enter your age: "); age = scanner.nextInt();
		 * 
		 * double dage = age; System.out.println("Your age as int: " + age);
		 * System.out.println("Your age as double: " + dage);
		 */
		
		/*
		 * System.out.print("Enter first integer: "); int first = scanner.nextInt();
		 * 
		 * System.out.print("Enter second integer: "); int second = scanner.nextInt();
		 * 
		 * int sum = first + second; int difference = first - second; int product =
		 * first * second; System.out.println("Sum: " + sum);
		 * System.out.println("Difference: " + difference);
		 * System.out.println("Product: " + product);
		 */
		
		int age;
		
		System.out.print("Enter your age: " );
		age = scanner.nextInt();
		
		if (age <= 17) {
			System.out.println("Minor");
		} else if (age >= 18 && age <= 59) {
			System.out.println("Adult");
		} else {
			System.out.println("Senior"); 
		}
			
	
		scanner.close();
	}

}
import java.util.Scanner;

public class TestMain {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int age;
		System.out.print("Enter your age: ");
		age = scanner.nextInt();
		
		double dage = age;
		System.out.println("Your age as int: " + age);
		System.out.println("Your age as double: " + dage);
		
		scanner.close();
	}

}
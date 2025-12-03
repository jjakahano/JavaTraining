import java.util.Scanner;

public class GroupActivity {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String name = null, studentID = null, status = null;
		String choice;
		int subject;
		double avg = 0;
		double grade = 0;
		double total = 0;
		
		
		do {

			System.out.println("===== STUDENT GRADING SYSTEM ======");
			System.out.println(" A - Add Student Information");
			System.out.println(" B - Compute Student Average");
			System.out.println(" C - Display Student Information");
			System.out.println(" D - Exit");
			System.out.println("===================================");
			System.out.print("      Enter your choice: ");

			
			choice = scanner.next().toUpperCase();
			
			System.out.println();
			System.out.println();
			
			
			switch(choice) {
			case "A":
				
				System.out.print(" Enter Student name: ");
				name = scanner.next().toUpperCase();
				
				System.out.print(" Enter Student ID: ");
				studentID = scanner.next();
				
				System.out.print(" Enter number of subjects: ");
				subject = scanner.nextInt();
				
				for (int i = 1; i <= subject; i ++) {
					System.out.print(" Enter grade for Subject " + i + ": ");
					
					grade = scanner.nextDouble();
					total += grade;
					
				}
						
				avg = total/subject;
				
				System.out.println();
				System.out.println("====== STUDENT SAVED! =====");
				System.out.println();
				scanner.nextLine();
				
				break;
				
			case "B":
				// Check if there is an existing student
				if (name != null) {
					
					System.out.println("===================================");
					System.out.println(" Student name: " + name);
					System.out.println(" Average grade: " + avg);
					if (avg >= 75) {
						status = "PASSED";
						System.out.println(" STATUS: " + status);
					}else {
						status = "FAILED";
						System.out.println(" STATUS: " + status
								);
					}
					System.out.println("===================================");
					System.out.println();
					System.out.println();
				} else {

				}
				System.out.println("No Student Record yet, please proceed to 'A - Add Student Information' ");
				System.out.println();
				System.out.println();
				break;

				
			case "C":
				// Check if there is a computation for student
				if (status != null) {
					System.out.println();
					System.out.println("===== STUDENT SUMMARY =====");
					System.out.println(" Student Name: " + name);
					System.out.println(" Student ID: " + studentID);
					System.out.println(" Average Grade: " + avg);
					System.out.println(" Status: " + status);
					System.out.println("===========================");	
					System.out.println();
					System.out.println();
				} else {
					System.out.println("No Computation yet, please proceed to 'B - Compute Student Average' ");
					System.out.println();
					System.out.println();
				}
				break;
				
			case "D":
				break;
				
			default:
				System.out.println("Invalid choice, please try again");
				break;
			}
		} while (!choice.equals("D"));
		
		scanner.close();
	}
		

}


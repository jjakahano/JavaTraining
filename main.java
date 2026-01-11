package GroupProject.M4_Activity1;

import static GroupProject.M4_Activity1.BankAccount.testCase;

public class main {
    public static void main(String[] args) {
        //Print header, call testcase method and print completion message

        System.out.println("=== Bank Account Name Display ===");
        System.out.println();

        testCase("ACC-001");
        testCase("ACC-999");

        System.out.println();
        System.out.println("=== Program completed successfully ===");
    }
}

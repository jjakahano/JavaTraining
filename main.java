package GroupProject.M4_Activity2;

import static GroupProject.M4_Activity2.ATMSystem.processWithdrawal;

public class main {
    public static void main(String[] args) {

        System.out.println("=== ATM WITHDRAWAL SYSTEM ===");
        System.out.println();
        processWithdrawal("1", "5000");
        processWithdrawal("abc", "5000");
        processWithdrawal("10", "5000");
        processWithdrawal("1", "20000");
        System.out.println("=============================");

    }
}

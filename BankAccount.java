package GroupProject.M4_Activity1;

public class BankAccount {

    public static String getAccountName(String accountNumber) {
        // Getting the account name for assigned account number

        if (accountNumber.equals("ACC-001")) {
            return "Juan Dela Cruz";
        } else if (accountNumber.equals("ACC-002")) {
            return "Maria Santos";
        } else {
            return null;
        }
    }

    public static void testCase(String accountNumber){

        System.out.println("Looking up account: " + accountNumber);
        try {
            //Print Account being looked up and convert to Uppercase

            System.out.println("Account holder: " + getAccountName(accountNumber).toUpperCase());
            System.out.println();
        }catch(NullPointerException e){
            //Print error if getAccountName returns null

            System.out.println("Error: Account not found");
        }
    }
}

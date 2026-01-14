package GroupProject.M4_Activity3;

public class ATMTransaction {
    public static void checkBalance(String accountNumber, double balance){
        try{
            System.out.println("Processing balance inquiry...");

            char accountType = accountNumber.charAt(0);
            int accountNumberInt = Integer.parseInt(accountNumber);


            if (accountType == '1'){
                System.out.println("Account Type: Savings");
            } else if(accountType == '2'){
                System.out.println("Account Type: Checking");
            }else{
                System.out.println("Account Type: Unknown");
            }

            System.out.println("Account Number: " + accountNumberInt);
            System.out.println("Current Balance: " + balance);
            System.out.println("Balance Inquiry Successful!");

        }catch(NumberFormatException e){

            System.out.println("Error: Invalid account number format! Account number must be numeric!");
        }catch(StringIndexOutOfBoundsException e) {

            System.out.println("Error: Invalid account number format! Account number is empty or invalid!");
        }catch(Exception e){

            System.err.println("CAUGHT UNEXPECTED ERROR!" + e);
        }finally{

            System.out.println("\n ============ RECEIPT ============");
            System.out.println("Transaction Date: December 3, 2025");
            System.out.println("Transaction Type: Balance Inquiry");
            System.out.println("ATM Location: Main Branch");
            System.out.println("Thank you for banking with us!");
            System.out.println("====================================");
            System.out.println();
            System.out.println();
        }

    }

    public static void main(String[] args) {
        checkBalance("100123456", 15000.00);
        checkBalance("200987654",25000.00);
        checkBalance("ABC12345", 15000.00);
        checkBalance("",15000.00);

    }
}

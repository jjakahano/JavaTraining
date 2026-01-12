package GroupProject.M4_Activity2;

public class ATMSystem {

    static double[] accounts = { 10000, 15000, 20000};

    public static void processWithdrawal(String accountIndex, String amountInput){
        //Use Try with two Catch blocks

        System.out.println("=============================");
        System.out.println("ACCOUNT: " + accountIndex + ", AMOUNT: P" + amountInput);
        try{

            int index = Integer.parseInt(accountIndex);
            double balance = accounts[index];
            double amount = Double.parseDouble(amountInput);

            if (amount > balance){
                System.out.println("CURRENT BALANCE: P" + balance);
                System.out.println("WITHDRAWAL: P" + amountInput);
                System.out.println("NEW BALANCE: P" + accounts[index]);
                System.out.println("INSUFFICIENT FUNDS! CANNOT WITHDRAW P" + amountInput);
            }else {
                accounts[index] = balance - amount;

                System.out.println("CURRENT BALANCE: P" + balance);
                System.out.println("WITHDRAWAL: P" + amountInput);
                System.out.println("NEW BALANCE: P" + accounts[index]);
                System.out.println("WITHDRAWAL SUCCESSFUL!");
            }

        //Catch
        }catch(NumberFormatException e){

            System.out.println("Invalid input.");
        }catch(ArrayIndexOutOfBoundsException e){

            System.out.println("Account not found");
        }catch(Exception e){

            System.out.println("Transaction failed");
        }

        System.out.println("=============================");
        System.out.println();
    }
}

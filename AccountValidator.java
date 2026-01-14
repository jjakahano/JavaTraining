package GroupProject.M4_Activity4;

import java.util.Scanner;

public class AccountValidator {
    public static void validateAccountNumber(String accountNumber) throws Exception {
        //Validation instruction throw exception for the following validation


        if (accountNumber == null){
            throw new NullPointerException("Cannot be null");
        } else if (accountNumber.length() != 10){
            //null pointer first before checking the length for the array [2nd if(accountNumber.length())]
            //it would throw null pointer if account number is null

            throw new Exception("Must be 10 digits!");
        } else {
            System.out.println("Valid account: " + accountNumber);
        }
    }

    public static void main(String[] args){
        String[] accountNumbers = {"1234567890", "123", null};
        //Test case
        //Tried 3 methods of calling for validate account,
        // but skipped to print 3rd test-case because try already
        // catch for the 2nd test-case

        for (String account : accountNumbers){
            try {
                validateAccountNumber(account);
            } catch (NullPointerException e){
                System.err.println("Caught error: " + e.getMessage());
            } catch (Exception e){
                System.err.println("Caught error: " + e.getMessage());
            }
        }
    }
}

package GroupProject.M4_Activity5;

public class AccountValidator {

    public void validateAccountNumber(String accountNumber) throws InvalidAccountNumberException {
    //In order implement checking for: Null, Format, Length and Validity
        //Checking if Null, then throws NullPointerException
        if (accountNumber == null) {
            throw new NullPointerException("Account Number cannot be null");
        }
        //Checking for format, then throws InvalidAccountFormatException
        for(char c: accountNumber.toCharArray()){
            if(!Character.isDigit(c)){
                throw new InvalidAccountFormatException("Account Number must contain only digits");
            }
        }
        //Checking for Length, then throws InvalidAccountNumberException
        if (accountNumber.length() != 10) {
            throw new InvalidAccountNumberException("Account Number must be exactly 10 digits");
        }
        //Checking if Valid
        System.out.println("Valid account number: " + accountNumber);

    }

    public void testValidation(String testName, String accountNumber){
        System.out.println("Test " + testName);

        try{
            validateAccountNumber(accountNumber);
        } catch (InvalidAccountNumberException e) {
            System.out.println("ERROR: " + e.getMessage());
        } catch (InvalidAccountFormatException | NullPointerException e) {
            System.out.println("WARNING: " + e.getMessage());
        }

        System.out.println();
    }

    public static void main(String[] args) {
        AccountValidator accountValidator = new AccountValidator();

        System.out.println(" === Account Number Validator ===");
        accountValidator.testValidation("1: Valid account ", "1234567890");
        accountValidator.testValidation("2: Too short ", "123");
        accountValidator.testValidation("3: Contains letters ", "12345ABC90");
        accountValidator.testValidation("4: Contains space ", "1234 567890");
        accountValidator.testValidation("5: Null Value ", null);
        System.out.println(" ================================");
    }

}

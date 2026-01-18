package GroupProject.M4_Activity6;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;

public class BankAccount {

    private double balance = 10000;
    private static Logger logger = LoggerFactory.getLogger(BankAccount.class);

    public void withdraw(double amount) throws InvalidAmountException, InsufficientFundsException{
        logger.info("WITHDRAW AMOUNT REQUESTED: {} ", amount);

        if(amount < 0){
            logger.error("INVALID WITHDRAW AMOUNT: {} ", amount);
            throw new InvalidAmountException("Amount cannot be negative");

        }

        if(amount > balance){
            logger.warn("INVALID AMOUNT: {} ", amount);
            throw new InsufficientFundsException("Not enough balance", amount, balance);

        }

        balance -= amount;
        logger.info("WITHDRAW COMPLETE: {}, New Balance: {}", amount, balance);

    }

    public void deposit(double amount) throws InvalidAmountException, InsufficientFundsException{
        logger.info("DEPOSIT AMOUNT REQUESTED: {} ", amount);

        if(amount <= 0){
            logger.error("INVALID DEPOSIT AMOUNT: {} ", amount);
            throw new InvalidAmountException("Amount cannot be negative or equal to 0");

        }

        if(amount > 50000){
            logger.warn("AMOUNT DEPOSITED IS GREATER THAN 50000");
        }

        balance += amount;
        logger.info("DEPOSIT COMPLETE: {}, New Balance: {}", amount, balance);


    }

    public static void runTest(BankTestOperation operation, String operationName){
        logger.info("=== STARTING {} TEST ===", operationName);
        try{
            operation.execute();
        }catch(InvalidAmountException | InsufficientFundsException e){
            logger.error("failed {}", e.getMessage(), e);
        }
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount();

        runTest(() -> account.deposit(5000), "Deposit");
        runTest(() -> account.withdraw(3000), "Withdrawal");
        runTest(() -> account.deposit(-500), "Deposit");
        runTest(() -> account.withdraw(20000), "Withdrawal");
        runTest(() -> account.deposit(60000), "Deposit");
    }
}

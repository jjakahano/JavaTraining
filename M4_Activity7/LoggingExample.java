package M4_Activity7;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoggingExample {
    private static final Logger logger = LoggerFactory.getLogger(LoggingExample.class);

    private double balance = 10000;

    public void deposit(double amount){
        //Checking amount

        if (amount <= 0){
            logger.error("You are not depositing a valid amount: {}, should be greater than Zero", amount);
            return;
        }

        balance += amount;
        logger.info("Successfully deposited: P{}, New balance: P{}", amount, balance);
    }

    public void withdraw(double amount){
        logger.info("Withdrawal request: P{}", amount);

        try {
            // Check balance
            if (amount > balance){
                logger.warn("You are withdrawing more than your current balance! Balance = P{}", balance);
            }
            // Process withdrawal
            balance -= amount;
            // Log success withdrawal
            logger.info("Successfully withdrawn: P{}", amount);

        }catch (Exception e){
            logger.error("Withdrawal failed: {}", e.getMessage());
        }
    }

    public static void main(String[] args) {
//        logger.error("ERROR: Something is broken! (Critical)");
//        logger.warn("WARN: This looks suspicious... (Warning)");
//        logger.info("INFO: The application is doing its job. (Normal)");
//        logger.debug("DEBUG: Database query returned 5 rows. (Developer Info)");
//        logger.trace("TRACE: Entering method calculateInterest(). (Very Detailed)");

        LoggingExample bankAccount = new LoggingExample();
        bankAccount.withdraw(3000);
        bankAccount.withdraw(5000);
        bankAccount.withdraw(4000);
        bankAccount.deposit(-2000);
        bankAccount.deposit(5000);

    }

}

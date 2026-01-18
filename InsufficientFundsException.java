package GroupProject.M4_Activity6;

public class InsufficientFundsException extends Exception{
    private double balance;
    private double requestedAmount;

    public InsufficientFundsException(String message, double balance, double requestedAmount){

        super(message);
        this.balance = balance;
        this.requestedAmount = requestedAmount;
    }

    public double getBalance(double balance){
        return balance;
    }

    public double getRequestedAmount(double requestedAmount){
        return requestedAmount;
    }


}

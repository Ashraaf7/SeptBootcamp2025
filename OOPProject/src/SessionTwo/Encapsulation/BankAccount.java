package SessionTwo.Encapsulation;

public class BankAccount {

    //variable
    //hide > balance
    private double balance;

    //constructor
    public BankAccount() {
    }

    public BankAccount(double initialAmount) {
        balance = initialAmount;
    }

    //methods
    //setter
    public void deposit(double amount) {
        if (amount > 0)
            balance += amount;
        else
            System.out.println("Error: Negative numbers is not allowed");
    }

    public double getBalance() {
        return balance;
    }

    public void withdraw(double amount)
    {
        if (amount <= balance)
        {
            double withFees = amount + 5;
            balance -= withFees; // balance = balance = amount
        }

        else
            System.out.println("Unavailable amount");
    }
}

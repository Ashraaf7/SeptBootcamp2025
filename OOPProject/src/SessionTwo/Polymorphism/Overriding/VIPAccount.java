package SessionTwo.Polymorphism.Overriding;

import SessionTwo.Encapsulation.BankAccount;

public class VIPAccount extends BankAccount {


    @Override
    public void withdraw(double amount)
    {
        if (amount <= getBalance())
        {
            System.out.println("No Fees");
        }

        else
            System.out.println("Unavailable amount");
    }
}

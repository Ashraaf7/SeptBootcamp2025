package SessionTwo.Inheritance;

import SessionTwo.Encapsulation.BankAccount;

// SavingAccount must is-A BankAccount
public class SavingAccount extends BankAccount {
    public void addInterests()
    {
        /*
        current ?
        current * 0.05 > interest
        current + interest
         */
        double current = getBalance();
        double interest = current * 0.05;
        deposit(interest);
    }

}

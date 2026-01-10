package SessionTwo.Inheritance;


public class Runner {
    public static void main(String[] args) {

        SavingAccount ahmedSaving = new SavingAccount();
        ahmedSaving.deposit(50000);

        ahmedSaving.withdraw(10000);

        System.out.println(ahmedSaving.getBalance()); //40000


        CurrentAccount currentAccount = new CurrentAccount();
        currentAccount.deposit(10000);
        currentAccount.withdraw(5000);
        System.out.println(currentAccount.getBalance()); //5000
    }
}

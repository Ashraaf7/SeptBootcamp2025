package SessionTwo.Encapsulation;

public class Runner {
    public static void main(String[] args) {
        BankAccount ahmedAccount = new BankAccount(2000);

        ahmedAccount.deposit(-5000.0);

        System.out.println(ahmedAccount.getBalance());

        ahmedAccount.deposit(3000.0);

        System.out.println(ahmedAccount.getBalance());


    }
}

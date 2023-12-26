import java.util.Random;

public class Main {

    public static void main(String[] args)
    {
        // Create 3 bank accounts
        BankAccount b1 = new BankAccount(100 , 200);
        BankAccount b2 = new BankAccount(800 , 900);
        BankAccount b3 = new BankAccount(1600 , 1750);



        System.out.println(b1.accountNumber);
        System.out.println(b1.getSavingsBalance());
        System.out.println(b1.withdraw(23,1));
        System.out.println(b1.getSavingsBalance());


        System.out.println(b1.deposit(500,1));
        System.out.println(b1.getSavingsBalance());

    }


}
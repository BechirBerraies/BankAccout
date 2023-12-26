import java.lang.reflect.Method;
import java.util.Random;
import java.util.Scanner;

public class BankAccount  {
    // MEMBER VARIABLES

    public  Integer accountNumber ;
    private double checkingBalance;
    private double savingsBalance;

    private static int accounts;
    private static double totalMoney; // refers to the sum of all bank account checking and savings balances

    // CONSTRUCTOR
    // Be sure to increment the number of accounts


    public BankAccount(double checkingBalance, double savingsBalance) {
        this.checkingBalance = checkingBalance;
        this.savingsBalance = savingsBalance;
        this.accountNumber = getRandomNumber();
        accounts += 1 ;

    }


    // METHODS

    // deposit
    // - users should be able to deposit money into their checking or savings account
    public String deposit(double Amount , int AccountType)
    {
        System.out.println("Please Enter Card Number :");

        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();

        if(i == accountNumber)
        {
            System.out.println("good Card Number");
            if(AccountType ==1 )
            {
                savingsBalance += Amount;
                System.out.println("You have Successfully Added to your savingsBalance "+ Amount + "Dinars");
                return "your total Money is "+ Total() +"Dinars" ;
            }
            else
                checkingBalance += Amount;
            System.out.println("You have Successfully Added to your checkingBalance "+ Amount + "Dinars");

            return "your total Money is "+ Total() +"Dinars" ;
        }
        else
            return "Wrong Card Number";

    }

    // withdraw
    // - users should be able to withdraw money from their checking or savings account
    // - do not allow them to withdraw money if there are insufficient funds

    public String withdraw(double Amount , int AccountType)
    {
        System.out.println("Please Enter Card Number :");

        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();

        // Verification of the card

        if(i == accountNumber)
        {
            System.out.println("good");
            if(AccountType == 1 )
            {
                if(Amount <= savingsBalance)
                {

                    savingsBalance -= Amount;
                    return "You have Successfully withdrawn from your savingsBalance "+ Amount + "Dinars";
                }
                else
                    return "Not enough Money in your savingBalance";
            }
            else

            if(Amount <= checkingBalance)
            {
                checkingBalance -= Amount ;
                return "You have Successfully withdrawn from your checkingBalance "+ Amount + "Dinars";
            }
            else
                return "Not enough Money in your checkingBalance";
        }

        else
            return "Wrong Card Number";

    }



    public Boolean EnterNumberAccout(Integer cardNumber)
    {
        if( cardNumber.equals(accountNumber) )
        {
            System.out.println("Good Card Number ");
            return true;
        }
        else
            System.out.println("Wrong Card Number ");
        return false;
    }

    public double Total()
    {
        totalMoney = savingsBalance + checkingBalance;
        return totalMoney;
    }

    public int getRandomNumber() {
        Random random = new Random();
        int theNumber = random.nextInt(); // Generates a random integer
       // System.out.println("Random number: " + theNumber);
        return theNumber;
    }

    // getBalance
    // - display total balance for checking and savings of a particular bank account
    // - all deposits and withdrawals should affect totalMoney


    public String GetBalance(Integer number)
    {
        if(number == accountNumber)
        {
            return "You currently have "+ checkingBalance + "in your checking account and " + savingsBalance + "in your savings account" + Total();
        }
        else
            return "Wrong Account Number";

    }


// GETTERS

    public double getCheckingBalance() {
        return checkingBalance;
    }


    public double getSavingsBalance() {
        return savingsBalance;
    }


    public static int getAccounts() {
        return accounts;
    }



    public static double getTotalMoney() {
        return totalMoney;
    }

    public  Integer getAccountNumber() {
        return accountNumber;
    }
}

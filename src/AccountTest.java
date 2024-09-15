/*
    Lab 8.3: Account

    Instruction: Given Account class with the following attributes and methods:
        * Attributes:
            - accountNumber(String)
            - accountHolder(String)
            - balance(double)

        * Methods:
            - deposite(double amount): This method increases the balance by the specified amount.
            - withdraw(double amount): This method decreases the balance by the specified amount, but only if
              there are sufficient funds.
            - displayAccountDetails(): This method displays the account number, account holder's name, and
              current balance.

        1) Create an Account object in the AccountTest class, initialize the account's attributes, and modify
           the balance using the deposit() and withdraw() methods.

        2) Display the account details before and after the transactions.

        3) Include the Account class in AccountTest.java.


    Expected Output: Replace Account Number with your student ID, Replace Account Holder with your name.
        Account Number: 123456789
        Account Holder: John Doe
        Current Balance: 500.0

        After transactions:
        Account Number: 123456789
        Account Holder: John Doe
        Current Balance: 600.0
*/


class Account {
    private String accountNumber;
    private String accountHolder;
    private double balance;

    public Account() {
        this.accountNumber = "";
        this.accountHolder = "";
        this.balance = 0.0;
    }

    public Account(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public void deposite(double amount) {
        this.balance += amount;
    }

    public void withdraw(double amount) {
        if (amount <= this.balance) {
            this.balance -= amount;
        }
        else {
            System.out.println("Insufficient Balance!");
        }
    }

    public void displayAccountDetails() {
        System.out.println("Account Number: " + this.accountNumber);
        System.out.println("Account Holder: " + this.accountHolder);
        System.out.println("Current Balance: " + this.balance);
    }
}

public class AccountTest {
    public static void main(String[] args) {
        Account act1 = new Account("123456789", "John Doe", 500.0);
        act1.displayAccountDetails();
        System.out.println();
        System.out.println("After transaction:");
        act1.deposite(100);
        act1.displayAccountDetails();

        System.out.println();
        Account act2 = new Account("111111111", "Steve Roger", 0);
        act2.displayAccountDetails();
        System.out.println();
        System.out.println("After transaction:");
        act2.withdraw(100);
        System.out.println();
        System.out.println("After transaction:");
        act2.deposite(100);
        act2.displayAccountDetails();
    }
}

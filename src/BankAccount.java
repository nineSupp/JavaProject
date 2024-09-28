/*
 * (Homework 9)
 * Name: Suppatouch Srinual (Nine)
 * ID: 2420210037
 * L9.1: BankAccount.java
 *
 * ==================================================================================
 * Instruction: Implement BankAccount.java and test it using BankAccountTest.java with
 * the following details. Submit the code in [PA-9.1.1 BankAccount.java] and [PA-9.1.2
 * BankAccountTest.java].
 *
 *
 *      1.1. Write the code according to the provided Class Diagram.
 *
 *      1.2. The class should have the following attributes.
 *          a. String accountNumber: A string representing a 10-digit number.
 *          b. String accountHolderName: The name a surname of the account holder.
 *          c. double balance: The remaining balance.
 *
 *      1.3. Constructor - Create an object by accepting values for the three
 *           attributes and perform validation, such as:
 *          a. accountNumber: must be a 10-digit number.
 *          b. To open an account, there must be a minimum balance of 500 Baht
 *             deposited.
 *          c. If the condition are not met, insert the code
 *             throw new IllegalArgumentException("specify the error message"); or
 *             using message Dialog.
 *
 *      1.4 Perform Data Validation in the deposit and withdraw methods:
 *          a. For deposits, the amount must be greater than 0.
 *          b. For withdrawals, the amount must be greater than 0 but not exceed the
 *             available balance.
 *
 *      1.5. Test using BankAccountTest.java, and the output should match the provided
 *           example.
 *          a. Create a set of tests by creating an object with the object name as your
 *             nickname, the account name as your real first and last name in English,
 *             the account number as your studentID, and the account opening balance
 *             as you like.
 *          b. Test abnormal deposit and withdrawal scenarios, such as exceeding the
 *             balance or negative amounts, which should display an error message as
 *             shown in the example.
 *          c. Create another object to test that if the account is opened with an in
 *             -sufficient balance to meet the minimum requirement, an error message
 *             should be displayed as shown in the example.
 *
 *      1.6. Implement a toString(): String method to display the values of all three
 *           attributes in the object. You can design the format of the output as you
 *           wish.
 *
 *      1.7. Add comments to explain your code and submit the code in
 *           [PA-9.1.1 BankAccount.java] and [PA-9.1.2 BankAccountTest.java].
 * ==================================================================================
 */


/*  =================================================================================
    *** Please note: I decided to display error through the use of Swing GUI ***
    *               Thus, error message is just a pop-up window             *
    =================================================================================
*/


import javax.swing.*;

public class BankAccount {
    // 1.2. Creating attributes: Instance Variables for BankAccount.
    private String accountNumber;
    private String accountHolderName;
    private double balance;

    // 1.3. Creating constructors.
    // 1.3.1. Create a default constructor.
    // Fix this.
    public BankAccount() {
        this.accountNumber = "";
        this.accountHolderName = "";
        this.balance = 0.0;
    }

    // 1.3.2. Create a constructor with full parameters to initialize the instance variables.
    public BankAccount(String accountNumber, String accountHolderName, double balance) {
        try {
            if (accountNumber.length() != 10 || balance < 500 || checkDigit(accountNumber)) {
                // The order importance when it comes to what to check first.
                // a. I decided to go with checking
                if (accountNumber.length() != 10) {
                    throw new IllegalArgumentException("2");        // Insufficient funds error.
                }
                else if (balance < 500) {                           // Account Number != 10.
                    throw new IllegalArgumentException("1");
                }
                else {
                    throw new IllegalArgumentException("3");        // Account Number contains non-digit.
                }
            }
            else {
                this.accountNumber = accountNumber;
                this.accountHolderName = accountHolderName;
                this.balance = balance;
            }
        }
        catch (IllegalArgumentException e) {
            String message = e.getMessage();

            switch (message) {
                case "1" -> this.displayMessage("Invalid: Insufficient funds to open an account",
                        "Error");
                case "2" -> this.displayMessage("Invalid: Account number must be exactly 10 characters long"
                        , "Error");
                case "3" -> this.displayMessage("Invalid: Account number consists of non-digit character",
                        "Error");
            }
        }
    }

    // This is a custom method is to check if there is a non-digit in variable accountNumber.
    private boolean checkDigit(String accountNumber) {
        boolean haveDigit = false;
        for(int i = 0; i < accountNumber.length(); i++) {
            if (!Character.isDigit(accountNumber.charAt(i))) {
                haveDigit = true;
                break;
            }
        }
        return haveDigit;
    }

    // This is a custom method to display a pop-up message.
    private void displayMessage(String inputMessage, String inputTile) {
        switch (inputTile) {
            case "Error" -> JOptionPane.showMessageDialog(null, inputMessage, "Error!",
                    JOptionPane.ERROR_MESSAGE);
            case "Deposit" -> JOptionPane.showMessageDialog(null, inputMessage, "Deposit!",
                    JOptionPane.INFORMATION_MESSAGE);
            case "Withdraw" -> JOptionPane.showMessageDialog(null, inputMessage, "Withdraw!",
                    JOptionPane.INFORMATION_MESSAGE);
        }
    }

    // 1.4: Perform the data validation:
    //  a. Deposit - the amount must be greater than 0.
    //  b. Withdraw - the amount must be greater than 0, and it should not exceed the balance.
    public void deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
            String displayAmount = String.format("Deposit: %.2f", amount);
            // Every time that an object deposit the money, it'll display the amount.
            this.displayMessage(displayAmount, "Deposit");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= this.getBalance()) {
            this.balance -= amount;
            String displayAmount = String.format("Withdraw: %.2f", amount);
            // Every time that an object withdraw the money, it'll display the amount or error.
            this.displayMessage(displayAmount, "Withdraw");
        }
        else {
            if (amount <= 0) {
                if (amount == 0) {
                    // Withdrawal amount is 0
                    this.displayMessage("Withdrawal amount is 0", "Error");
                }
                else {
                    // Withdrawal amount is less than 0.
                    this.displayMessage("Withdrawal amount is less than 0", "Error");
                }
            }
            else {
                // Insufficient Funds in Balance.
                this.displayMessage("Withdraw amount exceed the balance", "Error");
            }
        }
    }

    public void checkBalance() {
        System.out.println("Current Balance: " + this.balance);
    }

    // Basic getter and setter methods.
    // 1. return a string of variable accountNumber.
    public String getAccountNumber() {
        return "Account Number: " + this.accountNumber + "\n";
    }

    // 2. return a string of variable accountHolderName.
    public String getAccountHolderName() {
        return "Account Holder Name: " + this.accountHolderName + "\n";
    }

    // 3. return a string of variable balance.
    public double getBalance() {
        return this.balance;
    }

    // 4. update method to the variable accountNumber if a certain conditions met.
    public void setAccountNumber(String accountNumber) {
        if (accountNumber.length() == 10) {
            this.accountNumber = accountNumber;
        }
        else {
            if (accountNumber.length() < 10) {
                System.out.println("The length of account number is less than 10.");
            }
            else {
                System.out.println("The length of account number is more than 10.");
            }
        }
    }

    // 5. update method to the variable accountHolderName.
    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    // Overriding the default java.lang.Object to our own toString() condition.
    @Override
    public String toString() {
        return String.format("""
                        =====================================================
                         * Account Number: %s
                         * \
                        Account Holder Name: %s
                         * Balance: %.2f
                        =====================================================""",
                this.accountNumber, this.accountHolderName, this.balance);
    }
}

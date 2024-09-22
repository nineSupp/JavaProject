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


import javax.swing.*;

public class BankAccount {
    private String accountNumber;
    private String accountHolderName;
    private double balance;

    public BankAccount() {
        this.accountNumber = "";
        this.accountHolderName = "";
        this.balance = 0.0;
    }

    public BankAccount(String accountNumber, String accountHolderName, double balance) {
        try {
            if (accountNumber.length() != 10 || balance < 500) {
                if (balance < 500) {
                    throw new IllegalArgumentException("Insufficient funds");
                }
                throw new IllegalArgumentException("Invalid account number");
            }
            this.accountNumber = accountNumber;
            this.accountHolderName = accountHolderName;
            this.balance = balance;
        }
        catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(null, "Invalid account number");
        }
    }



    public static void main(String[] args) {

    }
}

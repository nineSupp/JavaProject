/*
 * (Homework 9)
 * Name: Suppatouch Srinual (Nine)
 * ID: 2420210037
 * L9.1: BankAccountTest.java
 *
 * ==================================================================================
 * The BankAccountTest.java will test the uses of class BankAccount.java where the
 * test cases include of Ajarn.Oak cases and My cases.
 * ==================================================================================
 */


public class BankAccountTest {
    public static void main(String[] args) {
        // Ajarn. Oak test cases
        //=====================================================================================================
        try {
            BankAccount account = new BankAccount("0411200000", "Karina Bluu",
                    1000.0);
                    account.checkBalance();
            account.deposit(500.0);
            account.checkBalance();
            account.withdraw(200.0);
            account.checkBalance();
            account.withdraw(2000.0); // Should print an error message
            account.checkBalance();
        // Testing setter and getter
            account.setAccountHolderName("Yu Jimin");
            System.out.println("Account Holder Name: " +
                    account.getAccountHolderName());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        try {
            BankAccount invalidAccount = new BankAccount("12345", "Invalid " +
                    "Account", 400.0);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        //=====================================================================================================

        // My test cases.
        // 1. Test the constructors if it working correctly.
        //=====================================================================================================
        // 1.1. Check for the default constructor. In this case the default is just initializing the object.
        BankAccount test1_1 = new BankAccount();
        System.out.println(test1_1);

        // 1.2. Check for the constructor that will handle if the input balance < 500.00.
        BankAccount test1_2 = new BankAccount("1234567890", "Steve Roger", 450.00);
        System.out.println(test1_2);             // Should not initialize the Instance variables.

        // 1.3. Check for the constructor that will handle if the length of given accountNumber is not 10.
        BankAccount test1_3 = new BankAccount("123456789", "Steve Roger", 500.0);
        System.out.println(test1_3);             // Should not initialize the Instance variables.

        // 1.4. Check for the constructor that will hand if the non-digit character is in accountNumber.
        BankAccount test1_4 = new BankAccount("12345678G0", "Steve Roger", 500.00);
        System.out.println(test1_4);

        // 2. Set accountNumber, accountHolderName, and balance to object test1_1.
        test1_1.setAccountNumber("2420210037");
        test1_1.setAccountHolderName("Suppatouch Srinual");
        System.out.println(test1_1);

        // 2.1 From using object test1_1. Test the deposit and withdraw scenario.
        test1_1.deposit(1111111.0);
        System.out.println(test1_1);
        test1_1.withdraw(2000000.0);
        System.out.println(test1_1);

        // 3. Create another object to test insufficient balance to meet minimum requirement.
        BankAccount test1_5 = new BankAccount("2420210202", "Paing Myo Han Kyaw",
                450);
        //======================================================================================================
    }
}
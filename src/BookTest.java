/*
 * (Lab 10)
 * Name: Suppatouch Srinual (Nine)
 * ID: 2420210037
 * L10.1.4: BookTest.java
 *
 * ==================================================================================
 * Instruction: Implement BankAccount.java and test it using BankAccountTest.java with
 * the following details. Submit the code in [PA-9.1.1 BankAccount.java] and [PA-9.1.2
 * BankAccountTest.java].
 * ==================================================================================
 */



public class BookTest {
    public static void main(String[] args) {
        Author a = new Author("CK", "oakabc@gmail.com", 'M');
        System.out.println(a);
        Book b = new Book("My name is CK", a, 100);
        System.out.println(b);
    }
}

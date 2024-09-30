/*
 * (Lab 10)
 * Name: Suppatouch Srinual (Nine)
 * ID: 2420210037
 * L10.1.3: Book.java
 *
 * ==================================================================================
 * Instruction: Implement BankAccount.java and test it using BankAccountTest.java with
 * the following details. Submit the code in [PA-9.1.1 BankAccount.java] and [PA-9.1.2
 * BankAccountTest.java].
 * ==================================================================================
 */



public class Book {
    private Author author;
    private double price;
    private String name;
    private int qty;

    public Book(String name, Author author, double price) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.qty = 0;
    }

    public Book(String name, Author author, double price, int qty) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.qty = qty;
    }

    public String getName() { return this.name; }

    public Author getAuthor() { return this.author; }

    public double getPrice() { return this.price; }

    public int getQty() { return this.qty; }

    public void setPrice(double price) { this.price = price; }

    public void setQty(int qty) { this.qty = qty; }

    @Override
    public String toString() {
        return String.format(getClass().getSimpleName() + "[name=%s, %s, price=%f, qty=%d]",
                name, author, price, qty);
    }
}

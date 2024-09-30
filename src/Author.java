/*
 * (Lab 10)
 * Name: Suppatouch Srinual (Nine)
 * ID: 2420210037
 * L10.1.1: Author.java
 *
 * ==================================================================================
 * Instruction: Implement BankAccount.java and test it using BankAccountTest.java with
 * the following details. Submit the code in [PA-9.1.1 BankAccount.java] and [PA-9.1.2
 * BankAccountTest.java].
 * ==================================================================================
 */


public class Author {
    private String name;
    private String email;
    private char gender;

    public Author() {
        this.name = "";
        this.email = "";
        this.gender = 'X';
    }

    public Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    public String getName() { return this.name; }

    public String getEmail() { return this.email; }

    public char getGender() { return this.gender; }

    public void setEmail(String email) { this.email = email; }

    @Override
    public String toString() {
        return String.format(getClass().getSimpleName() + "[name=%s, email=%s, gender=%s]", name, email, gender);
    }
}

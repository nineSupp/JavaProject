/*
 * (Lab 10)
 * Name: Suppatouch Srinual (Nine)
 * ID: 2420210037
 * L10.2.1: Person.java
 *
 * ==================================================================================
 * Instruction: Implement class Person.java with the these attributes.
 * ==================================================================================
 */


public class Person {
    private String name;
    private String address;

    public Person() {
        this.name = "";
        this.address = "";
        System.out.println("Invoke Person(String name, String address)");
    }

    public Person(String name, String address) {
        this.name = name;
        this.address = address;
        System.out.println("Invoke Person(String name, String address)");
    }

    public String getName() { return this.name; }

    public String getAddress() { return this.address; }

    public void setAddress(String address) { this.address = address; }

    public void setName(String name) { this.name = name; }

    @Override
    public String toString() {
        return String.format("Person[name=%s, address=%s]", name, address);
    }
}

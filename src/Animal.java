/*
 * (Lab 12)
 * Name: Suppatouch Srinual (Nine)
 * ID: 2420210037
 * L12.1: Animal.java
 *
 * ==================================================================================
 * Task 1: Abstract Class Implementation
 *
 * Create an abstract class Animal:
 *      - Include the following fields:
 *              name: String
 *              age: int
 *      - Add a constructor to initialize the fields.
 *      - Create two methods:
 *              A concrete method getInfo() that returns a string with the animal’s
 *              name and age. “Name: name, Age: 3”
 *              An abstract method sound() which will be implemented by the
 *              subclasses.
 * ==================================================================================
 */


public abstract class Animal {
    private String name;
    private int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getInfo() {
        return String.format("Name: %s, Age: %d", this.name, this.age);
    }

    public abstract void sound();
}

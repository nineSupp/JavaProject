/*
 * (Homework 12)
 * Name: Suppatouch Srinual (Nine)
 * ID: 2420210037
 * PA 12.1: ChainedCalculator.java
 *
 * ==================================================================================
 * Write a class called ChainedCalculator that performs basic arithmetic operations
 * (addition, subtraction, multiplication, division) using method chaining.
 *
 * Method Chaining Rules:
 *      1. Return the same object (this) to allow chaining.
 *      2. Fluent interface: Make method names intuitive and descriptive for
 *         chaining.
 *      3. Independent methods: Each method should perform its task without relying
 *         on other chained methods.
 *      4. Handle immutability (when necessary) by returning new objects rather than
 *         modifying existing ones.
 *      5. Error handling: Gracefully handle errors or invalid inputs without
 *         breaking the chain.
 *
 * Method chaining is a powerful technique that can make your Java code more concise
 * and readable, but it should be used carefully to maintain code clarity.
 *
 * Steps:
 *      1. Create a class ChainedCalculator with a private variable to hold the
 *         current value.
 *      2. Implement methods add(), subtract(), multiply(), and divide(), where each
 *         method modifies the current value and returns the object itself (this).
 *      3. Add a result() method to print the current value.
 * ==================================================================================
 */


public class ChainedCalculator {
    private double x;

    public ChainedCalculator() { this.x = 0.0; }

    public ChainedCalculator(double x) { this.x = x; }

    public ChainedCalculator add(double y) {
        this.x += y;
        return this;
    }

    public ChainedCalculator subtract(double y) {
        this.x -= y;
        return this;
    }

    public ChainedCalculator multiply(double y) {
        this.x *= y;
        return this;
    }

    public ChainedCalculator divide(double y) {
        this.x /= y;
        return this;
    }

    public void result() {
        System.out.println(this.x);
    }
}

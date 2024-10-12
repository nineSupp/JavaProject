/*
 * (Lab 11)
 * Name: Suppatouch Srinual (Nine)
 * ID: 2420210037
 * L11 1.1: calculatorLab11.java
 *
 * ==================================================================================
 * Create a Calculator class that contains overloaded add() methods with different
 * parameter types and numbers of parameters. Print out corresponding method
 * signatures when they are invoked.
 * ==================================================================================
 */


public class calculatorLab11 {
    // Method to add two integers
    public int add(int a, int b) {
        System.out.println("Method called: add(int a, int b)");
        return a + b;
    }

    // Method to add two doubles
    public double add(double a, double b) {
        System.out.println("Method called: add(double a, double b)");
        return a + b;
    }

    // Method to add three integers
    public int add(int a, int b, int c) {
        System.out.println("Method called: add(int a, int b, int c)");
        return a + b + c;
    }

    // Method to add a double and an integer
    public double add(double a, int b) {
        System.out.println("Method called: add(double a, int b)");
        return a + b;
    }

    // Method to add an integer and a double
    public double add(int a, double b) {
        System.out.println("Method called: add(int a, double b)");
        return a + b;
    }
}

/*
 * (Lab 11)
 * Name: Suppatouch Srinual (Nine)
 * ID: 2420210037
 * L11 1.2: mainCal.java
 *
 * ==================================================================================
 * main to check calculatorLab11.java
 * ==================================================================================
 */


public class mainCal {
    public static void main(String[] args) {
        // Create an instance of Calculator
        calculatorLab11 calculator = new calculatorLab11();

        // Call different overloaded add() methods.
        // add(int a, int b)
        System.out.println("Result: " + calculator.add(10, 20));

        // add(double a, double b)
        System.out.println("Result: " + calculator.add(21.0, 10.0));

        // add(int a, int b, int c)
        System.out.println("Result: " + calculator.add(10, 10, 10));

        // add(double a, int b)
        System.out.println("Result: " + calculator.add(12.5, 3));

        // add(int a, double b)
        System.out.println("Result: " + calculator.add(3, 12.5));
    }
}

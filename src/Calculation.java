/*
 * (Homework 8)
 * Name: Suppatouch Srinual (Nine)
 * ID: 2420210037
 * L8.10: Calculation.java
 *
 * ==================================================================================
 * Instructions: Create Calculation.java by implementing the following methods and
 * completing the provided code. Demonstrate how to use each method in the main() \
 * method.
 * ==================================================================================
 */


public class Calculation {
    // 10.1:
    public double average(int x, int y, int z, int m) {
        return (x + y + z + m) / 4.0;
    }

    // 10.2:
    public double toFahrenheit(double celsius) {
        return ((9.0 / 5.0) * celsius) + 32.0;
    }

    // 10.3:
    public double toCelsius(double fahrenheit) {
        return (fahrenheit - 32.0) / (5.0 * 9.0);
    }

    // 10.4:
    public int length(String firstString, String secondString) {
        return firstString.length() + secondString.length();
    }

    public static void main(String[] args) {
        Calculation calc = new Calculation();
        // Demonstrate 10.1:
        System.out.println(calc.average(1, 2,3, 4));    // 2.5
        // Demonstrate 10.2:
        System.out.println(calc.toFahrenheit(32.0));         // 89.6
        // Demonstrate 10.3:
        System.out.println(calc.toCelsius(32.0));          // 0.0
        // Demonstrate 10.4:
        System.out.println(calc.length("Hello", "World"));          // 10
    }
}

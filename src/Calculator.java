/*
    (Quiz): Simple Calculator
    Name: Suppatouch Srinual
    ID: 2420210037
    File: Calculator.java
*/


import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the input a (double): ");
        double a = scanner.nextDouble();
        System.out.print("Enter the input b (double): ");
        double b = scanner.nextDouble();
        System.out.print("Enter the input c (char): ");
        char c = scanner.next().charAt(0);

        if (c == '+' || c == '-' || c == '*' || c == '/') {
            switch (c) {
                case '+' -> System.out.println(a + b);
                case '-' -> System.out.println(a - b);
                case '*' -> System.out.println(a * b);
                case '/' -> {
                    if ((b == 0)) {
                        System.out.println("divisible b is 0.");
                    } else {
                        System.out.println(a / b);
                    }
                }
            }
        }
        else {
            System.out.println("Error: Invalid Operator.");
        }
    }
}

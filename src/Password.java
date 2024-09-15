/*
 * (Lab 7-6: Password)
 * Name: Suppatouch Srinual (Nine)
 * ID: 2420210037
 * L7-6: Password.java
 *
 * ==================================================================================
 * Write a program that takes input for a Password twice, and both inputs must match.
 * Use (compareTo, equals, ==) for comparison.
 * ==================================================================================
 */


import java.util.Scanner;

public class Password {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter password 1: ");
        String pass1 = scanner.nextLine();
        System.out.print("Enter password 2: ");
        String pass2 = scanner.nextLine();
        scanner.close();

        if (pass1.equals(pass2)) {
            System.out.println("Success!");
        }
        else {
            System.out.println("Failed! Please re-enter again!");
        }
    }
}

/*
 * (Homework 7)
 * Name: Suppatouch Srinual (Nine)
 * ID: 2420210037
 * PA 7.2: Factors.java
 *
 * ==================================================================================
 * A factor (or divisor) of a number is an integer that divides the number without
 * leaving a remainder. In the case of 21, the factors are: 1, 3, 7, and 21.
 *
 * Write a program to display all integers that can divide the number n, and display
 * the results on the same line.
 * ==================================================================================
 */


import java.util.Scanner;

public class Factors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the input n: ");
        int n = scanner.nextInt();
        scanner.close();

        String factors = "";
        for (int i = 1; i <= n; i++) {
            if (i == n) {
                factors += i;
            }
            else if (n % i == 0) {
                factors += i + ", ";
            }
        }
        System.out.println(factors);
    }
}

/*
 * (Homework 7)
 * Name: Suppatouch Srinual (Nine)
 * ID: 2420210037
 * PA 7.1: PrimeNumber.java
 *
 * ==================================================================================
 * Write a program that takes input from the user as a positive integer (n > 0) and
 * displays whether the integer is a prime number or not. If the number is a prime
 * number, the program should output "This is prime number"; otherwise, it should
 * out "Not prime".
 *
 * Definition: A prime number is a whole number that has exactly two divisor: 1 and
 * itself. Examples include: 2, 3, 5, 7, 11, 13, and 17. As seen, a prime number
 * cannot be evenly divided by and number other than 1 and itself. For instance, 2
 * is a prime number because it cannot be evenly divided by any other number.
 * ==================================================================================
 */


import java.util.Scanner;

public class PrimeNumber {
    public static String toDisplay(boolean isPrime) {
        if (isPrime) {
            return "This is prime number";
        }
        else {
            return "Not prime";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = scanner.nextInt();
        scanner.close();

        if (n <= 0) // Base case if n <= 0.
            System.out.println("Invalid number");

        else {
            // For-loop prime.
            boolean isPrime = true;
            int rangeDivisor = (int) Math.floor(Math.sqrt(n));
            for (int i = 2; i <= rangeDivisor; i++) {
                if (i == n) {
                    break;
                }
                else if (n % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            System.out.println(toDisplay(isPrime));

            // While-loop prime.
            boolean whilePrime = true;
            int i = 2;
            while (whilePrime || i <= rangeDivisor) {
                if (i == n) {
                    break;
                }
                else if (n % i == 0) {
                    whilePrime = false;
                }
                i++;
            }

            System.out.println(toDisplay(isPrime));
        }
    }
}

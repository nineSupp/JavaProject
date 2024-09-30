/*
    (Quiz): If-Else, SwitchCase
    Name: Suppatouch Srinual
    ID: 2420210037
    File: PNZ.java
*/


import java.util.Scanner;

public class PNZ {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the input (number): ");
        int input = scanner.nextInt();

        if (input > 0) {
            System.out.println("Positive");
        }
        else if (input == 0) {
            System.out.println("Zero");
        }
        else {
            System.out.println("Negative");
        }
    }
}

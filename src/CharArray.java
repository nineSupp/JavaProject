/*
 * (Lab 7-7: CharArray)
 * Name: Suppatouch Srinual (Nine)
 * ID: 2420210037
 * L7-7: CharArray.java
 *
 * ==================================================================================
 * Write a program that displays every character in a string, printing one character
 * per line, without printing out any spaces. Also, create a flowchart. (Hint: use
 * toCharArray()).
 * ==================================================================================
 */


import java.util.Scanner;

public class CharArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the input: ");
        String inputText = scanner.nextLine().replace(" ", "");
        scanner.close();

        char[] charArray = inputText.toCharArray();
        for(char c : charArray) {
            System.out.println(c);
        }
    }
}

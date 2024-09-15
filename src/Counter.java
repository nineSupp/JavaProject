/*
 * (Lab 7-8: Counter)
 * Name: Suppatouch Srinual (Nine)
 * ID: 2420210037
 * L7-8: Counter.java
 *
 * ==================================================================================
 * Write a program that counts the number of vowels and consonants in a given string.
 * Ignore spaces and treat the input as case-insensitive.
 * ==================================================================================
 */


import java.util.Scanner;

public class Counter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputText = scanner.nextLine().toLowerCase().replace(" ", "");
        scanner.close();

        int countVowels = 0;
        int countConsonants = 0;
        String vowels = "aeiou";
        for(int i = 0; i < inputText.length(); i++) {
            char c = inputText.charAt(i);
            if (vowels.indexOf(c) != -1) {
                countVowels++;
            }
            else if (c >= 'a' && c <= 'z') {
                countConsonants++;
            }
        }

        System.out.printf("Number of vowels: %d\nNumber of consonants: %d\n", countVowels, countConsonants);
    }
}

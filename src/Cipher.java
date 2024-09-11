/*
 * (Homework 7)
 * Name: Suppatouch Srinual (Nine)
 * ID: 2420210037
 * PA 7.3: Cipher.java
 *
 * ==================================================================================
 * Caesar cipher: is a type of secret key or symmetric key cryptography invented by
 * Julius Caesar to communicate with soldiers in his army and prevent information
 * from leaking to the enemy.
 *
 * The principle of the Caesar cipher is to shift the letters by 3 positions from
 * their original position.
 *
 * Example: of the Ciphertext by shifting 3 position:
 *      1) Ciphertext: QEB NRFZH YOLK CLU GRJMP LSBO QEB IXWV ALD
 *      2) Plaintext: the quick brown fox jumps over the lazy dog.
 *
 * Task: Write a program to encrypt a given string using the Caesar cipher. The input
 * consists of two lines:
 *      1) A String of text to be encrypted.
 *      2) An integer between -100 and 100, representing the number of position to
 *         shift the characters.
 *
 * Output: Online line of text with all characters shifted and converted to lowercase.
 * ==================================================================================
 */


import java.util.Scanner;

public class Cipher {
    public static void main(String[] args) {
        // Test case: QEB NRFZH YOLTK CLU GRJMP LSBO QEB IXWV ALD
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the text: ");
        String text = scanner.nextLine().toLowerCase();
        System.out.print("Enter the n (-100 to 100): ");
        int n = scanner.nextInt();
        scanner.close();

        if (n < -100 || n > 100) // Base case.
            System.out.println("Invalid input for n.");

        String alphabets = "abcdefghijklmnopqrstuvwxyz";
        String cipheredText = "";

        for(int i = 0; i < text.length(); i++) {
            int dexAlpha = (alphabets.indexOf(text.charAt(i)) + n) % alphabets.length();
            if (text.charAt(i) == ' ') {
                cipheredText += " ";
            }
            else if (dexAlpha < 0) {
                cipheredText += alphabets.charAt(alphabets.length() + dexAlpha);
            }
            else {
                cipheredText += alphabets.charAt(dexAlpha);
            }
        }

        System.out.println(cipheredText);
    }
}

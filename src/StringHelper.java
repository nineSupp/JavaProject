/*
 * (Homework 10)
 * Name: Suppatouch Srinual (Nine)
 * ID: 2420210037
 * PA 10.5: StringHelper.java
 *
 * ==================================================================================
 * You are tasked with implementing a utility class called StringHelper
 * (StringHelper.java) that provides two instance methods:
 * substring(String input, int index) and reverse(String input).
 * The Main.java class will test these methods by creating an instance of
 * StringHelper and calling the methods.
 *
 * Task 1: Implement the substring(String input, int index) Methods
 *      Method Signature:
 *          public String substring(String input, int index)
 *
 *      Description: This method should return a word from the input text based on
 *      the provided index. Words in the input text are separated by a single space
 *      (' ').
 *
 *      Examples:
 *          substring("one two three", 2) should return "two"
 *          substring("one;two three", 2) should return "three"
 *          substring("one", 1) should return "one"
 *      Edge Cases:
 *          If the index is less than 1, throw an IllegalArgumentException with the
 *          message: "Index should be 1 or greater".
 *          If the input string does not contain enough words, throw an
 *          IllegalArgumentException with the message: "Index out of bounds:
 *          not enough words".
 *          If the input string is null, throw an IllegalArgumentException with the
 *          message: "Input cannot be null".
 *
 * Task 2: Implement the reverse(String input) Methods
 *      Method Signature:
 *          public String reverse(String input)
 *
 *      Description: This method should return the reversed version of the input
 *      string. The reversal should reverse the characters in the entire string,
 *      not just individual words.
 *
 *      Examples:
 *          reverse("hello") should return "olleh"
 *          reverse("one two three") should return "eerht owt eno"
 *      Edge Cases:
 *          If the input is null, throw an IllegalArgumentException with the message:
 *          "Input cannot be null".
 *
 * Implement the substring and reverse methods in StringHelper.java as instance
 * methods.
 *
 * Use the provided signatures for both methods.
 *
 * Ensure that the methods handle edge cases and throw the correct exceptions.
 *
 * Write your test cases in Main.java by creating an instance of StringHelper and
 * invoking the methods. Test a variety of inputs, including edge cases.
 * ==================================================================================
 */


public class StringHelper {
    public String substring(String input, int index) {
        if ( input == null ) {
            throw new IllegalArgumentException("Input cannot be null");
        }
        else if (index < 1) {
            throw new IllegalArgumentException("Index should be 1 or greater");
        }
        else if (index > input.split(" ").length) {
            throw new IllegalArgumentException("Index out of bounds: not enough words");
        }
        else {
            return input.split(" ")[index - 1];
        }
    }

    public String reverse(String input) {
        if ( input == null ) {
            throw new IllegalArgumentException("Input cannot be null");
        }
        else {
            String reversed = "";
            for (int i = input.length() - 1; i >= 0; i--) {
                reversed += input.charAt(i);
            }
            return reversed;
        }
    }
}

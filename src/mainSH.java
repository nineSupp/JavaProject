/*
 * (Homework 10)
 * Name: Suppatouch Srinual (Nine)
 * ID: 2420210037
 * PA 10.2: mainSH.java
 *
 * ==================================================================================
 * main test for StringHelper.java
 * ==================================================================================
 */


public class mainSH {
    public static void main(String[] args) {
        // Create an instance of StringHelper
        StringHelper helper = new StringHelper();

        // Testing substring method
        System.out.println(helper.substring("one two three", 2)); // should print "two"
        System.out.println(helper.substring("hello world", 1)); // should print "hello"

        // My test case for substring method.
        System.out.println(helper.substring("one two three", 1));   // should print "one".
        System.out.println(helper.substring("one two three", 3));   // should print "three".
//        System.out.println(helper.substring("one two three", 4));   // throw IllegalArgumentException
//        System.out.println(helper.substring("one two three", 0));   // throw IllegalArgumentException

        // Testing reverse method
        System.out.println(helper.reverse("hello")); // should print "olleh"
        System.out.println(helper.reverse("Java programming")); // should print "gnimmargorp avaJ"
        System.out.println(helper.reverse("Hello my name is Nine"));
            // should print eniN si eman ym olleH

        // Edge cases (comment these to avoid crashing the program)
        // System.out.println(helper.substring("one", 2)); // should throw IllegalArgumentException
        // System.out.println(helper.reverse(null)); // should throw IllegalArgumentException

    }
}

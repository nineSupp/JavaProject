/*
 * (Lab 8)
 * Name: Suppatouch Srinual (Nine)
 * ID: 2420210037
 * L8.2: Calculate.java
 *
 * ==================================================================================
 * Instruction: Write a method called calculateAverage(...) that accepts an array of
 * integers and returns the average of the array. Then, display the output.
 *
 * For example, given:
 *      int[] arr  = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
 *
 * Output:
 *      Average: 5.5
 * ==================================================================================
 */


public class Calculate {
    public static double calculateAverage(int[] arr) {
        double sum = 0.0;

        for(int num : arr) {
            sum += num;
        }

        return sum / arr.length;
    }

    public static void main(String[] args) {
        // Example array: int[] arr = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10];

        // Calculate the average and display the result
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        double average = calculateAverage (arr);
        System.out.println("Average: " + average);
    }
}



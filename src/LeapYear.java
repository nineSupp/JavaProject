/*
 * (Homework 7)
 * Name: Suppatouch Srinual (Nine)
 * ID: 2420210037
 * PA 7.5: LeapYear.java
 *
 * ==================================================================================
 * Leap YeaR: is a year which an extra day is added to the Gregorian calendar, which
 * is the standard calendar used in most parts of the world today. A leap year is
 * typically a year divisible by 4. In each leap year, February has 29 days instead
 * of 28. The addition of a day every four years compensates for the fact that a
 * regular year of 365 days is about 14 days or 6 hours shorter than a solar year.
 * There are some exceptions to this rule: since a solar year is slightly less than
 * 365.25 days, a year divisible by 100 is not a leap year, except when it is also
 * divisible by 400. For example, the years 1600 and 2000 are leap years, by 1700,
 * 1800, and 1900 are not.
 *
 * Write a program that takes a year as input and displays whether it is a leap year
 * or not.
 *
 *      Input                       Output
 *      2020                       Leap Year
 *      1700                    Not a leap year
 *      1600                       Leap Year
 *      1999                    Not a leap year
 * ==================================================================================
 */


import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the year: ");
        int year = scanner.nextInt();

        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.println("Leap Year");
                }
                else {
                    System.out.println("Not a leap Year");
                }
            }
            else {
                System.out.println("Leap Year");
            }
        } else {
            System.out.println("Not a leap year");
        }
    }
}

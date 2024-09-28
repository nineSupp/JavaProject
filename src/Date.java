/*
 * (Lab 9)
 * Name: Suppatouch Srinual (Nine)
 * ID: 2420210037
 * L9.1: Date.java
 *
 * ==================================================================================
 * Program Requirements:
 *      ● Create the Date class according to the provided class diagram.
 *      ● Validate the data for day within the range [1, 31], month within the range
 *        [1, 12], and year within the range [1900, 9999].
 *      ● Create a constructor that validates the data through setters and accepts
 *        day, month, and year as inputs.
 *      ● Implement the toString() method, which formats the output as "dd/mm/yyyy".
 *        Single-digit days should be preceded by a zero, such as "06" for the 6th,
 *        resulting in "06/08/1987". Hint: String.format.
 *      ● The toString() method should be a public method that displays the
 *        instance's data as a string using <instance>.toString();.
 *
 * Output: (The format of the day, month, and year should have a leading zero for
 * single-digit values.)
 * ==================================================================================
 */


public class Date {
    private int day;
    private int month;
    private int year;

    public Date() {
        this.day = 0;
        this.month = 0;
        this.year = 0;
    }

    public Date(int day, int month, int year) {
        if (checkDay(day) && checkMonth(month) && checkYear(year)) {
            this.day = day; this.month = month; this.year = year;
        }
        else {
            if (!checkDay(day)) {
                if (!checkMonth(month)) {
                    if (!checkYear(year)) {
                        System.out.println("The input for day/month/year is invalid.");
                    }
                }
                else {
                    System.out.println("The input for day is invalid.");
                }
            }
            else if (!checkMonth(month)) {
                System.out.println("The input for month is invalid.");
            }
            else if (!checkYear(year)) {
                System.out.println("The input for year is invalid.");
            }

            this.day = 0; this.month = 0; this.year = 0;
        }
    }

    private boolean checkDay(int day) { return day >= 1 && day <= 31; }

    private boolean checkMonth(int month) { return month >= 1 && month <= 12; }

    private boolean checkYear(int year) { return 1900 <= year && year <= 9999; }

    @Override
    public String toString() {
        return String.format("%02d/%02d/%04d", day, month, year);
    }
}

/*
 * (Homework 9)
 * Name: Suppatouch Srinual (Nine)
 * ID: 2420210037
 * L9.3.1: Time.java
 *
 * ==================================================================================
 * Implement a class Time [PA-9.3.1 Time.java, PA-9.3.2 TimeTest.java]
 *
 * Requirements:
 *      1. Attributes:
 *          a. hour (integer, 0-23): Represents the hour of the day.
 *          b. minute (integer, 0-59): Represents the minute of the hour.
 *          c. second (integer, 0-59): Represents the second of the minute.
 *      2. Constructors:
 *          a. A default constructor that sets the time to 00:00:00.
 *          b. A parameterized constructor that allows the user to set the hour,
 *             minute, and second.
 *          c. A constructor that accepts a string in the format "HH:MM:SS"
 *             and initializes the time accordingly.
 *      3. Methods:
 *          a. setTime(int hour, int minute, int second): Sets the time to the given
 *             hour, minute, and second.
 *          b. getHour(), getMinute(), getSecond(): Getters for each attribute.
 *          c. setHour(int hour), setMinute(int minute), setSecond(int second):
 *             Setters for each attribute with validation (e.g., hour must be
 *             between 0 and 23).
 *          d. boolean equals(Object obj): Overrides the equals method to compare
 *             two Time objects.
 *          e. int compareTo(Time other): Compares this Time object with another
 *             Time object. Returns:
 *                 - A negative integer if this Time is before the other Time.
 *                   Zero if this Time is equal to the other Time.
 *                 - A positive integer if this Time is after the other Time.
 *          f. String toString(): Returns a string representation of the time in
 *             the format "HH:MM".
 *      4. Testing:
 *          a. Write a test program that creates multiple Time objects and
 *             demonstrates the use of all methods.
 * ==================================================================================
 */


public class Time {
    // 1. Create instance variables or attributes.
    private int hour;
    private int minute;
    private int second;

    // 2. Constructors
    // 2.1. Default constructor that sets time to 00:00:00.
    public Time() {
        this.hour = 0;
        this.minute = 0;
        this.second = 0;
    }

    // 2.2. Constructor that allow to set hour, minute, second.
    public Time(int hour, int minute, int second) {
        this.getTime(String.format("%02d:%02d:%02d", hour, minute, second));
    }

    // 2.3. Constructor for string format.
    public Time(String time) { this.getTime(time); }

    // 3. Methods
    // 3.1. getTime(String time) is a custom method or helper function that will break down the input
    //      string into each category: hour, minute, second.
    private void getTime(String time) {
        // String.split() will split the string according to the delimiter ":".
        String[] timeToken = time.split(":");
        // Looping the String[] to get each category; hour, minute; second.
        for(int i = 0; i < timeToken.length; i++) {
            // The string format should have a length of exactly 2. Else print("Error Message").
            // This means that the range of each format will start from: {00 - 99}.
            if (timeToken[i].length() == 2) {
                switch (i) {
                    case 0 -> this.calibrateHours(Integer.parseInt(timeToken[i]));
                    case 1 -> this.calibrateMinutes(Integer.parseInt(timeToken[i]));
                    case 2 -> this.calibrateSeconds(Integer.parseInt(timeToken[i]));
                }
            }
            else {
                // If format error, then print(Error message) and reset the values.
                System.out.println("String of the time format exceeds limitation!");
                this.hour = 0; this.minute = 0; this.second = 0;
                break;
            }
        }
    }

    // 3.2. calibrateSeconds() is a custom method, that will calibrate the input seconds. Because
    //      if input second is >= 60. Then, this.minute++.
    private void calibrateSeconds(int second) {
        if (second >= 60) {
            int countMinutes = 0;
            for(int i = second; i >= 60 ; i %= 60) {
                countMinutes++;
            }

            this.minute += countMinutes;
            this.second = second % 60;
        }
        else {
            this.second = second;
        }
    }

    // 3.3. calibrateMinutes() is a custom method, that will calibrate the input seconds. Because
    //      if input minute is >= 60. Then, this.hour++.
    private void calibrateMinutes(int minute) {
        if (minute >= 60) {
            int countHours = 0;
            for(int i = minute; i >= 60; i %= 60) {
                countHours++;
            }

            this.hour += countHours;
            this.minute = minute % 60;
        }
        else {
            this.minute = minute;
        }
    }

    // 3.4. calibrateHours() is a custom method, that will calibrate the input hour. Because
    //      the range of hour is from: {00 - 24}. Once the hour is beyond 24 it'll reset to 00.
    private void calibrateHours(int hour) {
        if (hour >= 24) {
            this.hour = hour % 24;
        }
        else {
            this.hour = hour;
        }
    }

    // 3.5. sumToSeconds() is a custom method, that will sum the total time into seconds format.
    private int sumToSeconds() {
        return (this.getHour() * 3600) + (this.getMinute() * 60) + this.getSecond();
    }

    // 3.6. getHour() is a method, that will get the private variable hour.
    public int getHour() { return this.hour; }

    // 3.7. getMinute() is a method, that will get the private variable minute.
    public int getMinute() { return this.minute; }

    // 3.8. getSecond() is a method, that will get the private variable second.
    public int getSecond() { return this.second; }

    // 3.9. setTime() is a method, that will take the integer input of hour, minute, second.
    //      which will update the instance variable to the input.
    public void setTime(int hour, int minute, int second) {
        this.getTime(String.format("%02d:%02d:%02d", hour, minute, second));
    }

    // 3.10. setHour() is a method, that will take the integer input hour.
    //       the validation is that the input must be within the range 0 - 24.
    public void setHour(int hour) {
        if (hour <= 24 && hour >= 0) {
            this.calibrateHours(hour);
        }
        else {
            System.out.println("The input time is beyond 24-hrs range!");
        }
    }

    // 3.11. setMinute() is a method, that will take the integer input minute.
    //       the validation is that the input must be within the range 0 - 60.
    public void setMinute(int minute) {
        if (minute <= 60 && minute >= 0) {
            this.calibrateMinutes(minute);
        }
        else {
            System.out.println("The input time is beyond 60-mins range!");
        }
    }

    // 3.12. setSecond() is a method, that will take the integer inout second.
    //       the validation is that the input must be within the range 0 - 60.
    public void setSecond(int second) {
        if (second <= 60 && second >= 0) {
            this.calibrateSeconds(second);
        }
        else {
            System.out.println("The input time is beyond 60-secs range!");
        }
    }

    // 3.13. compareTo() is a method, that will take the input of another object. And return
    //       the difference between this and other time.
    public int compareTo(Time other) { return this.sumToSeconds() - other.sumToSeconds(); }

    // 3.14. equals() is a override method that will check if time difference is the same or not.
    @Override
    public boolean equals(Object o) {
        if (this.compareTo((Time) o) > 0 || this.compareTo((Time) o) < 0) {
            return false;
        }
        else {
            return true;
        }
    }

    // 3.15. toString() is a override method that will return a string format "HH:MM:SS".
    @Override
    public String toString() {
        return String.format("%02d:%02d:%02d", this.hour, this.minute, this.second);
    }
}

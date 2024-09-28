/*
 * (Homework 9)
 * Name: Suppatouch Srinual (Nine)
 * ID: 2420210037
 * L9.3.2: TimeTest.java
 *
 * ==================================================================================
 * Instruction: Testing Time object through proper logic.
 *
 * Assumptions:
 *      1. The input will always be a digit characters.
 *      2. And that the time string is always in this format: HH:MM:SS.
 * ==================================================================================
 */

public class TimeTest {
    public static void main(String[] args) {
        // 1. Testing all the constructors.
        // 1.1. Testing the default constructor.
        Time t1 = new Time();
        System.out.println(t1.toString());          // 00:00:00

        System.out.println();

        // 1.2. Testing the parameterized input int. Without exceeding the time limitation.
        Time t1_2 = new Time(13, 45, 32);
        System.out.println(t1_2.toString());        // 13:45:32

        // 1.2.1. Testing the parameterized input int. That the second exceed 60.
        Time t1_2_1 = new Time(13, 45, 80);
        System.out.println(t1_2_1.toString());      // 13:46:20

        // 1.2.2. Testing the parameterized input int. That the minute exceed 60.
        Time t1_2_2 = new Time(13, 62, 32);
        System.out.println(t1_2_2.toString());      // 14:02:32

        // 1.2.3. Testing the parameterized input int. That the hour exceed 24.
        Time t1_2_3 = new Time(32, 62, 45);
        System.out.println(t1_2_3.toString());      // 09:02:45

        // 1.2.4. Testing the parameterized input int. That format exceeds the limitation.
        Time t1_2_4 = new Time(100, 62, 45);    // String of the time format exceeds limitation.!
//        System.out.println(t1_2_4.toString());    // 00:00:00

        System.out.println();

        // 1.3. Testing the parameterized input String. Without exceeding the time limitation.
        Time t1_3 = new Time("23:22:30");
        System.out.println(t1_3.toString());        // 23:22:30

        // 1.3.1. Testing the parameterized input String. That the second exceed 60.
        Time t1_3_1 = new Time("23:22:74");
        System.out.println(t1_3_1.toString());      // 23:23:14

        // 1.3.2. Testing the parameterized input String. That the minute exceed 60.
        Time t1_3_2 = new Time("23:93:22");
        System.out.println(t1_3_2.toString());      // 24:33:22

        // 1.3.3. Testing the parameterized input String. that the hour exceed 24.
        Time t1_3_3 = new Time("42:33:22");
        System.out.println(t1_3_3.toString());      // 18:33:22

        // 1.3.4. Testing the parameterized input String. The format exceeds the limitation.
        Time t1_3_4 = new Time("23:332:44");    // String of the time format exceeds limitation.!
//        System.out.println(t1_3_4.toString());    // 00:00:00

        System.out.println();

        // 2. Testing methods
        Time t2 = new Time();
        Time t2_1 = new Time(24, 14, 11);
        Time t2_2 = new Time(15, 32, 20);
        Time t2_3 = new Time("08:23:50");
        // 2.1. Testing getHour().
        System.out.println(t2.getHour());       // 0
        System.out.println(t2_1.getHour());     // 0
        System.out.println(t2_2.getHour());     // 15
        System.out.println(t2_3.getHour());     // 8

        System.out.println();

        // 2.2. Testing getMinute().
        System.out.println(t2.getMinute());     // 0
        System.out.println(t2_1.getMinute());   // 14
        System.out.println(t2_2.getMinute());   // 32
        System.out.println(t2_3.getMinute());   // 23

        System.out.println();

        // 2.3. Testing getSeconds().
        System.out.println(t2.getSecond());     // 0
        System.out.println(t2_1.getSecond());   // 11
        System.out.println(t2_2.getSecond());   // 20
        System.out.println(t2_3.getSecond());   // 50

        System.out.println();

        // 2.4. Testing setHour().
        t2.setHour(23);
        System.out.println(t2.toString());      // 23:00:00
        t2_1.setHour(11);
        System.out.println(t2_1.toString());    // 11:14:11
        t2_2.setHour(01);
        System.out.println(t2_2.toString());    // 01:32:20
        t2_3.setHour(72);                       // The input time is beyond 24-hrs range!
        System.out.println(t2_3.toString());    // 08:23:50

        System.out.println();

        // 2.5. Testing setMinute().
        t2.setMinute(23);
        System.out.println(t2.toString());      // 23:23:00
        t2_1.setMinute(43);
        System.out.println(t2_1.toString());    // 11:43:11
        t2_2.setMinute(50);
        System.out.println(t2_2.toString());    // 01:50:20
        t2_3.setMinute(90);                     // The input time is beyond 60-mins range!
        System.out.println(t2_3.toString());    // 08:23:50

        System.out.println();

        // 2.6 Testing setSeconds().
        t2.setSecond(23);
        System.out.println(t2.toString());      // 23:23:23
        t2_1.setSecond(0);
        System.out.println(t2_1.toString());    // 11:43:00
        t2_2.setSecond(34);
        System.out.println(t2_2.toString());    // 01:50:34
        t2_3.setSecond(132);                    // The input time is beyond 60-secs range!
        System.out.println(t2_3.toString());    // 08:23:50

        System.out.println();

        // 2.7 Testing setTime().
        t2_1.setTime(23, 23, 23);
        System.out.println(t2_1.toString());    // 23:23:23

        // 2.8. Testing compareTo().
        System.out.println(t2.compareTo(t2_1)); // 0
        System.out.println(t2.compareTo(t2_2)); // 77569
        System.out.println(t2_3.compareTo(t2)); // -53973

        // 2.9. Testing equals().
        System.out.println(t2.equals(t2_1));    // true
        System.out.println(t2.equals(t2_2));    // false
        System.out.println(t2_3.equals(t2));    // false
    }
}

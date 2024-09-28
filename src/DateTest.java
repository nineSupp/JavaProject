/*
 * (Lab 9)
 * Name: Suppatouch Srinual (Nine)
 * ID: 2420210037
 * L9.1: Date.java
 *
 * ==================================================================================
 *      ● Test the implementation using the DateTest.java class.
 *      ● Test with invalid dates, such as "40/22/10000" → “00/00/0”.
 *         ● Provide 3 additional test cases to satisfy the requirements.
 * ==================================================================================
 */


public class DateTest {
    public static void main(String[] args) {
        // Ajarn Test Case.
        Date date = new Date(20, 6, 2022);
        System.out.println(date);

        // My Test Case.
        // Error to all parameters.
        Date date1 = new Date(40, 22, 10000);
        System.out.println(date1);

        // Error to day.
        Date date2 = new Date(32, 12, 2000);
        System.out.println(date2);

        // Error to month.
        Date date3 = new Date(11, 0, 1995);
        System.out.println(date3);

        // Error to year.
        Date date4 = new Date(11, 10, 1800);
        System.out.println(date4);
    }
}

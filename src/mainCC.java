/*
 * (Homework 12)
 * Name: Suppatouch Srinual (Nine)
 * ID: 2420210037
 * PA 12.2: mainCC.java
 *
 * ==================================================================================
 * Task:
 * Use this class to perform the following operations:
 *      ((10 + 5 - 3) * 2) / 4 and print the result.

 * ==================================================================================
 */


public class mainCC {
    public static void main(String[] args) {
        ChainedCalculator calc = new ChainedCalculator(10);
        calc.add(5).subtract(3).multiply(2).divide(4).result();     // 6.0


        // Please perform (Result: 55.0): (((8 + 4) / 2) * 10 - 5)
        ChainedCalculator calc1 = new ChainedCalculator(8);
        calc1.add(4).divide(2).multiply(10).subtract(5).result();
    }
}

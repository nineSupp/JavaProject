/*
 * (Homework 10)
 * Name: Suppatouch Srinual (Nine)
 * ID: 2420210037
 * PA 10.4: mainCar.java
 *
 * ==================================================================================
 * Task 5: Test the Inheritance Chain
 *
 * Create a Main class (Main.java) with a main() method that demonstrates the
 * following:
 *      - Create instances of both Hatchback and SUV.
 *      - Set the model of both cars using the setModel() method.
 *      - Print the price and model of each car.
 *      - Print the maximum speed of both the Hatchback and SUV.
 *      - Use the toString() method to print details of each car.
 *      - Demonstrate method chaining with the SUV class.
 * ==================================================================================
 */


public class mainCar {
    public static void main(String[] args) {
        // Test for task 3.
        Suv suv = new Suv().setModel("Toyota").printPrice();

        // Main test cases.
        // 1. Create instances of both Hatchback and Suv.
        Hatchback hondaJazz = new Hatchback();
        Suv fordEverest = new Suv();

        // 2. Set the model of both cars using the setModel() method.
        hondaJazz.setModel("Honda Jazz");
        fordEverest.setModel("Ford Everest");

        // 3. Print the price and model of each car.
        // 4. Print the maximum speed of both Hatch and Suv.
        hondaJazz.printPrice();
        System.out.println(hondaJazz);
        System.out.println(hondaJazz.maxSpeed());

        System.out.println();

        fordEverest.printPrice();
        System.out.println(fordEverest);
        System.out.println(fordEverest.maxSpeed());

        System.out.println();

        // 5. Demonstrate method chaining with the Suv class.
        Suv toyotaFortuner = new Suv().setModel("Toyota Fortuner").printPrice();
    }
}

/*
 * (Homework 8)
 * Name: Suppatouch Srinual (Nine)
 * ID: 2420210037
 * L8.7: ProductTest.java
 *
 * ==================================================================================
 * Please complete ProductTest.java
 * ==================================================================================
 */


class Product {
    String productName;
    String type;
    int rating;

    void rateIt(int rating) {
        System.out.println("This product has rating: " + rating);
    }
}

public class ProductTest {
    public static void main(String[] args) {
        // Object 1.
        Product asahiBeer = new Product();
        asahiBeer.productName = "Asahi Beer";
        asahiBeer.type = "Beer";
        asahiBeer.rating = 5;
        asahiBeer.rateIt(asahiBeer.rating);

        // Object 2.
        Product iPhone16 = new Product ();
        iPhone16.productName = "iPhone16";
        iPhone16.type = "Smart Phone";
        iPhone16.rating = 3;
        iPhone16.rateIt(iPhone16.rating);

        // Object 3
        Product poysian = new Product();
        poysian.productName = "Poysian Inhaler";
        poysian.type = "inhaler";
        poysian.rating = 10;
        poysian.rateIt(poysian.rating);

        // Based on the problem, create object 4 according to the specifications by writing the code yourself.
        Product bossCoffee = new Product();
        bossCoffee.productName = "Boss Coffee";
        bossCoffee.type = "coffee";
        bossCoffee.rating = 7;
        bossCoffee.rateIt(bossCoffee.rating);

        // Come up with a product (object 5), specify its name, type, and rating, then write a command to display
        // the rating.
        Product banana = new Product();
        banana.productName = "B Farm";
        banana.type = "Fruit";
        banana.rating = 2;
        banana.rateIt(banana.rating);
    }
}

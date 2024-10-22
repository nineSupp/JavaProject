/*
 * (Homework 11)
 * Name: Suppatouch Srinual (Nine)
 * ID: 2420210037
 * PA 11.2: hwCircle.java
 *
 * ==================================================================================
 * Task 2: Implement the Circle Class  [PA11-2 Shape.java]
 *
 * Create a Circle class that extends the Shape class:
 *      - Add a private attribute radius of type double.
 *      - Implement constructors: one default, one for radius, and another with all
 *        attributes (radius, color, and filled).
 *      - Implement the getArea() and getPerimeter() methods using the formulas:
 *        Area = π * radius²
 *        Perimeter = 2 * π * radius
 *      - Override the toString() method to provide the details of the circle:
 *        "A Circle with radius=xxx, which is a subclass of yyy"
 * ==================================================================================
 */


import java.util.Formatter;

public class hwCircle extends hwShape{
    private double radius;

    public hwCircle() {
        super();
        this.radius = 0.0;
    }

    public hwCircle(double radius) {
        super();
        this.radius = radius;
    }

    public hwCircle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() { return this.radius; }

    public void setRadius(double radius) { this.radius = radius; }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(this.radius, 2);
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * this.radius;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Formatter formatter = new Formatter(sb);
        formatter.format("A Circle with radius = %.1f, which is a subclass of %s", this.radius,
                super.toString());
        return formatter.toString();
    }
}

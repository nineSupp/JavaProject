/*
 * (Homework 11)
 * Name: Suppatouch Srinual (Nine)
 * ID: 2420210037
 * PA 11.3: hwRectangle.java
 *
 * ==================================================================================
 * Task 3: Implement the Rectangle Class [PA11-3 Rectangle.java]
 *
 * Create a Rectangle class that extends Shape:
 *      - Add two private attributes width and length of type double.
 *      - Implement constructors: one default, one for width and length, and another
 *        with all attributes (width, length, color, and filled).
 *      - Implement getArea() and getPerimeter() methods:
 *        Area = width * length
 *        Perimeter = 2 * (width + length)
 *      - Override the toString() method to provide the details of the rectangle:
 *        "A Rectangle with width=xxx and length=zzz, which is a subclass of yyy"
 * ==================================================================================
 */


import java.util.Formatter;

public class hwRectangle extends hwShape{
    private double width;
    private double length;

    public hwRectangle() {
        super();
        this.width = 0.0;
        this.length = 0.0;
    }

    public hwRectangle(double width, double length) {
        super();
        this.width = width;
        this.length = length;
    }

    public hwRectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getLength() { return this.length; }

    public double getWidth() { return this.width; }

    public void setLength(double length) { this.length = length; }

    public void setWidth(double width) { this.width = width; }

    @Override
    public double getArea() {
        return this.width * this.length;
    }

    @Override
    public double getPerimeter() {
        return 2 * (this.width + this.length);
    }

    @ Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Formatter formatter = new Formatter(sb);
        formatter.format("A Rectangle with width = %.1f and length = %.1f, which is a" +
                " subclass of %s", this.width, this.length, super.toString());
        return formatter.toString();
    }
}

/*
 * (Homework 11)
 * Name: Suppatouch Srinual (Nine)
 * ID: 2420210037
 * PA 11.4: hwSquare.java
 *
 * ==================================================================================
 * Task 4: Implement the Square Class [PA11-4 Square.java]
 *
 * Create a Square class that extends Rectangle:
 *      - This class represents a square, so its width and length will always be the
 *        same.
 *      - Provide constructors for side only and also with color and filled.
 *      - Implement a getSide() and setSide() method to access or modify the side of
 *        the square.
 *      - Override getArea(), getPerimeter(), and toString() methods based on the
 *        Rectangle class.
 *      - For toString(): "A Square with side=xxx, which is a subclass of yyy"
 * ==================================================================================
 */


import java.util.Formatter;

public class hwSquare extends hwRectangle {
    public hwSquare() {
        super();
    }

    public hwSquare(double side) {
        super(side, side);
    }

    public hwSquare(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    public double getSide() { return this.getLength(); }

    public void setSide(double side) {
        this.setLength(side);
        this.setWidth(side);
    }

    @Override
    public double getArea() { return Math.pow(this.getSide(), 2); }

    @Override
    public double getPerimeter() { return 4 * this.getSide(); }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Formatter formatter = new Formatter(sb);
        formatter.format("A Square with side = %.1f, which is a subclass of %s", this.getSide(),
                super.toString());
        return formatter.toString();
    }
}

/*
 * (Homework 11)
 * Name: Suppatouch Srinual (Nine)
 * ID: 2420210037
 * PA 11.1: hwShape.java
 *
 * ==================================================================================
 * Task 1: Define the Abstract Shape Class [PA11-1 Shape.java]
 *
 * Create an abstract class Shape:
 *      - Include two private attributes: color (String) and filled (boolean).
 *      - Add two constructors: one default constructor and another that initializes
 *        color and filled.
 *      - Define getter and setter methods for color and filled.
 *      - Add abstract methods getArea(), getPerimeter().
 *      - Override the toString() method to provide the details of the shape: "A
 *        Shape with color of xxx and filled/Not filled"
 * ==================================================================================
 */


import java.util.Formatter;

public abstract class hwShape {
    private String color;
    private boolean filled;

    public hwShape() {
        this.color = "";
        this.filled = false;
    }

    public hwShape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() { return this.color; }

    public boolean getFilled() { return this.filled; }

    public void setColor(String color) { this.color = color; }

    public void setFilled(boolean filled) { this.filled = filled; }

    public boolean isFilled() { return this.filled; }

    public abstract double getArea();

    public abstract double getPerimeter();

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Formatter formatter = new Formatter(sb);
        formatter.format("A Shape with color of %s and %s", this.getColor(), (this.getFilled() ? "filled" :
                "not filled"));
        return sb.toString();
    }
}

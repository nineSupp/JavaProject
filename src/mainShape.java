/*
 * (Lab 11)
 * Name: Suppatouch Srinual (Nine)
 * ID: 2420210037
 * L11 3.5: mainShape.java
 *
 * ==================================================================================
 * Main class for Shape to run.
 * ==================================================================================
 */


import java.util.ArrayList;
import java.util.List;

public class mainShape {
    public static void main(String[] args) {
        // Create a list of shapes
        List<Shape> shapes = new ArrayList<>();

        // Add different shapes to the list (Upcasting)
        shapes.add(new Circle());       // Circle upcast to Shape
        shapes.add(new Rectangle());    // Rectangle upcast to Shape
        shapes.add(new Triangle());     // Triangle upcast to Shape

        // Iterate through the list and call draw() on each shape
//        for(Shape shape : shapes) {
//            shape.draw();       // Calls the appropriate draw method based on the object type
//        }

        // Call the draw() method to display each shape in a JFrame
        // Create instances of shapes
        Shape circle = new Circle();
        circle.draw();

        Shape rectangle = new Rectangle();
        rectangle.draw();

        Shape triangle = new Triangle();
        triangle.draw();
    }
}

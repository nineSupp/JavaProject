/*
 * (Lab 11)
 * Name: Suppatouch Srinual (Nine)
 * ID: 2420210037
 * L11 2.2: Circle.java
 *
 * ==================================================================================
 * Create Subclasses: Circle, Rectangle, and Triangle. Each providing its own
 * implementation of the draw() method.
 * ==================================================================================
 */


import java.awt.*;

public class Circle extends Shape {
    @Override
    public void draw() {
        System.out.println("Draw a circle");
        super.draw();        // Display the JFrame for the shape
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.RED);      // Set color for the circle
        g.fillOval(100, 100, 200, 200);  // Draw a filled circle (oval)
    }
}

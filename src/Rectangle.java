/*
 * (Lab 11)
 * Name: Suppatouch Srinual (Nine)
 * ID: 2420210037
 * L11 2.3: Rectangle.java
 *
 * ==================================================================================
 * Create Subclasses: Circle, Rectangle, and Triangle. Each providing its own
 * implementation of the draw() method.
 * ==================================================================================
 */


import java.awt.*;

public class Rectangle extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a rectangle");
        super.draw();                    // Display the JFrame for the shape
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.BLUE);         // Set color for the rectangle
        g.fillRect(100, 100, 200, 200);     // Draw a filled rectangle
    }
}

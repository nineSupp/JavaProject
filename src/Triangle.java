/*
 * (Lab 11)
 * Name: Suppatouch Srinual (Nine)
 * ID: 2420210037
 * L11 2.4: Triangle.java
 *
 * ==================================================================================
 * Create Subclasses: Circle, Rectangle, and Triangle. Each providing its own
 * implementation of the draw() method.
 * ==================================================================================
 */


import java.awt.*;

public class Triangle extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a triangle");
        super.draw();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.GREEN);
        int width = getWidth();
        int height = getHeight();
        int size = 200 / 2;
        int[] x = {width / 2, (width / 2) - (size), (width / 2) + (size)};
        int[] y = {(height / 2) - (size), (height / 2) + (size), (height / 2) + (size)};
        g.fillPolygon(x, y, 3);
    }
}

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

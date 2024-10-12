/*
 * (Lab 11)
 * Name: Suppatouch Srinual (Nine)
 * ID: 2420210037
 * L11 2.1: Shape.java
 *
 * ==================================================================================
 * Create a base class Shape with a method draw(), and several subclasses like Circle,
 * Rectangle, and Triangle, each of which overrides the draw() method. The program
 * will use upcasting to treat different shapes as Shape objects while still invoking
 * the overridden draw() methods at runtime, demonstrating polymorphism.
 * ==================================================================================
 */


import javax.swing.*;

public class Shape extends JPanel {
    // Method to be overridden by subclass
    public void draw() {
        System.out.println("Drawing a shape");
        showShape();
    }

    public void showShape() {
        JFrame frame = new JFrame();
        frame.setSize(400, 400);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(this);
        frame.setVisible(true);
    }
}

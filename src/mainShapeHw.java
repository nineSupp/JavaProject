/*
 * (Homework 11)
 * Name: Suppatouch Srinual (Nine)
 * ID: 2420210037
 * PA 11.5: mainShapeHw.java
 *
 * ==================================================================================
 * Task 5: Validity of Upcasting and Downcasting in Java [PA11-5 Main.java]
 *
 * Testing Criteria:
 *      - Create objects of the subclasses Circle, Rectangle, and Square, and upcast
 *        them to the Shape superclass.
 *      - Downcast the Shape references back to their respective subclasses (Circle,
 *        Rectangle, and Square).
 *      - Attempt an invalid downcast, such as trying to cast a Circle object
 *        (which was upcast to Shape) to a Rectangle reference.
 *      - Use the .instanceof operator to validate whether an object can safely be
 *        downcast to a subclass. Before performing any downcast, check:
 *              If s1 instanceof Circle, then downcast it to Circle.
 *              If s1 instanceof Rectangle, then downcast it to Rectangle.
 * ==================================================================================
 */


public class mainShapeHw {
    public static void main(String[] args) {
        /**
         *  My Test Cases
         */
        // 1. Create objects of the subclasses Circle, Rectangle, and Square, and upcast them to Shape superclass.
        hwShape st1 = new hwCircle();
        hwShape st2 = new hwRectangle();
        hwShape st3 = new hwSquare(4);

        // 2. Downcast the Shape references back to their respective subclass (Circle, Rectangle, and Square).
        hwCircle dst1 = (hwCircle) st1;
        hwRectangle dst2 = (hwRectangle) st2;
        hwSquare dst3 = (hwSquare) st3;

        // 3. Attempt an invalid downcast, such as tyring to cast a Circle object (which was upcast to Shape) to a
        //    Rectangle reference.
//        hwRectangle indst1 = (hwShape) st1;       // Illegal implicit upcasting.


        // 4. Use the .instanceof operator to validate whether an object can safely be downcast to a subclass.
        //    Before performing any downcast, check:
        //          if s1 instanceof Circle, then downcast it to Circle.
        //          if s1 instanceof Rectangle, then downcast it to Rectangle.
        if (st1 instanceof hwCircle) {
            System.out.println("st1 is downcast to Circle");
        }
        else if (st1 instanceof hwRectangle) {
            System.out.println("st1 is downcast to Rectangle");
        }
    }
}

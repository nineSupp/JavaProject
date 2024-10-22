/*
 * (Homework 11)
 * Name: Suppatouch Srinual (Nine)
 * ID: 2420210037
 * PA 11.6: TestShape.java
 *
 * ==================================================================================
 * Ajarn homework test cases.
 * ==================================================================================
 */


public class TestShape {
    public static void main(String[] args) {
        hwShape s1 = new hwCircle(5.5, "RED", false);  // Upcast Circle to Shape
        System.out.println(s1);  // A Circle with radius = 5.5, which is a subclass of A Shape with color of RED and not filled
        System.out.println(s1.getClass().getName()); // Circle
        System.out.println(s1.hashCode()); // 1252169911
        System.out.println(s1.getClass() == hwShape.class); // false
        System.out.println(s1.getClass() == hwCircle.class); // true
        System.out.println(s1 instanceof hwShape); // true
        System.out.println(s1 instanceof hwCircle); // true
        System.out.println(s1.getArea());          // 95.03317777109125
        System.out.println(s1.getPerimeter());     // 34.55751918948772
        System.out.println(s1.getColor()); // RED
        System.out.println(s1.isFilled()); // false
//        System.out.println(s1.getRadius());       // Upcast cannot access subclass method.

        System.out.println();

        hwCircle c1 = (hwCircle) s1;                   // Downcast back to Circle
        System.out.println(c1);
        System.out.println(c1.hashCode());
        System.out.println(c1.getClass().getName());
        System.out.println(c1 instanceof hwShape);
        System.out.println(c1 instanceof hwCircle);
        System.out.println(c1.getArea());
        System.out.println(c1.getPerimeter());
        System.out.println(c1.getColor());
        System.out.println(c1.isFilled());
        System.out.println(c1.getRadius());

        System.out.println();

        //   Shape s2 = new Shape();
        hwShape s3 = new hwRectangle(1.0, 2.0, "RED", false);   // Upcast
        System.out.println(s3);
        System.out.println(s3.hashCode());
        System.out.println(s3.getClass().getName());
        System.out.println(s3 instanceof hwShape);
        System.out.println(s3 instanceof hwRectangle);
        System.out.println(s3.getArea());
        System.out.println(s3.getPerimeter());
        System.out.println(s3.getColor());
//        System.out.println(s3.getLength());         // Upcast cannot access subclass method.

        System.out.println();

        hwRectangle r1 = (hwRectangle) s3;   // downcast
        System.out.println(r1);
        System.out.println(r1.hashCode());
        System.out.println(r1.getClass().getName());
        System.out.println(r1 instanceof hwShape);
        System.out.println(r1 instanceof hwRectangle);
        System.out.println(r1.getArea());
        System.out.println(r1.getColor());
        System.out.println(r1.getLength());

        System.out.println();

        hwShape s4 = new hwSquare(6.6);     // Upcast
        System.out.println(s4);
        System.out.println(s4.hashCode());
        System.out.println(s4.getClass().getName());
        System.out.println(s4 instanceof hwShape);
        System.out.println(s4 instanceof hwRectangle);
        System.out.println(s4 instanceof hwSquare);
        System.out.println(s4.getArea());
        System.out.println(s4.getColor());
//        System.out.println(s4.getSide());               // Upcast cannot access subclass method.

        System.out.println();

        // Take note that we downcast Shape s4 to Rectangle,
        //  which is a superclass of Square, instead of Square
        hwRectangle r2 = (hwRectangle) s4;
        System.out.println(r2);
        System.out.println(r2.hashCode());
        System.out.println(r2.getClass().getName());
        System.out.println(r2 instanceof hwShape);
        System.out.println(r2 instanceof hwRectangle);
        System.out.println(r2 instanceof hwSquare);
        System.out.println(r2.getArea());
        System.out.println(r2.getColor());
//        System.out.println(r2.getSide());           // getSide() is a method of hwSqaure, a subclass.
        System.out.println(r2.getLength());

        System.out.println();

        // Downcast Rectangle r2 to Square
        hwSquare sq1 = (hwSquare) r2;
        System.out.println(sq1);
        System.out.println(sq1.hashCode());
        System.out.println(sq1.getClass().getName());
        System.out.println(sq1 instanceof hwShape);
        System.out.println(sq1 instanceof hwRectangle);
        System.out.println(sq1 instanceof hwSquare);
//        System.out.println(sq1 instanceof hwCircle);        // sq1 is a hwSquare class not a hwCircle
        System.out.println(sq1.getArea());
        System.out.println(sq1.getColor());
        System.out.println(sq1.getSide());
        System.out.println(sq1.getLength());
    }
}

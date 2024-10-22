/*
 * (Lab 12)
 * Name: Suppatouch Srinual (Nine)
 * ID: 2420210037
 * L12.3: Cat.java
 *
 * ==================================================================================
 * Task 2: Create Concrete subclasses Dog and Cat that extend Animal:
 *
 * Each subclass should implement the sound() method. [L11-1.2 Dog.java,
 * L11-1.3 Cat.java]
 *      - In Dog, the sound() method should print "Barks."
 *      - In Cat, the sound() method should print "Meows."
 * ==================================================================================
 */


public class Cat extends Animal {
    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public void sound() {
        System.out.println("Meows");
    }
}

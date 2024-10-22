/*
 * (Lab 12)
 * Name: Suppatouch Srinual (Nine)
 * ID: 2420210037
 * L12.4: TestAnimal.java
 *
 * ==================================================================================
 * Task 3: Test the Abstract Class
 * ==================================================================================
 */


public class TestAnimal {
    public static void main(String[] args) {
        Animal dog = new Dog("Moo Krob", 3);
        Animal cat = new Cat("Moo Deng", 2);

        System.out.println(dog.getInfo());
        dog.sound();

        System.out.println(cat.getInfo());
        cat.sound();

    }
}

public class finalMain {
    public static void main(String[] args) {
        // Testing Animal
        finalAnimal a1 = new finalAnimal("I am Animal");
        System.out.println(a1);

        System.out.println();

        // Testing Mammal
        finalMammal m1 = new finalMammal("I am Mammal");
        System.out.println(m1);

        System.out.println();

        // Testing Cat 1
        finalCat c1 = new finalCat("Cat 1");
        System.out.println(c1);

        System.out.println();

        // Testing Cat 2
        finalCat c2 = new finalCat("Cat 2");
        System.out.println(c2);

        System.out.println();

        // Testing Dog 1
        finalDog d1 = new finalDog("Dog 1");
        System.out.println(d1);

        System.out.println();

        // Testing Dog 2
        finalDog d2 = new finalDog("Dog 2");
        System.out.println(d2);

        System.out.println();

        // Testing Dog 1 greets Dog 2.
        d1.greets(d2);
        // Testing Dog 2 greets Dog 1.
        d2.greets(d1);

        // Testing Dog 1 greets Cat 1.
//        d1.greets(c1);        Error wrong data type for input.
    }
}

/*
 * (Homework 10)
 * Name: Suppatouch Srinual (Nine)
 * ID: 2420210037
 * PA 10.2: Hatchback.java
 *
 * ==================================================================================
 * Task 1: Proper Inheritance and Overriding
 *      - Refactor the Hatchback class to ensure that the model field inherited from
 *          Car is used correctly, rather than declaring the model field in the
 *          Hatchback class.
 *      - Override the getModel() and setModel(String model) methods in Hatchback.
 *          Ensure the subclass can modify the inherited behavior of Car while
 *          maintaining the consistency of model data.
 *          Use super to invoke the parent class methods as needed.
 *
 * Task 4: Add More Specific Methods in Subclasses
 * Add a maxSpeed() method in both Hatchback and SUV that returns the maximum speed
 * of each car type.
 *      - For example, in Hatchback, return "Hatchback Max Speed: 180 km/h".
 *      -In SUV, return "SUV Max Speed: 200 km/h".
 * ==================================================================================
 */


public class Hatchback extends Car{
    private String model;

    public void printPrice() {
        System.out.println("Hatchback Price");
    }

    public String getModel() { return super.getModel();}

    public Hatchback setModel(String model) {
        super.setModel(model);
        return this;
    }

    public String maxSpeed() {
        return String.format("Hatchback Max Speed: 180km/h");
    }

    @Override
    public String toString() {
        return String.format("Model: %s, Type: %s", this.getModel(), this.getClass().getSimpleName());
    }
}

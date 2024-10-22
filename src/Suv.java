/*
 * (Homework 10)
 * Name: Suppatouch Srinual (Nine)
 * ID: 2420210037
 * PA 10.3: Suv.java
 *
 * ==================================================================================
 * Task 2: Add a New Subclass
 *
 * Create a new subclass SUV (Suv.java) that extends the Car class.
 *      - Override the printPrice() method to print "SUV Price".
 *      - Override the getModel() and setModel() methods.
 *      - In the getModel() method, add extra functionality by appending "
 *        (SUV Model)" to the returned string.
 *
 * Task 3: Implement toString Method and Method Chaining
 * Override the toString() method in the Car class to return the model and class type
 * (e.g., "Model: Toyota, Type: Car").
 *      - In the Hatchback and SUV subclasses, override the toString() method to
 *        include the type of car as well, e.g., "Model: Honda Civic,
 *        Type: Hatchback".
 *
 * Implement method chaining in the setModel() method for the SUV class, so that it
 * returns the instance of the class itself. This allows you to set the model and
 * call another method in a single line of code, like this:
 *      SUV suv = new SUV().setModel("Toyota").printPrice();
 *
 * Task 4: Add More Specific Methods in Subclasses
 * Add a maxSpeed() method in both Hatchback and SUV that returns the maximum speed
 * of each car type.
 *      - For example, in Hatchback, return "Hatchback Max Speed: 180 km/h".
 *      -In SUV, return "SUV Max Speed: 200 km/h".
 * ==================================================================================
 */


public class Suv extends Car {
    public Suv printPrice() {
        System.out.println("SUV Price");
        return this;
    }

    public String getModel() {
        return super.getModel();
    }

    public Suv setModel(String model) {
        super.setModel(model);
        return this;
    }

    public String maxSpeed() {
        return String.format("SUV Max Speed: 200km/h");
    }

    @Override
    public String toString() {
        return String.format("Model: %s, Type: %s", this.getModel(), this.getClass().getSimpleName());
    }
}

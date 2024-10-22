/*
 * (Homework 10)
 * Name: Suppatouch Srinual (Nine)
 * ID: 2420210037
 * PA 10.1: Car.java
 *
 * ==================================================================================
 * You are given a Car class (Car.java) and a subclass Hatchback (Hatchback.java)
 * that extends Car. The goal is to implement inheritance concepts such as overriding
 * methods, using super, and maintaining consistency between parent and child class
 * behavior
 *
 *
 * public class Car {
 *      private String model;
 *
 *      public String getModel() { return model; }
 *
 *      public void setModel(String model) {
 *          this.model = model;
 *      }
 * }
 *
 * public class Hatchback extends Car {
 *      private String model;
 *
 *      public void printPrice() {
 *          System.out.println("Hatchback Price");
 *      }
 *
 *      public String getModel() {
 *          return model;
 *      }
 *
 *      public void setModel(String model) {
 *          this.model = model;
 *      }
 * }
 * ==================================================================================
 */


public class Car {
    private String model;

    public String getModel() { return this.model; }

    public Car setModel(String model) {
        this.model = model;
        return this;
    }

    @Override
    public String toString() {
        return String.format("Model: %s, Type: %s", this.getModel(), this.getClass().getSimpleName());
    }
}


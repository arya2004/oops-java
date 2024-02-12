package org.Tutorial.two;

// Driver.java
public class Driver {
    private String name;

    // Parameterized constructor for Driver
    public Driver(String name) {
        this.name = name;
    }

    // Instance method for Driver
    public void driveCar(Car car) {
        System.out.println(name + " is driving the " + car.getModel());
    }

    // Static method for Driver
    public static void greet() {
        System.out.println("Drivers are on the road!");
    }

}

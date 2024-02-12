package org.Tutorial.two;

// Car.java
public class        Car {
    private String model;

    // Parameterized constructor for Car
    public Car(String model) {
        this.model = model;
    }

    // Instance method for Car
    public void start() {
        System.out.println(model + " is starting.");
    }

    // Static method for Car
    public static void honk() {
        System.out.println("Honk! Honk! Cars make noise.");
    }

    public String getModel(){
        return this.model;
    }
}

// MainClass.java

package org.labExam;

import java.util.Scanner;

// Abstract base class Vehicle
abstract class Vehicle {
    // Abstract method move
    public abstract void move();
}

// Subclass Helicopter
class Helicopter extends Vehicle {
    @Override
    public void move() {
        System.out.println("Helicopter Flies in Air");
    }
}

// Subclass Car
class Car extends Vehicle {
    @Override
    public void move() {
        System.out.println("Car Drives on Road");
    }
}

// Subclass Train
class Train extends Vehicle {
    @Override
    public void move() {
        System.out.println("Train Runs on Track");
    }
}

// Factory class to create Vehicle instances
class VehicleFactory {
    // Factory method to create a Vehicle instance based on type
    public static Vehicle createVehicle(String type) {
        switch (type.toLowerCase()) {
            case "helicopter":
                return new Helicopter();
            case "car":
                return new Car();
            case "train":
                return new Train();
            default:
                throw new IllegalArgumentException("Unknown vehicle type: " + type);
        }
    }
}

// Main class to run the application
public class seventeen {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for the type of vehicle
        System.out.print("Enter the type of vehicle (Helicopter, Car, Train): ");
        String vehicleType = scanner.nextLine();

        try {
            // Create the appropriate Vehicle instance using the factory method
            Vehicle vehicle = VehicleFactory.createVehicle(vehicleType);

            // Display the nature of movement
            vehicle.move();
        } catch (IllegalArgumentException e) {
            // Handle invalid vehicle type
            System.out.println(e.getMessage());
        } finally {
            scanner.close();
        }
    }
}


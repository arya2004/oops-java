package org.Tutorial.eight;

import java.util.Scanner;

abstract class Vehicle {
    abstract void move();
}

class Helicopter extends Vehicle {
    @Override
    void move() {
        System.out.println("The Helicopter Flies in Air");
    }
}

class Car extends Vehicle {
    @Override
    void move() {
        System.out.println("The Car Drives on Road");
    }
}

class Train extends Vehicle {
    @Override
    void move() {
        System.out.println("The Train Runs on Track");
    }
}

public class VehicleFactory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the type of vehicle (Helicopter/Car/Train):");
        String vehicleType = scanner.nextLine().toLowerCase();

        Vehicle vehicle;
        switch (vehicleType) {
            case "helicopter":
                vehicle = new Helicopter();
                break;
            case "car":
                vehicle = new Car();
                break;
            case "train":
                vehicle = new Train();
                break;
            default:
                System.out.println("Invalid vehicle type!");
                scanner.close();
                return;
        }

        vehicle.move();
        scanner.close();
    }
}

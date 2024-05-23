package org.labExam;

// Camera Class
class Camera {
    private String brand;
    private double cost;

    // Parameterized constructor
    public Camera(String brand, double cost) {
        this.brand = brand;
        this.cost = cost;
    }

    // Method to get brand
    public String getBrand() {
        return brand;
    }

    // Method to get cost
    public double getCost() {
        return cost;
    }
}

// DigitalCamera Class
class DigitalCamera extends Camera {
    private int memory;

    // Parameterized constructor
    public DigitalCamera(String brand, double cost, int memory) {
        super(brand, cost); // Call to superclass constructor
        this.memory = memory;
    }

    // Method to get memory
    public int getMemory() {
        return memory;
    }

    // Method to display all information
    public void displayDetails() {
        System.out.println(getBrand() + ", " + getCost() + "$, " + getMemory() + "GB");
    }
}


public class fifteen {
    public static void main(String[] args) {
        // Create an instance of DigitalCamera
        DigitalCamera digitalCamera = new DigitalCamera("Nikon", 100, 16);

        // Display the details
        digitalCamera.displayDetails();
    }
}

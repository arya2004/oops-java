package org.Tutorial.two;

// Pet.java (Base class for both Cat and Dog)
public class Pet {

    public String name;


    protected int age;


    String color;


    private boolean isHealthy;


    public Pet(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
        this.isHealthy = true;
    }


    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age + " years");
        System.out.println("Color: " + color);
        System.out.println("Healthy: " + isHealthy);
    }
}


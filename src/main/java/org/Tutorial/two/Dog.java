package org.Tutorial.two;

// Dog.java (Subclass of Pet)
public class Dog extends Pet {

    public String breed;


    public Dog(String name, int age, String color, String breed) {
        super(name, age, color); // Call the constructor of the superclass (Pet)
        this.breed = breed;
    }

    // Public method specific to Dog
    public void bark() {
        System.out.println(name + " says: Woof!");
    }
}

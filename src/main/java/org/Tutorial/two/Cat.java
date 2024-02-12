package org.Tutorial.two;

// Cat.java (Subclass of Pet)
public class Cat extends Pet {

    public boolean hasWhiskers;

    // Public constructor for Cat
    public Cat(String name, int age, String color, boolean hasWhiskers) {
        super(name, age, color);
        this.hasWhiskers = hasWhiskers;
    }


     public void meow() {
        System.out.println(name + " says: Meow!");
    }
}

package org.Tutorial.five;

 class Parent {
    // Method to demonstrate method hiding
    static void display() {
        System.out.println("Static method in Parent class");
    }

    // Method to demonstrate method overriding
    void show() {
        System.out.println("Method in Parent class");
    }
}
class Child extends Parent {
    // Method to demonstrate method overloading
    void show(String message) {
        System.out.println(message);
    }

    // Method overriding
    @Override
    void show() {
        System.out.println("Method in Child class");
    }

    // Method hiding
    static void display() {
        System.out.println("Static method in Child class");
    }
}

public class methodOverloading {
    public static void main(String[] args) {
        // Method overloading demonstration
        Child child = new Child();
        child.show(); // Invokes the overridden method in Child class
        child.show("Overloaded method in Child class");

        // Method overriding demonstration
        Parent parent = new Parent();
        parent.show(); // Invokes the method in Parent class

        // Method hiding demonstration
        Parent.display(); // Invokes the static method in Parent class
        Child.display();  // Invokes the static method in Child class
    }
}
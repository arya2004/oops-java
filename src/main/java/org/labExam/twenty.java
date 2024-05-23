package org.labExam;


// Interface Drawable
interface Drawable {
    void draw();
}

// Interface Resizable
interface Resizable {
    void resize(double factor);
}

// Class Circle implementing both Drawable and Resizable
class Circle implements Drawable, Resizable {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a Circle with radius: " + radius);
    }

    @Override
    public void resize(double factor) {
        radius *= factor;
        System.out.println("Resized Circle to radius: " + radius);
    }

    // Getter for radius
    public double getRadius() {
        return radius;
    }
}

// Class Rectangle implementing only Drawable
class Rectangle implements Drawable {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a Rectangle with length: " + length + " and width: " + width);
    }

    // Getters for length and width
    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }
}

// Main class to test the functionality
public class twenty {


    public static void main(String[] args) {
        // Create a Circle instance
        Circle circle = new Circle(5.0);
        circle.draw(); // Draw the circle
        circle.resize(1.5); // Resize the circle
        circle.draw(); // Draw the resized circle

        // Create a Rectangle instance
        Rectangle rectangle = new Rectangle(4.0, 3.0);
        rectangle.draw(); // Draw the rectangle
    }
}


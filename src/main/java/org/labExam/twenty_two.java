package org.labExam;

public class twenty_two {
    // Constant value for PI
    public static final double PI = 3.14;

    // Instance block
    {
        System.out.println("New calculator instance");
    }

    // Static block
    static {
        System.out.println("Welcome to Simple Calculator");
    }

    // Constructor
    public twenty_two() {
        // Empty constructor
    }

    // Addition method
    public double add(double num1, double num2) {
        return num1 + num2;
    }

    // Subtraction method
    public double subtract(double num1, double num2) {
        return num1 - num2;
    }

    // Multiplication method
    public double multiply(double num1, double num2) {
        return num1 * num2;
    }

    // Division method
    public double divide(double num1, double num2) {
        if (num2 != 0) {
            return num1 / num2;
        } else {
            System.out.println("Error: Division by zero");
            return Double.NaN; // Not a Number
        }
    }

    public static void main(String[] args) {
        // Create an instance of the Calculator
        twenty_two calc = new twenty_two();

        // Perform some calculations
        System.out.println("Addition: " + calc.add(10, 5));
        System.out.println("Subtraction: " + calc.subtract(10, 5));
        System.out.println("Multiplication: " + calc.multiply(10, 5));
        System.out.println("Division: " + calc.divide(10, 5));
    }
}



package org.labExam;

// Abstract class Marks
abstract class Marks {
    // Abstract method to be implemented by subclasses
    public abstract double getPercentage();
}

// Class A for student A
class A extends Marks {
    private int marks1, marks2, marks3;

    // Constructor to initialize marks
    public A(int marks1, int marks2, int marks3) {
        this.marks1 = marks1;
        this.marks2 = marks2;
        this.marks3 = marks3;
    }

    // Implementation of getPercentage method
    @Override
    public double getPercentage() {
        int total = marks1 + marks2 + marks3;
        return (total / 3.0);
    }
}

// Class B for student B
class B extends Marks {
    private int marks1, marks2, marks3, marks4;

    // Constructor to initialize marks
    public B(int marks1, int marks2, int marks3, int marks4) {
        this.marks1 = marks1;
        this.marks2 = marks2;
        this.marks3 = marks3;
        this.marks4 = marks4;
    }

    // Implementation of getPercentage method
    @Override
    public double getPercentage() {
        int total = marks1 + marks2 + marks3 + marks4;
        return (total / 4.0);
    }
}

// Main class to test the functionality
public class sixteen {
    public static void main(String[] args) {
        // Create an instance of student A
        A studentA = new A(85, 90, 80);
        // Create an instance of student B
        B studentB = new B(75, 80, 85, 90);

        // Print the percentage of marks for both students
        System.out.println("Percentage of marks for student A: " + studentA.getPercentage() + "%");
        System.out.println("Percentage of marks for student B: " + studentB.getPercentage() + "%");
    }
}



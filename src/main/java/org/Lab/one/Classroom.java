package org.Lab.one;

public class Classroom {

    private static int totalClassrooms;


    private String className;
    private int capacity;


    static {
        totalClassrooms = 0;
        System.out.println("Static block: Initializing totalClassrooms variable to: " + totalClassrooms);
    }


    {
        totalClassrooms++;
        System.out.println("Instance block: Increase total Classroom to: "+ totalClassrooms);

    }

    // Default constructor
    public Classroom() {
        this("Unknown", 0); // Call parameterized constructor with default values
    }

    // Parameterized constructor
    public Classroom(String className, int capacity) {
        this.className = className;
        this.capacity = capacity;

    }


    public static int getTotalClassrooms() {
        return totalClassrooms;
    }


    public void displayInfo() {
        System.out.println("Classroom Name: " + className);
        System.out.println("Capacity: " + capacity + " students");
    }


    public void conductClass() {
        System.out.println("Classroom " + className + " is in session.");
    }

    public static void main(String[] args) {

        Classroom classroom1 = new Classroom();
        Classroom classroom2 = new Classroom("Room 1411", 78);


        System.out.println("Total Classrooms: " + Classroom.getTotalClassrooms());


        classroom1.displayInfo();
        classroom1.conductClass();

        classroom2.displayInfo();
        classroom2.conductClass();
    }
}

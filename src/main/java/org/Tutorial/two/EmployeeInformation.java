package org.Tutorial.two;

import java.util.Scanner;



public class EmployeeInformation {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        Employee[] employees = new Employee[3];


        for (int i = 0; i < 3; i++) {
            System.out.println("Enter information for Employee " + (i + 1) + ":");

            System.out.print("Name: ");
            String name = scanner.nextLine();

            System.out.print("Age: ");
            int age = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Salary: $");
            double salary = scanner.nextDouble();
            scanner.nextLine();


            employees[i] = new Employee(name, age, salary);
        }


        System.out.println("\nEmployee Information:");
        for (int i = 0; i < 3; i++) {
            System.out.println("Employee " + (i + 1) + ":");
            employees[i].displayInfo();
            System.out.println();
        }


        scanner.close();
    }
}


class Employee {
    private String name;
    private int age;
    private double salary;


    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }


    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age + " years");
        System.out.println("Salary: $" + salary);
    }
}

package org.Lab.four;

import java.util.Scanner;

public class ManagementSystem {
    private static String[] employees = new String[5];
    private static int numEmployees = 0;
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("Select an option:");
            System.out.println("1. Add Employee");
            System.out.println("2. View Employees");
            System.out.println("3. Exit");

            int choice = getIntInput();

            switch (choice) {
                case 1:
                    addEmployee();
                    break;
                case 2:
                    viewEmployees();
                    break;
                case 3:
                    System.out.println("Exiting program...");
                    return;
                default:
                    System.out.println("Invalid choice. Please select again.");
                    break;
            }
        }
    }

    private static void addEmployee() {
        try {
            if (numEmployees >= employees.length) {
                throw new ArrayIndexOutOfBoundsException("Employee array is full.");
            }

            System.out.println("Enter employee name:");
            String name = scanner.nextLine();
            employees[numEmployees] = name;
            numEmployees++;
            System.out.println("Employee added successfully.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error adding employee: " + e.getMessage());
        }
    }

    private static void viewEmployees() {
        try {
            if (numEmployees == 0) {
                throw new NullPointerException("No employees to display.");
            }

            System.out.println("List of Employees:");
            for (int i = 0; i < numEmployees; i++) {
                System.out.println((i + 1) + ". " + employees[i]);
            }
        } catch (NullPointerException e) {
            System.out.println("Error viewing employees: " + e.getMessage());
        }
    }

    private static int getIntInput() {
        while (true) {
            try {
                return Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number.");
            }
        }
    }
}

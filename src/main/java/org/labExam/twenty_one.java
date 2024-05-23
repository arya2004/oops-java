package org.labExam;

// Base class Employee
class Employees {
    private String name;
    private String employeeID;
    private double hourlyRate;

    public Employees(String name, String employeeID, double hourlyRate) {
        this.name = name;
        this.employeeID = employeeID;
        this.hourlyRate = hourlyRate;
    }

    public String getName() {
        return name;
    }

    public String getEmployeeID() {
        return employeeID;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    // Method to calculate monthly salary (to be overridden by subclasses)
    public double calculateMonthlySalary() {
        return 0.0;
    }
}

// Subclass FullTimeEmployee extending Employee
class FullTimeEmployee extends Employees {
    private double salary;
    private String benefits;

    public FullTimeEmployee(String name, String employeeID, double hourlyRate, double salary, String benefits) {
        super(name, employeeID, hourlyRate);
        this.salary = salary;
        this.benefits = benefits;
    }

    @Override
    public double calculateMonthlySalary() {
        // Assuming 40 hours per week and 4 weeks per month
        return salary;
    }
}

// Subclass PartTimeEmployee extending Employee
class PartTimeEmployee extends Employees {
    private int hoursWorked;
    private double overtimeRate;

    public PartTimeEmployee(String name, String employeeID, double hourlyRate, int hoursWorked, double overtimeRate) {
        super(name, employeeID, hourlyRate);
        this.hoursWorked = hoursWorked;
        this.overtimeRate = overtimeRate;
    }

    @Override
    public double calculateMonthlySalary() {
        // Assuming overtime is calculated at 1.5 times the hourly rate
        double regularPay = hoursWorked * getHourlyRate();
        double overtimePay = Math.max(0, hoursWorked - 40) * overtimeRate * getHourlyRate();
        return regularPay + overtimePay;
    }
}

// Main class to test the functionality
public class twenty_one {

    public static void main(String[] args) {
        // Create full-time and part-time employees
        FullTimeEmployee fullTimeEmp = new FullTimeEmployee("John Doe", "FT001", 25.0, 5000.0, "Health insurance");
        PartTimeEmployee partTimeEmp = new PartTimeEmployee("Jane Smith", "PT001", 20.0, 45, 1.5);

        // Calculate and display monthly salaries
        System.out.println("Monthly Salary of Full-Time Employee: $" + fullTimeEmp.calculateMonthlySalary());
        System.out.println("Monthly Salary of Part-Time Employee: $" + partTimeEmp.calculateMonthlySalary());
    }
}


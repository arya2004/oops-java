package org.labExam;


class Person{
    public String name;
    public Integer age;
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class Employee extends  Person{
    public Employee(String name, int age, String designation, double salary) {
        super(name, age);
        this.Designation = designation;
        this.Salary = salary;
    }
    public String Designation;
    public  Double Salary;
}
public class five {
    public static void main(String[] args) {
        Employee[] employees = new Employee[5];

        employees[0] = new Employee("Alice", 30, "Developer", 6000);
        employees[1] = new Employee("Bob", 28, "Designer", 4500);
        employees[2] = new Employee("Charlie", 35, "Manager", 8000);
        employees[3] = new Employee("David", 40, "Analyst", 3000);
        employees[4] = new Employee("Eve", 32, "Tester", 5500);

        System.out.println("Employees with salary greater than 5000:");
        for (Employee employee : employees) {
            if (employee.Salary > 5000) {
                System.out.println(employee.name);
            }
        }
    }
}

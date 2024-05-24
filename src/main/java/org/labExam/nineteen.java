package org.labExam;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

class Student {
    private String name;
    private int rollNumber;
    private double grade;

    public Student(String name, int rollNumber, double grade) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", rollNumber=" + rollNumber +
                ", grade=" + grade +
                '}';
    }
}

class StudentManager implements Iterable<Student> {
    private List<Student> studentList;

    public StudentManager() {
        studentList = new ArrayList<>();
    }

    public void addStudent(Student student) {
        studentList.add(student);
    }

    public void removeStudent(int rollNumber) {
        studentList.removeIf(student -> student.getRollNumber() == rollNumber);
    }

    public void displayStudents() {
        for (Student student : studentList) {
            System.out.println(student);
        }
    }

    public void replaceGrade(int rollNumber, double newGrade) {
        for (Student student : studentList) {
            if (student.getRollNumber() == rollNumber) {
                student.setGrade(newGrade);
                break;
            }
        }
    }

    @Override
    public Iterator<Student> iterator() {
        return studentList.iterator();
    }
}

public class nineteen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentManager manager = new StudentManager();

        while (true) {
            System.out.println("1. Add Student\n2. Remove Student\n3. Display Students\n4. Replace Grade\n5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter student name: ");
                    String name = scanner.next();
                    System.out.print("Enter roll number: ");
                    int rollNumber = scanner.nextInt();
                    System.out.print("Enter grade: ");
                    double grade = scanner.nextDouble();
                    manager.addStudent(new Student(name, rollNumber, grade));
                    break;
                case 2:
                    System.out.print("Enter roll number to remove: ");
                    int removeRollNumber = scanner.nextInt();
                    manager.removeStudent(removeRollNumber);
                    break;
                case 3:
                    manager.displayStudents();
                    break;
                case 4:
                    System.out.print("Enter roll number to replace grade: ");
                    int replaceRollNumber = scanner.nextInt();
                    System.out.print("Enter new grade: ");
                    double newGrade = scanner.nextDouble();
                    manager.replaceGrade(replaceRollNumber, newGrade);
                    break;
                case 5:
                    System.out.println("Exiting program...");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}




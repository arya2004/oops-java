package org.Tutorial.seven;

public class Student {
    private int rollNo;
    private String name;
    private int age;
    private String course;

    public Student(int rollNo, String name, int age, String course) throws AgeNotWithinRangeException1, NameNotValidException1 {
        if (age < 15 || age > 21) {
            throw new AgeNotWithinRangeException1("Age should be between 15 and 21.");
        }
        if (name.matches(".*\\d.*") || !name.matches("[a-zA-Z ]+")) {
            throw new NameNotValidException1("Name contains numbers or special symbols.");
        }
        this.rollNo = rollNo;
        this.name = name;
        this.age = age;
        this.course = course;
    }
}

class AgeNotWithinRangeException1 extends Exception {
    public AgeNotWithinRangeException1(String message) {
        super(message);
    }
}

class NameNotValidException1 extends Exception {
    public NameNotValidException1(String message) {
        super(message);
    }
}

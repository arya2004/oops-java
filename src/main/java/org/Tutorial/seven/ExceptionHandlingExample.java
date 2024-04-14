package org.Tutorial.seven;

public class ExceptionHandlingExample {
    public static void main(String[] args) {
        try {
            validateAge(25);
            validateName("John Doe");
        } catch (AgeNotWithinRangeException e) {
            System.out.println(e.getMessage());
        } catch (NameNotValidException e) {
            System.out.println(e.getMessage());
        }
    }

    static void validateAge(int age) throws AgeNotWithinRangeException {
        if (age < 15 || age > 21) {
            throw new AgeNotWithinRangeException("Age should be between 15 and 21.");
        }
    }

    static void validateName(String name) throws NameNotValidException {
        if (name.matches(".*\\d.*") || !name.matches("[a-zA-Z ]+")) {
            throw new NameNotValidException("Name contains numbers or special symbols.");
        }
    }
}

class AgeNotWithinRangeException extends Exception {
    public AgeNotWithinRangeException(String message) {
        super(message);
    }
}

class NameNotValidException extends Exception {
    public NameNotValidException(String message) {
        super(message);
    }
}

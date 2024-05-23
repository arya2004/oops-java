package org.labExam;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class twenty_three {
    // Method to read numbers from a file and throw exception if any number is positive
    public static void readNumbersFromFile(String filename) throws FileNotFoundException, PositiveNumberException {
        Scanner fileScanner = new Scanner(new File(filename));
        List<Integer> numbers = new ArrayList<>();

        while (fileScanner.hasNextInt()) {
            int number = fileScanner.nextInt();
            if (number > 0) {
                throw new PositiveNumberException("Positive number found in the file: " + number);
            }
            numbers.add(number);
        }
        fileScanner.close();

        System.out.println("Numbers read from file: " + numbers);
    }

    // Method to read numbers from user and throw exception if any number is a duplicate
    public static void readNumbersFromUser() throws DuplicateNumberException {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<>();

        System.out.print("Enter the number of integers: ");
        int n = scanner.nextInt();

        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            int number = scanner.nextInt();
            if (numbers.contains(number)) {
                throw new DuplicateNumberException("Duplicate number found: " + number);
            }
            numbers.add(number);
        }
        scanner.close();

        System.out.println("Numbers entered by user: " + numbers);
    }

    public static void main(String[] args) {
        try {
            readNumbersFromFile("numbers.txt");
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        } catch (PositiveNumberException e) {
            System.out.println("Exception: " + e.getMessage());
        }

        try {
            readNumbersFromUser();
        } catch (DuplicateNumberException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }


}

// Custom exception for positive numbers
class PositiveNumberException extends Exception {
    public PositiveNumberException(String message) {
        super(message);
    }
}

// Custom exception for duplicate numbers
class DuplicateNumberException extends Exception {
    public DuplicateNumberException(String message) {
        super(message);
    }
}



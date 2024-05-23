package org.labExam;

import java.util.Scanner;

// Custom exception class
class OddNumberException extends Exception {
    public OddNumberException(String message) {
        super(message);
    }
}


public class ten {

    public static void checkEvenOdd(int number) throws OddNumberException {
        if (number % 2 != 0) {
            throw new OddNumberException("Number is Odd");
        } else {
            System.out.println("Number is Even");
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();
            checkEvenOdd(number);
        } catch (OddNumberException e) {
            System.out.println(e.getMessage());
        } finally {
            scanner.close();
        }
    }
}

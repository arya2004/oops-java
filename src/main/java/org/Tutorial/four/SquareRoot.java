package org.Tutorial.four;

public class SquareRoot {
    public static void main(String[] args) {
        double number = 25;
        double squareRoot = squareRoot(number);
        System.out.println("Square root of " + number + " is: " + squareRoot);
    }

    public static double squareRoot(double num) {
        double guess = num / 2;
        while (Math.abs(guess * guess - num) >= 0.0001) {
            guess = (guess + num / guess) / 2;
        }
        return guess;
    }
}

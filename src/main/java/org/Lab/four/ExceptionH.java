package org.Lab.four;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Vector;

public class ExceptionH {
    public static void main(String[] args) {

        Vector<String> s = new Vector<>(10);
        s.add("Hello");
        s.add("World");
        s.add("Meow");
        s.add("Yellow");
        s.add("orange");
        try {
            int numerator = s.size();
            int denominator = 0;
            int result = numerator / denominator;
            System.out.println("Result of division: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Caught ArithmeticException: " + e.getMessage());
        }


        try {

            int index = 10;
             Object[] v = s.toArray();
             Object value = v[10];
            System.out.println("Value at index " + index + ": " + value);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
        }


        try {
            String str = null;
            int length = str.length();
            System.out.println("Length of the string: " + length);
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException: " + e.getMessage());
        }
    }
}

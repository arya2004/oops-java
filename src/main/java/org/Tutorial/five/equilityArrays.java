package org.Tutorial.five;

import java.util.Arrays;
import java.util.Scanner;

public class equilityArrays {
    private static void checkArrayEquality() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the first array: ");
        int size1 = scanner.nextInt();
        int[] array1 = new int[size1];

        System.out.println("Enter the elements of the first array:");
        for (int i = 0; i < size1; i++) {
            array1[i] = scanner.nextInt();
        }

        System.out.print("Enter the size of the second array: ");
        int size2 = scanner.nextInt();
        int[] array2 = new int[size2];

        System.out.println("Enter the elements of the second array:");
        for (int i = 0; i < size2; i++) {
            array2[i] = scanner.nextInt();
        }

        // Check equality
        boolean isEqual = Arrays.equals(array1, array2);
        if (isEqual) {
            System.out.println("The two arrays are equal.");
        } else {
            System.out.println("The two arrays are not equal.");
        }
    }

    public static void main(String[] args) {
        equilityArrays.checkArrayEquality();
    }
}

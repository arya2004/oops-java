package org.Tutorial.five;

import java.util.Arrays;
import java.util.Scanner;

public class commonStringArray {

    private static void findCommonStrings() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the first array: ");
        int size1 = scanner.nextInt();
        String[] array1 = new String[size1];

        System.out.println("Enter the elements of the first array:");
        for (int i = 0; i < size1; i++) {
            array1[i] = scanner.next();
        }

        System.out.print("Enter the size of the second array: ");
        int size2 = scanner.nextInt();
        String[] array2 = new String[size2];

        System.out.println("Enter the elements of the second array:");
        for (int i = 0; i < size2; i++) {
            array2[i] = scanner.next();
        }

        // Find common elements
        System.out.println("Common elements between the two arrays:");
        for (String element1 : array1) {
            for (String element2 : array2) {
                if (element1.equals(element2)) {
                    System.out.print(element1 + " ");
                    break;
                }
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        commonStringArray.findCommonStrings();
    }

}

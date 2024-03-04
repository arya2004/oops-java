package org.Tutorial.five;

import java.util.Scanner;

public class commonIntegerArray {
    private static void findCommonIntegers() {
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

        // Find common elements
        System.out.println("Common elements between the two arrays:");
        for (int element1 : array1) {
            for (int element2 : array2) {
                if (element1 == element2) {
                    System.out.print(element1 + " ");
                    break;
                }
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        commonIntegerArray.findCommonIntegers();
    }

}

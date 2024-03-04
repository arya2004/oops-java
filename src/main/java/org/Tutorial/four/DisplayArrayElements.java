package org.Tutorial.four;
import java.util.Scanner;

public class DisplayArrayElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.println("Elements of the array:");
        for (int num : array) {
            System.out.print(num + " ");
        }
        scanner.close();
    }
}

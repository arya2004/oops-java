package org.Tutorial.six;
import java.util.Scanner;
public class AntiDiagonals {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the square matrix:");
        int n = scanner.nextInt();
        int[][] matrix = new int[n][n];

        System.out.println("Enter the elements of the square matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Array of anti-diagonals:");
        for (int i = 0; i < 2 * n - 1; i++) {
            for (int j = 0; j <= i; j++) {
                int k = i - j;
                if (j < n && k < n) {
                    System.out.print(matrix[j][k] + " ");
                }
            }
            System.out.println();
        }

        scanner.close();
    }
}
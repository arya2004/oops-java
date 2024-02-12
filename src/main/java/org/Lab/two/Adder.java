package org.Lab.two;

import java.util.ArrayList;
import java.util.Scanner;

public class Adder {
    public float[] Array;
    public float targetSum;

    public  Adder(float[] _Array, float _targetSum){
        this.Array = _Array;
        this.targetSum = _targetSum;
    }

    public float[] Find(){
        float[] temp = new float[2];
        for (int i = 0; i < this.Array.length; i++) {
            for (int j = i; j < this.Array.length; j++) {
                if(this.Array[i] + this.Array[j] == this.targetSum){

                    temp[0] = this.Array[i];

                    temp[1] = this.Array[j];
                }
            }
        }

        return temp;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Find pairs that sum up to a target");
            System.out.println("2. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            if (choice == 1) {
                System.out.print("Enter the length of the array: ");
                int length = scanner.nextInt();
                float[] array = new float[length];
                System.out.println("Enter the elements of the array:");
                for (int i = 0; i < length; i++) {
                    array[i] = scanner.nextFloat();
                }
                System.out.print("Enter the target sum: ");
                float targetSum = scanner.nextFloat();

                Adder adder = new Adder(array, targetSum);
                float[] pairs = adder.Find();
                if (pairs[0] != 0 || pairs[1] != 0) {
                    System.out.println("Pairs found:");
                    System.out.println(pairs[0] + " " + pairs[1]);
                } else {
                    System.out.println("No pairs found that sum up to the target.");
                }
            } else if (choice == 2) {
                System.out.println("Exiting...");
                break;
            } else {
                System.out.println("Invalid choice. Please enter 1 or 2.");
            }
        }

        scanner.close();
    }

    }


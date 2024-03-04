    package org.Tutorial.five;

    import java.util.Scanner;

    public class repeatedArrayElements {
        private static void removeDuplicates() {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the size of the array: ");
            int size = scanner.nextInt();
            int[] array = new int[size];

            System.out.println("Enter the elements of the array:");
            for (int i = 0; i < size; i++) {
                array[i] = scanner.nextInt();
            }

            // Remove duplicates
            int uniqueCount = 0;
            for (int i = 0; i < size; i++) {
                boolean isUnique = true;
                for (int j = 0; j < i; j++) {
                    if (array[i] == array[j]) {
                        isUnique = false;
                        break;
                    }
                }
                if (isUnique) {
                    array[uniqueCount++] = array[i];
                }
            }

            // Display unique elements
            System.out.println("Array after removing duplicates:");
            for (int i = 0; i < uniqueCount; i++) {
                System.out.print(array[i] + " ");
            }
            System.out.println();
        }

        public static void main(String[] args) {
            repeatedArrayElements.removeDuplicates();
        }
    }

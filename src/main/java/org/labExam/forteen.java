package org.labExam;



public class forteen {
    public static int calculateSumOfEvenNumbers(int[] numbers) {
        int sum = 0;
        for (int number : numbers) {
            if (number % 2 == 0) {
                sum += number;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        // Sample Input 1
        int[] numbers1 = {68, 79, 86, 99, 23, 2, 41, 100};
        int result1 = calculateSumOfEvenNumbers(numbers1);
        System.out.println("Sample Input 1: {68, 79, 86, 99, 23, 2, 41, 100}");
        System.out.println("Sample Output 1: " + result1);

        // Sample Input 2
        int[] numbers2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int result2 = calculateSumOfEvenNumbers(numbers2);
        System.out.println("Sample Input 2: {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}");
        System.out.println("Sample Output 2: " + result2);
    }
}

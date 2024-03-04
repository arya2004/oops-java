package org.Tutorial.four;

public class SumOfEvenNumbers {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = calculateSumOfEvenNumbers(numbers);
        System.out.println("Sum of even numbers: " + sum);
    }

    public static int calculateSumOfEvenNumbers(int[] numbers) {
        int sum = 0;
        for (int num : numbers) {
            if (num % 2 == 0) {
                sum += num;
            }
        }
        return sum;
    }
}

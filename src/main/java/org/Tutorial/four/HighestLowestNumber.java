package org.Tutorial.four;

public class HighestLowestNumber {
    public static void main(String[] args) {
        int[] array = {10, 5, 20, 3, 15};
        int min = array[0];
        int max = array[0];
        for (int num : array) {
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }
        System.out.println("Highest number: " + max);
        System.out.println("Lowest number: " + min);
    }
}

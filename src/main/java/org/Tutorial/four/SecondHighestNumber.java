package org.Tutorial.four;

import java.util.Arrays;

public class SecondHighestNumber {
    public static void main(String[] args) {
        int[] array = {10, 5, 20, 3, 15};
        Arrays.sort(array);
        int secondHighest = array[array.length - 2];
        System.out.println("Second highest number: " + secondHighest);
    }
}

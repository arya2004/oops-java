package org.Tutorial.six;
import java.util.Arrays;

public class SegregateZerosAndOnes {
    public static void main(String[] args) {
        int[] array = {0, 1, 1, 0, 1, 0, 1, 0};

        int left = 0;
        int right = array.length - 1;

        while (left < right) {
            while (array[left] == 0 && left < right) {
                left++;
            }
            while (array[right] == 1 && left < right) {
                right--;
            }
            if (left < right) {
                array[left] = 0;
                array[right] = 1;
                left++;
                right--;
            }
        }

        System.out.println("Array after segregation: " + Arrays.toString(array));
    }
}

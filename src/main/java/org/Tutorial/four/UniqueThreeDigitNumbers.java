package org.Tutorial.four;

public class UniqueThreeDigitNumbers {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 4; j++) {
                for (int k = 1; k <= 4; k++) {
                    if (i != j && j != k && i != k) {
                        int number = i * 100 + j * 10 + k;
                        System.out.println(number);
                        count++;
                    }
                }
            }
        }
        System.out.println("Total unique three-digit numbers: " + count);
    }
}

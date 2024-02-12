package org.Tutorial.two;

import java.util.Scanner;

public class SumOfDigits {

    public  SumOfDigits(int _number){
        int  digit, sum = 0;
        int number = _number;

        while(number > 0)
        {
            digit = number % 10;

            sum = sum + digit;

            number = number / 10;
        }

        System.out.println("Sum: "+sum);
    }

    public static void main(String[] args) {
        SumOfDigits s1 = new SumOfDigits(12210060);
        SumOfDigits s2 = new SumOfDigits(12210053);
    }
}

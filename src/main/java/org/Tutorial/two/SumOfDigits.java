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

        System.out.println("Sum"+sum);
    }
}

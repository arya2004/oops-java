package org.Tutorial.two;

public class Power {

    public static double Iterative(int base, int power){


        double result = 1;
        while (power != 0) {
            result = result * base;
            // power will get reduced after
            // each multiplication
            power--;
        }
        return  result;
    }

    public static  double Library(int a, int b){
        return Math.pow(a, b);
    }
}

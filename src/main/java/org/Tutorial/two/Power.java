package org.Tutorial.two;

public class Power {

    public static double Iterative(int base, int power){


        double result = 1;
        while (power != 0) {
            result = result * base;
            power--;
        }
        return  result;
    }

    public static  double Library(int base, int power){
        return Math.pow(base, power);
    }

    public static void main(String[] args) {
        System.out.println("3^4: "+ Power.Iterative(3, 4));
        System.out.println("4^3: "+Power.Library(4, 3));
    }
}

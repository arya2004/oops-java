package org.Tutorial.two;

public class NumOfObject {
    public  static int number;

    public NumOfObject()
    {
        number += 1;
    }

    public static void main(String[] args) {
        NumOfObject _1 = new NumOfObject();
        NumOfObject _2 = new NumOfObject();
        NumOfObject _3 = new NumOfObject();
        NumOfObject _4 = new NumOfObject();
        NumOfObject _5 = new NumOfObject();
        System.out.println(NumOfObject.number);
    }
}

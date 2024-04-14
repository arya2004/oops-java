package org.example;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class phorEich {


    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(5);
        arr.add(4);
        arr.add(5);
        arr.add(66);
        arr.add(22);
        arr.add(88);
        arr.add(9);
        arr.add(1);

        for (Integer x : arr){
            System.out.print(x);
            System.out.print(" ");
        }

        System.out.println();

        arr.add(3,1);
        for (Integer x : arr){
            System.out.print(x);
            System.out.print(" ");
        }
        System.out.println();
        Collections.sort(arr);
        for (Integer x : arr){
            System.out.print(x );
            System.out.print(" ");
        }
        System.out.println();
        int a[] = new int[4];

    }
}

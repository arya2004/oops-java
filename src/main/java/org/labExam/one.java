package org.labExam;

import java.util.*;

public class one {

    public static List<Integer> removeDuplicate(List<Integer> arr){
        Set<Integer> s = new HashSet<>();
        for(var a : arr){

            s.add(a);
        }

        List<Integer> toReturn = new ArrayList<Integer>(s);
        System.out.println(toReturn);

        return toReturn;

    }
    public static void main(String[] args) {

        List<Integer> al = new ArrayList<Integer>();
        al.add(10);
        al.add(20);
        al.add(10);
        al.add(15);
        al.add(40);
        al.add(15);
        al.add(40);


        List<Integer> pp = one.removeDuplicate(al);
    }
}

package org.labExam;

import java.util.*;

public class two {

    public static List<Object> concatenateLists(List<Object> s, List<Object> i){
        Collections.reverse(i);
        List<Object> concatinated = new ArrayList<Object>();
        concatinated.addAll(s);
        concatinated.addAll(i);
        System.out.println(concatinated);

        return concatinated;
    }
    public static void main(String[] args) {

        List<Object> listOne = new ArrayList<>();
        listOne.add("Hello");
        listOne.add(102);
        listOne.add(200.8);
        listOne.add(25);

        List<Object> listTwo = new ArrayList<>();
        listTwo.add(150);
        listTwo.add(40.8);
        listTwo.add("Welocome");
        listTwo.add('A');

        List<Object> concatinated = concatenateLists(listOne, listTwo);

    }
}

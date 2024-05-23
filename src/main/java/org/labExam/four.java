package org.labExam;

import java.util.*;

public class four {

    public static void main(String[] args) {
        List<Integer> l = new ArrayList<>();
        l.add(20);
        l.add(30);
        l.add(40);

        for (int i = 0; i < l.size(); i++) {
            System.out.println(l.get(i));
        }

        for(Integer i : l){
            System.out.println(i);
        }
        Iterator<Integer> i = l.iterator();
        while (i.hasNext()){
            System.out.println(i.next());
        }
    }

}

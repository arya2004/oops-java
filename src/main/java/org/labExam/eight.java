package org.labExam;

import java.util.*;

public class eight {
    public static void main(String[] args) {
//        List<String> l = new ArrayList<>();
//        Scanner s = new Scanner(System.in);
//
//        for (int i = 0; i < 10; i++) {
//            System.out.println("ENter" + i + " ");
//            l.add(s.next());
//        }
//        System.out.println(l);
//
//        for (int i = 0; i < 10; i++) {
//            for (int j = 0; j < 10; j++) {
//                if(l.get(i).compareTo(l.get(j)) < 0){
//                    String temp = l.get(i);
//                    l.set(i, l.get(j));
//                    l.set(j, temp);
//                }
//            }
//        }
//
//        System.out.println(l);

        String a = "Arya";
        String b = "Pathak";
        String c = new String(a + b);
        System.out.println(c);

        StringBuilder sb = new StringBuilder();
        sb.append(a);
        sb.reverse();
        System.out.println(sb);

    }
}

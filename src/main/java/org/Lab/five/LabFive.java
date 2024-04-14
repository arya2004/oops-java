package org.Lab.five;
import java.util.*;

import com.sun.security.jgss.GSSUtil;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class LabFive {
    //arraylist map set vector


    public static void main(String[] args) {
        System.out.println("_________________");
        System.out.println("ArrayList");
        System.out.println("_________________");

        ArrayList<String> cats = new ArrayList<>(10);
        cats.add("Orange");
        System.out.println("Added");
        System.out.print("\n");

        for (String i : cats){
            System.out.print("Member: "+i);
        }
        System.out.print("\n");

        cats.add(0, "black");
        System.out.println("Added at 0 index");
        System.out.print("\n");
        for (String i : cats){
            System.out.print("Member: "+i);
        }
        System.out.print("\n");

        System.out.println("Size: "+cats.size());
        cats.add("White");
        System.out.println("Added");
        System.out.print("\n");
        for (String i : cats){
            System.out.print("Member: "+i);
        }
        System.out.print("\n");

        System.out.println("Contains Kitten? "+cats.contains("kitten"));
        cats.remove(0);
        System.out.println("Removed");
        System.out.print("\n");
        for (String i : cats){
            System.out.print("Member: "+i);
        }
        System.out.print("\n");

        cats.add(0, "black");
        System.out.println("Added at 0 index");
        System.out.print("\n");
        for (String i : cats){
            System.out.print("Member: "+i);
        }
        System.out.print("\n");

        cats.add(0, "black");
        System.out.println("Added at 0 index");
        System.out.print("\n");
        for (String i : cats){
            System.out.print("Member: "+i);
        }
        System.out.print("\n");

        System.out.println("_________________");
        System.out.println("Map");
        System.out.println("_________________");


        Map<String, Integer> hm
                = new HashMap<String, Integer>();


        hm.put("a", 100);
        System.out.println("Added a: 100");

        System.out.print("\n");
        for (Map.Entry<String, Integer> me :
                hm.entrySet()) {

            // Printing keys
            System.out.print(me.getKey() + ":");
            System.out.print(me.getValue() + "  ");
        }
        System.out.print("\n");


        hm.put("b", 200);
        System.out.println("Added b: 200");

        System.out.print("\n");
        for (Map.Entry<String, Integer> me :
                hm.entrySet()) {

            // Printing keys
            System.out.print(me.getKey() + ":");
            System.out.print(me.getValue() + "  ");
        }
        System.out.print("\n");
        hm.put("c", 300);
        System.out.println("Added c: 300");
        System.out.print("\n");
        for (Map.Entry<String, Integer> me :
                hm.entrySet()) {

            // Printing keys
            System.out.print(me.getKey() + ":");
            System.out.print(me.getValue() + "  ");
        }
        System.out.print("\n");
        hm.put("d", 400);
        System.out.println("Added d: 400");
        System.out.print("\n");
        for (Map.Entry<String, Integer> me :
                hm.entrySet()) {

            // Printing keys
            System.out.print(me.getKey() + ":");
            System.out.print(me.getValue() + "  ");
        }
        System.out.print("\n");
        System.out.print("\n");
        for (Map.Entry<String, Integer> me :
                hm.entrySet()) {

            // Printing keys
            System.out.print(me.getKey() + ":");
            System.out.print(me.getValue() + "  ");
        }
        System.out.print("\n");
        System.out.println("Map Size: "+hm.size());
        hm.clear();
        System.out.println("Cleared");
        System.out.print("\n");
        for (Map.Entry<String, Integer> me :
                hm.entrySet()) {

            // Printing keys
            System.out.print(me.getKey() + ":");
            System.out.print(me.getValue() + "  ");
        }
        System.out.print("\n");
        System.out.println("Size: "+hm.size());

        System.out.println("_________________");
        System.out.println("Set");
        System.out.println("_________________");


        Set<Double> s = new HashSet<>();
        s.add(4.6);
        System.out.println("Added 4.6");

        System.out.print("\n");
        for (Double d:
                s) {

            // Printing keys
            System.out.print(d + " ");

        }
        System.out.print("\n");


        s.add(4.6);
        System.out.println("Added 4.6");
        System.out.print("\n");
        for (Double d:
                s) {

            // Printing keys
            System.out.print(d + " ");

        }
        System.out.print("\n");
        s.add(4.6);
        System.out.println("Added 4.6");
        System.out.print("\n");
        for (Double d:
                s) {

            // Printing keys
            System.out.print(d + " ");

        }
        System.out.print("\n");
        s.add(5.6);
        System.out.println("Added 5.6");

        System.out.print("\n");
        for (Double d:
                s) {

            // Printing keys
            System.out.print(d + " ");

        }
        System.out.print("\n");

        System.out.println("Set Size: " +s.size());
        System.out.println("Is Empty? " + s.isEmpty());
        System.out.println("Contains 7.8? "+s.contains(7.8));
        s.clear();
        System.out.println("Cleared");
        System.out.print("\n");
        for (Double d:
                s) {

            // Printing keys
            System.out.print(d + " ");

        }
        System.out.print("\n");
        System.out.println("Set Size: " +s.size());
        System.out.println("Is Empty? " +s.isEmpty());

        System.out.println("_________________");
        System.out.println("Vector");
        System.out.println("_________________");


        Vector<Integer> v = new Vector<>();
        v.add(5);
        System.out.println("Added");
        System.out.print("\n");
        for (Integer d:
                v) {

            // Printing keys
            System.out.print(d + " ");

        }
        System.out.print("\n");
        v.add(10);
        System.out.println("Added");
        System.out.print("\n");
        for (Integer d:
                v) {

            // Printing keys
            System.out.print(d + " ");

        }
        System.out.print("\n");
        v.add(1);
        System.out.println("Added");
        System.out.print("\n");
        for (Integer d:
                v) {

            // Printing keys
            System.out.print(d + " ");

        }
        System.out.print("\n");
        System.out.println("Size: "+v.size());
        v.remove(1);
        System.out.println("Removed");
        System.out.print("\n");
        for (Integer d:
                v) {

            // Printing keys
            System.out.print(d + " ");

        }
        System.out.print("\n");
        System.out.println("Size: "+v.size());
        System.out.println("Contains 100?"+v.contains(100));
        v.clear();
        System.out.println("Cleared");
        System.out.print("\n");
        for (Integer d:
                v) {

            // Printing keys
            System.out.print(d + " ");

        }
        System.out.print("\n");
        System.out.println("Size"+v.size());

    }

}

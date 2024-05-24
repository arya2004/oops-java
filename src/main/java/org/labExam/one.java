package org.labExam;

import java.util.*;





public class one {

    public static void main(String[] args) {
        // Sample input
        Integer[] numbers = {10, 20, 10, 15, 40, 15, 40};

        // Convert array to ArrayList
        ArrayList<Integer> numberList = new ArrayList<>(Arrays.asList(numbers));

        // Remove duplicates
        ArrayList<Integer> uniqueList = removeDuplicates(numberList);

        // Print the unique list
        System.out.println(uniqueList);
    }

    public static ArrayList<Integer> removeDuplicates(ArrayList<Integer> list) {
        // Use a LinkedHashSet to remove duplicates while preserving the order
        Set<Integer> set = new LinkedHashSet<>(list);

        // Convert the set back to an ArrayList
        return new ArrayList<>(set);
    }
}


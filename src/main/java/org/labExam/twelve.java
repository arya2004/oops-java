package org.labExam;

import java.util.ArrayList;


public class twelve {
    public static void main(String[] args) {
        // Create two ArrayLists and add elements to them
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("Hello");
        arrayList1.add("How");
        arrayList1.add("Are");
        arrayList1.add("You");

        ArrayList<String> arrayList2 = new ArrayList<>();
        arrayList2.add("Hi");
        arrayList2.add("How");
        arrayList2.add("Are");
        arrayList2.add("You");

        // 12.1 Add arrayList2 into arrayList1 from index 1
        arrayList1.addAll(1, arrayList2);

        // 12.2 Print the combined list
        System.out.println("Combined ArrayList: " + arrayList1);

        // 12.3 Print the index of "Are"
        int indexOfAre = arrayList1.indexOf("Are");
        System.out.println("Index of 'Are': " + indexOfAre);

        // 12.4 Remove the 4th element from arrayList1 (index 3)
        arrayList1.remove(3);
        System.out.println("ArrayList1 after removing 4th element: " + arrayList1);

        // 12.5 Replace the 4th element of arrayList2 with "U"
        arrayList2.set(3, "U");
        System.out.println("ArrayList2 after replacing 4th element with 'U': " + arrayList2);
    }
}

package org.Tutorial.three;

public class _string_builder {
    public static void main(String[] args) {
        // Create a StringBuilder
        StringBuilder stringBuilder = new StringBuilder("Hello, World!");

        // Append
        stringBuilder.append(" How are you?");
        System.out.println("After Append: " + stringBuilder);

        // Insert
        stringBuilder.insert(7, " Java");
        System.out.println("After Insert at index 7: " + stringBuilder);

        // Delete
        stringBuilder.delete(7, 11);
        System.out.println("After Delete from index 7 to 10: " + stringBuilder);

        // Reverse
        stringBuilder.reverse();
        System.out.println("After Reverse: " + stringBuilder);

        // Set length
        stringBuilder.setLength(5);
        System.out.println("After Set Length to 5: " + stringBuilder);

        // Replace
        stringBuilder.replace(0, 5, "Hola");
        System.out.println("After Replace from index 0 to 4 with 'Hola': " + stringBuilder);

        // Capacity
        int capacity = stringBuilder.capacity();
        System.out.println("Capacity: " + capacity);

        // Length
        int length = stringBuilder.length();
        System.out.println("Length: " + length);

        // Ensure capacity
        stringBuilder.ensureCapacity(20);
        System.out.println("After Ensure Capacity: " + stringBuilder);
    }
}

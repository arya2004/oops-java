package org.Tutorial.three;

public class _string_buffer {
    public static void main(String[] args) {
        // Create a StringBuffer
        StringBuffer stringBuffer = new StringBuffer("Hello, World!");

        // Append
        stringBuffer.append(" How are you?");
        System.out.println("After Append: " + stringBuffer);

        // Insert
        stringBuffer.insert(7, " Java");
        System.out.println("After Insert at index 7: " + stringBuffer);

        // Delete
        stringBuffer.delete(7, 11);
        System.out.println("After Delete from index 7 to 10: " + stringBuffer);

        // Reverse
        stringBuffer.reverse();
        System.out.println("After Reverse: " + stringBuffer);

        // Set length
        stringBuffer.setLength(5);
        System.out.println("After Set Length to 5: " + stringBuffer);

        // Replace
        stringBuffer.replace(0, 5, "Hola");
        System.out.println("After Replace from index 0 to 4 with 'Hola': " + stringBuffer);

        // Capacity
        int capacity = stringBuffer.capacity();
        System.out.println("Capacity: " + capacity);

        // Length
        int length = stringBuffer.length();
        System.out.println("Length: " + length);

        // Ensure capacity
        stringBuffer.ensureCapacity(20);
        System.out.println("After Ensure Capacity: " + stringBuffer);
    }
}

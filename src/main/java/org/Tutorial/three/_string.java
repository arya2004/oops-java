package org.Tutorial.three;

public class _string {


    public static void main(String[] args) {
        // Create a sample string
        String originalString = "Hello  sdf";

        // String length
        int length = originalString.length();
        System.out.println("Length: " + length);

        // Character at index
        char charAtIndex = originalString.charAt(7);
        System.out.println("Character at index 7: " + charAtIndex);

        // Substring
        String substring = originalString.substring(7);
        System.out.println("Substring from index 7: " + substring);

        // Concatenation
        String concatenatedString = originalString.concat(" How are you?");
        System.out.println("Concatenated String: " + concatenatedString);

        // Index of a character
        int indexOfChar = originalString.indexOf('o');
        System.out.println("Index of 'o': " + indexOfChar);

        // Replace characters
        String replacedString = originalString.replace('o', 'x');
        System.out.println("String after replacing 'o' with 'x': " + replacedString);

        // Uppercase and lowercase
        String uppercaseString = originalString.toUpperCase();
        System.out.println("Uppercase: " + uppercaseString);

        String lowercaseString = originalString.toLowerCase();
        System.out.println("Lowercase: " + lowercaseString);

        // Check if starts/ends with
        boolean startsWithHello = originalString.startsWith("Hello");
        System.out.println("Starts with 'Hello': " + startsWithHello);

        boolean endsWithWorld = originalString.endsWith("World!");
        System.out.println("Ends with 'World!': " + endsWithWorld);

        // Replace all whitespaces
        String stringWithoutSpaces = originalString.replaceAll("\\s", "");
        System.out.println("String without spaces: " + stringWithoutSpaces);

        // Split
        String[] words = originalString.split(", ");
        System.out.println("Split words: ");
        for (String word : words) {
            System.out.println(word);
        }
    }
}

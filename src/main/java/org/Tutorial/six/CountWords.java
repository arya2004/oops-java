package org.Tutorial.six;

public class CountWords {
    public static void main(String[] args) {
        String str = "meow one two three thank you";
        String[] words = str.split("\\s+");

        int wordCount = words.length;

        System.out.println("Number of words in the string: " + wordCount);
    }
}

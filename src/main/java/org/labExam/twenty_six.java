package org.labExam;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class twenty_six {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter String: ");
        String input = scanner.nextLine();

        // Remove leading and trailing spaces, and split the input into words
        String[] words = input.trim().split("\\s+");

        // Create a HashMap to store word frequencies
        Map<String, Integer> wordCountMap = new HashMap<>();

        // Count the frequency of each word
        for (String word : words) {
            // Convert the word to lowercase to avoid case sensitivity
            String lowercaseWord = word.toLowerCase();

            // Update the word count in the HashMap
            wordCountMap.put(lowercaseWord, wordCountMap.getOrDefault(lowercaseWord, 0) + 1);
        }

        // Print the word count map
        System.out.println(wordCountMap);

        scanner.close();
    }
}



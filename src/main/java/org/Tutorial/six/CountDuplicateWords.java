package org.Tutorial.six;

import java.util.HashMap;
import java.util.Map;

public class CountDuplicateWords {
    public static void main(String[] args) {
        String str = "Java is a programming language. Java is used widely.";
        String[] words = str.split(" ");
        Map<String, Integer> wordCount = new HashMap<>();

        for (String word : words) {
            if (wordCount.containsKey(word)) {
                wordCount.put(word, wordCount.get(word) + 1);
            } else {
                wordCount.put(word, 1);
            }
        }

        System.out.println("Duplicate words count:");
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
        }
    }
}

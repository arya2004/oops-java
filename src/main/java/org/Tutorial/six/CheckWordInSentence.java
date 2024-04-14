package org.Tutorial.six;

public class CheckWordInSentence {
    public static void main(String[] args) {
        String sentence = "This is Orange juice";
        String wordToCheck = "orange";

        boolean containsWord = sentence.toLowerCase().contains(wordToCheck.toLowerCase());

        System.out.println("Does the sentence contain the word 'orange'? " + containsWord);
    }
}

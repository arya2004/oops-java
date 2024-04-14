package org.Tutorial.six;

public class RemoveWhitespace {
    public static void main(String[] args) {
        String str = "VIT Pune - VITPune";
        String trimmed = str.replaceAll("\\s", "");

        System.out.println("String without whitespace: " + trimmed);
    }
}

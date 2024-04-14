package org.Tutorial.six;

public class CheckPalindrome {
    public static void main(String[] args) {
        String str = "madam";
        String reversed = new StringBuilder(str).reverse().toString();

        boolean isPalindrome = str.equalsIgnoreCase(reversed);

        System.out.println("Is the string a palindrome? " + isPalindrome);
    }
}

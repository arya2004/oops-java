package org.Tutorial.seven;

import java.util.Scanner;

public class DisplayInitialsAndLastName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your full name:");
        String fullName = scanner.nextLine();

        String[] names = fullName.split(" ");
        StringBuilder initials = new StringBuilder();
        String lastName = "";

        for (int i = 0; i < names.length - 1; i++) {
            initials.append(names[i].charAt(0)).append(". ");
        }
        lastName = names[names.length - 1];

        System.out.println("Initials and last name: " + initials.toString().trim() + " " + lastName);

        scanner.close();
    }
}

package org.labExam;
import java.io.File;
public class tenty_four {



        public static void main(String[] args) {
            // Create a scanner object to read input from the user
            java.util.Scanner scanner = new java.util.Scanner(System.in);

            // Ask the user to enter the file name
            System.out.print("Enter the file name: ");
            String fileName = scanner.nextLine();

            // Create a File object with the specified file name
            File file = new File(fileName);

            // Check if the file exists
            if (file.exists()) {
                System.out.println("File exists: Yes");

                // Check if the file is readable
                if (file.canRead()) {
                    System.out.println("File is readable: Yes");
                } else {
                    System.out.println("File is readable: No");
                }

                // Check if the file is writable
                if (file.canWrite()) {
                    System.out.println("File is writable: Yes");
                } else {
                    System.out.println("File is writable: No");
                }

                // Get the type of file (directory or regular file)
                if (file.isDirectory()) {
                    System.out.println("File type: Directory");
                } else {
                    System.out.println("File type: Regular File");
                }

                // Get the length of the file in bytes
                long fileSize = file.length();
                System.out.println("File size: " + fileSize + " bytes");
            } else {
                System.out.println("File does not exist.");
            }

            // Close the scanner
            scanner.close();
        }
    }



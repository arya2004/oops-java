package org.Tutorial.two;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Vovel {
    public void determine() throws IOException {
        char m;

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter any alphabet:");

        m = (char) bf.read();
        if(m == 'a' || m == 'e'|| m == 'i'|| m == 'o'|| m == 'u'){
            System.out.println("vovle");
        }
        else if(m >= 65 && m <= 123) {
            System.out.println("Consonent");
            return;
        }

        else if(m >= 48 && m <= 57) {
            System.out.println("Digit");
        }
    }
}

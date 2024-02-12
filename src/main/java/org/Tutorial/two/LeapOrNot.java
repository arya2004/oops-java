package org.Tutorial.two;

import java.util.Calendar;

public class LeapOrNot {
    public  boolean isLeapYearLibrary(int year) {
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.YEAR, year);
        return cal.getActualMaximum(Calendar.DAY_OF_YEAR) > 365;
    }

    public  boolean isLeapYear(int year) {
        if (year % 4 != 0) {
            return false;
        } else if (year % 400 == 0) {
            return true;
        } else if (year % 100 == 0) {
            return false;
        } else {
            return true;
        }
    }

    public static void main(String[] args) {

       LeapOrNot leapOrNot = new LeapOrNot();
        System.out.println("My implementation 2024: "+ leapOrNot.isLeapYear(2024));
        System.out.println("Library 1800: "+ leapOrNot.isLeapYearLibrary(1800));


    }
}

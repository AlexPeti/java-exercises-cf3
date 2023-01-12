package gr.aueb.cf.exercises;

import java.util.Scanner;

/**
 * Ελέγχει εαν το έτος που εισάγει
 * ο χρήστης, είναι δίσεκτο η όχι.
 */
public class LeapYearApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int year = 0;

        System.out.println("Please insert a year (int) to check if it's a leap year or not.");
        year = in.nextInt();

        if (year % 400 == 0 && year % 100 == 0 && year % 4 == 0) {
            System.out.println(year + " is a leap year.");
        } else if (year % 4 == 0 && year % 100 == 0 && year % 400 != 0) {
            System.out.println(year + " is not a leap year.");
        } else if (year % 4 == 0 && year % 100 != 0) {
            System.out.println(year + " is a leap year.");
        }else {
            System.out.println(year + " is not a leap year.");
        }
    }
}

package gr.aueb.cf.exercises;

import java.util.Scanner;

/**
 * The program queries the user for three numbers
 * and then converts them to DD/MM/YY format.
 */
public class DateApp {

    public static void main(String[] args) {
        //Declaration and initialization
        Scanner in = new Scanner(System.in);
        int day = 0;
        int month = 0;
        int year = 0;
        int formattedYear = 0;

        //User input
        System.out.println("Enter a number between 1-31.");
        day = in.nextInt();
        System.out.println("Enter a number between 1-12.");
        month = in.nextInt();
        System.out.println("Enter a year number.");
        year = in.nextInt();

        //year = year % 100; To get the last 2 digits
        formattedYear = year % 100;

        //Conversion to date format
        System.out.printf("%02d/%02d/%02d",day, month, formattedYear);
    }
}

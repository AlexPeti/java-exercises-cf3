package gr.aueb.cf.exercises;

import java.util.Scanner;

/**
 * The program converts integer temperature
 * degrees from Fahrenheit to Celsius.
 */
public class FahrenheitToCelsiusConverter {

    public static void main(String[] args) {
        //Declaration and initialization
        Scanner in = new Scanner(System.in);
        int fahrenheit = 0;
        int celsius = 0;

        //User input
        System.out.println("Please insert the temperature (in Fahrenheit) you wish to convert to Celsius. (Must be an integer).");
        fahrenheit = in.nextInt();

        //Conversion formula
        celsius = 5 * (fahrenheit - 32) / 9;

        //Printing the result
        System.out.printf("%d\u00B0 Fahrenheit is %d\u00B0 Celsius.", fahrenheit, celsius);

    }
}

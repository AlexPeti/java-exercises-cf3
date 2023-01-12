package gr.aueb.cf.exercises;

import java.util.Scanner;

/**
 * Το πρόγραμμα εκτυπώνει n αριθμό αστεριών (οριζόντια),
 * όπου n = αριθμός που εισάγει ο χρήστης με
 * std input.
 */
public class Stars1App {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int userInputStars = 0;
        int i = 1;

        System.out.println("Please enter the number of stars (int).");
        userInputStars = in.nextInt();

        while (i <= userInputStars){
            System.out.print("*");
            i++;
        }
    }
}

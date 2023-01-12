package gr.aueb.cf.exercises;

import java.util.Scanner;

/**
 * Το πρόγραμμα εκτυπώνει αστεράκια,
 * ξεκινώντας απο n αστεράκια στη πρώτη γραμμή
 * όπου n ο αριθμός που δίνει ο χρήστης (std input),
 * έως ένα αστεράκι στη τελευταία γραμμή.
 *
 */
public class Stars5App {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = 0;

        System.out.println("Please enter a number(int).");
        n = in.nextInt();

        for (int i = 1; i <= n; i++){
            for (int j = i; j <= n; j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}

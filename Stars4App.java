package gr.aueb.cf.exercises;

import java.util.Scanner;

/**
 * To πρόγραμμα εκτυπώνει αστεράκια ξεκινώντας από
 * ένα αστεράκι στη πρώτη γραμμή ,δύο στη δεύτερη κ.ο.κ.
 * έως και n αστεράκια στη n γραμμή, όπου n o αριθμός που
 * εισάγει ο χρήστης(std input).
 */
public class Stars4App {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = 0;

        System.out.println("Please insert a number(int).");
        n = in.nextInt();

        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

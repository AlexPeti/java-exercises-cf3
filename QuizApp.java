package gr.aueb.cf.exercises;


import java.util.Scanner;

/**
 * Quiz test.
 */
public class QuizApp {

    public static void main(String[] args) {
        int i = 4;
        int result = 1;

        do {
            result = result * i;
            System.out.println(result);
            i--;
        } while (i > 1);

        System.out.println(result);
        /**
         * 1 = 1    * 4 = 4
         * 4 = 4    * 3 = 12
         * 12 = 12  * 2 = 12
         * 1 = 1*
         *
         *
         *
         *
         *
         */
    }
}

package gr.aueb.cf.exercises;

/**
 * Πρόγραμμα το οποίο παίρνει απο το χρήστη έναν αριθμό και διατρέχει τον πίνακα
 * ψάχνοντας για τον αριθμό αυτό και ύστερα του δίνει την ελάχιστη και τη μέγιστη θέση
 * στην οποία τον συνάντησε.


 */

import java.util.Scanner;

public class GetLowAndHighIndex {

    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int[] arr = {0, 1, 4, 4, 4, 6, 7, 8, 8, 8, 8, 8};
        int key = 0;

        System.out.println("Please enter a number to get its position");
        key = getUserChoice();

        getLowAndHighIndexOf(arr,key);
    }

    /**
     * Gets the number for which to search the array.
     * @return
     */
    public static int getUserChoice() {
        return in.nextInt();
    }

    /**
     *Traverses the array and finds the position of the first and last time
     * it encounters the given number(key).
     *
     * @param arr       the target array
     * @param key       the number to find
     */

    public static void getLowAndHighIndexOf (int[] arr, int key) {
        int n = arr.length;
        int lowestIndex = -1;
        int highestIndex = -1;

        for (int i = 0; i < n; i++) {
            if(arr[i] == key && lowestIndex == -1) {
                lowestIndex = i;
            }

            if (arr[i] == key && lowestIndex != -1) {
                highestIndex = i;
            }
        }


        System.out.printf("Lowest index = %d, Highest index = %d ",lowestIndex,highestIndex);
    }
}

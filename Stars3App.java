package gr.aueb.cf.exercises;

import java.util.Scanner;

/**
 * To πρόγραμμα παίρνει δυο αριθμούς απο το χρήστη
 * με std input και εκτυπώνει αστεράκια που αντιστοιχούν
 * στους παραπάνω αριθμούς (n x n).
 */
public class Stars3App {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int userInputVertical = 0;
        int userInputHorizontal = 0;

        System.out.println("Please insert the vertical x horizontal number of stars you want to be printed.");
        userInputVertical = in.nextInt();
        userInputHorizontal = in.nextInt();


        for (int i = 0; i < userInputVertical; i++){
            for( int j = 0; j < userInputHorizontal; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

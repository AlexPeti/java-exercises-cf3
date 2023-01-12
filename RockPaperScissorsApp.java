package gr.aueb.cf.exercises;

import java.util.Scanner;
import java.lang.Math;

/**
 * Rock-Paper-Scissors game against the computer.
 */

public class RockPaperScissorsApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int playerChoice = 0;

        System.out.println("Choose 1 for Rock, 2 for Paper or 3 for Scissors!");
        playerChoice = in.nextInt();
        int computerChoice = (int) (Math.random() * 3) +1;

        if (playerChoice == 1 && computerChoice == 1) {
            System.out.println("Tie!");
        } else if (playerChoice == 1 && computerChoice == 2) {
            System.out.println("Paper beats Rock! Computer Wins!");
        } else if (playerChoice == 1 && computerChoice == 3) {
            System.out.println("Rock beats Scissors! Player wins!");
        } else if (playerChoice == 2 && computerChoice == 1) {
            System.out.println("Paper beats Rock! Player Wins!");
        } else if (playerChoice == 2 && computerChoice == 2) {
            System.out.println("Tie!");
        } else if (playerChoice == 2 && computerChoice == 3) {
            System.out.println("Scissors beat Paper! Computer wins!");
        } else if (playerChoice == 3 && computerChoice == 1) {
            System.out.println("Rock beats Scissors! Computer wins!");
        } else if (playerChoice == 3 && computerChoice == 2) {
            System.out.println("Scissors beat Paper! Player Wins!");
        } else if (playerChoice == 3 && computerChoice == 3) {
            System.out.println("Tie!");
        } else if (playerChoice > 3 || playerChoice < 1) {
            System.out.println("Incorrect input, please choose 1 for Rock, 2 for Paper or 3 for Scissors!");
        } else {
            System.out.println("Incorrect input, please choose 1 for Rock, 2 for Paper or 3 for Scissors!");
        }

        //Να προσθέσω boolean game και όσο είναι true το game να συνεχίζει και να κρατάει σκορ.
    }
}

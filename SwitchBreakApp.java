package gr.aueb.cf.exercises;

import java.util.Scanner;

public class SwitchBreakApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int userInput = 0;

        System.out.println("Pick an option: ");
        System.out.println("1. Rock");
        System.out.println("2. Paper");
        System.out.println("3. Scissors");
        System.out.println("4. Exit Game");

        userInput = in.nextInt();

        switch(userInput){
            case 1:
                System.out.println("You chose Rock.");
                break;
            case 2:
                System.out.println("You chose Paper.");
                break;
            case 3:
                System.out.println("You chose Scissors.");
                break;
            case 4:
                System.out.println("Exiting Game.");
                break;
        }


    }
}

package gr.aueb.cf.exercises;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MenuThrowExceptionApp {

    public static void main(String[] args) {
        int userChoice = 0;

        do {
            try {
                printMenu();
                userChoice = getUserInput();
                printChoice(userChoice);
            } catch (IllegalArgumentException | InputMismatchException e) {
                System.out.println("Input Error, please enter a number");
            }
        }while (userChoice != 5);
    }

    public static void printMenu() {
            System.out.println("1. Input");
            System.out.println("2. Search");
            System.out.println("3. Delete");
            System.out.println("4. Update");
            System.out.println("5. Exit");
    }

    public static int getUserInput() {
        Scanner in = new Scanner(System.in);
        if (in.hasNextInt()) {
            return in.nextInt();
        }else {
            System.out.println("Enter a number between 1 and 5");
            in.nextLine();
        }
        return in.nextInt();
    }

    public static void printChoice (int choice) throws IllegalArgumentException {
        try {
                if (choice == 1) {
                    System.out.println("You selected Input");
                } else if (choice == 2) {
                    System.out.println("You selected Search");
                } else if (choice == 3) {
                    System.out.println("You selected Delete");
                }else if (choice == 4) {
                    System.out.println("You selected Update");
                }else if (choice == 5) {
                    System.out.println("You selected Exit");
                    System.exit(0);
                }else {
                    System.out.println("Invalid Input,please select a number between 1 and 5.");
                }
        }catch (IllegalArgumentException e) {
            e.printStackTrace();
            throw e;
        }
    }
}

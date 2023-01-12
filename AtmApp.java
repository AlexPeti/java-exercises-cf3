package gr.aueb.cf.exercises;

import java.util.Scanner;

/**
 * The program simulates an ATM interaction.
 * The user is first required to enter the PIN ,
 * and then he can interact with the ATM.
 */
public class AtmApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int pin = 1111;
        int userInput = 0;
        int userChoice = 0;
        int balance = 5000;
        int amount = 0;

        System.out.println("Please enter your pin.");
        userInput = in.nextInt();

        if (pin == userInput) {
            System.out.println("Your pin is correct.");
        } else {
            System.out.println("Wrong PIN. Try again.");
        }

        while (pin == userInput) {
            System.out.println("Choose an option.");
            System.out.println("1. Account Balance");
            System.out.println("2. Withdraw");
            System.out.println("3. Enter money");
            System.out.println("4. Exit.");

            userChoice = in.nextInt();
            if (userChoice == 1) {
                System.out.println("Your account balance is " + balance);
            } else if (userChoice == 2) {
                System.out.println("Choose amount of money to withdraw.");
                amount = in.nextInt();
                if (amount > balance) {
                    System.out.println("Not enough money in your account.");
                }else if (balance > amount) {
                   balance = balance - amount;
                    System.out.println("Your new balance is " + balance);
                }
            }else if (userChoice == 3) {
                System.out.println("Enter amount of money to put into your account.");
                amount = in.nextInt();
                balance = balance + amount;
                System.out.println("Your new balance is " + balance);
            }else if (userChoice == 4) {
                System.out.println("Goodbye.");
                break;
            }
        }
    }
}

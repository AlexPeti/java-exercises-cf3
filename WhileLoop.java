package gr.aueb.cf.exercises;

import java.util.Scanner;

public class WhileLoop {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int userInput = 0;
        int number = 1;

        System.out.println("Enter a number.");
        userInput = in.nextInt();

        while(userInput > number) {
            System.out.println(userInput + " Is bigger than " + number);
            break;

        }
        }
}

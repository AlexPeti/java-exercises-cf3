package gr.aueb.cf.exercises;

import java.util.Scanner;

public class ExperimentalMaths {

    public static void main(String[] args) {
        /*Scanner in = new Scanner(System.in);
        int number = 0;
        int number2 = 0;
        int result = 0;

        System.out.println("Enter 2 numbers to divide");

        number = in.nextInt();
        number2 = in.nextInt();

        result = number / number2;

        System.out.println((double)result);*/
        int number = 4;
        int number2 = 10;

        int result = (int) ((double) number / number2);
        System.out.printf("%d // %d = %d", number,number2,result);

    }
}

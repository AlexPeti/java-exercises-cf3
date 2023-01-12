package gr.aueb.cf.exercises;

/**
 * The program reads from a .txt file which contains the students' firstnames,
 * lastnames and two grades and if the grades are in the range of 0-10,
 * it calculates the average and creates a new .txt file, which in turn
 * contains the full-name of the student and the average grade.
 * If the range of grades is abnormal (less than 0 or higher than 10),
 * it logs the students' name(s) into an error-log.txt file.
 *
 * @author Alexandros Peteinaris
 */

import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class PrintAvgGradesToTxtApp {

    public static void main(String[] args) {
        try {
            readWrite();
        } catch (IOException e) {
            System.out.println("Invalid Input, please check to see if the file is in the correct directory.");
        }
    }

    public static void readWrite() throws IOException {
        try (PrintStream ps = new PrintStream("C:/Temporary/printOut.txt");
             PrintStream errorLogger = new PrintStream("C:/Temporary/students-error-log.txt")) {
            File file = new File("C:/Temporary/students-and-grades.txt");
            Scanner in = new Scanner(file);
            int sum = 0;
            double average = 0.0;

            while (in.hasNext()) {
                String line = in.nextLine();
                String[] elements = line.split(" ");
                String firstname = elements[0];
                String lastname = elements[1];
                String grade1 = elements[2];
                String grade2 = elements[3];
                sum = Integer.parseInt(grade1) + Integer.parseInt(grade2);
                average = (double) sum / 2;

                if((Integer.parseInt(grade1) < 0 || Integer.parseInt(grade1) > 10)
                        || (Integer.parseInt(grade2) < 0 || Integer.parseInt(grade2) > 10)) {
                    errorLogger.println(firstname + " " + lastname + " " + "Invalid numbers");
                } else ps.println(firstname + " " + lastname + " - Μέσος όρος: " + average);
            }
        } catch (IOException e) {
            e.printStackTrace();
            throw e;
        }
    }
}
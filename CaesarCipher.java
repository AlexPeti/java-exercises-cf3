package gr.aueb.cf.exercises;

/**
 * Caesar Cipher App
 * It encrypts the user's sentence by using an encryption key based on
 * the letters' ASCII codes and then decrypts it.
 * It only works with latin lowercase characters from a to z.
 * Uppercase letters will be converted to lowercase automatically by the program
 * and numbers will cause the program to exit.
 *
 * @author alexandros peteinaris
 */
import java.util.Scanner;

public class CaesarCipher {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        runCaesarCipher();
    }

    public static void encrypt(String userInput) {
        StringBuilder newUserInput = new StringBuilder();
        for (int i = 0; i < userInput.length(); i++) {
            int ascii = userInput.charAt(i);
            int encryptionKey = 1;

            if (ascii + encryptionKey > 122) {
                newUserInput.append((char) (96 + encryptionKey));
            }
            else if (ascii == 32) {
                newUserInput.append((char) (ascii));
            }
            else {
                newUserInput.append((char) (ascii + encryptionKey));
            }
        }
        System.out.println(newUserInput);
    }

    public static void decrypt (String userInput) {
        StringBuilder newUserInput = new StringBuilder();
        for (int i = 0; i < userInput.length(); i++) {
            int ascii = userInput.charAt(i);
            int decryptionKey = -1;

            if (ascii + decryptionKey < 97 && ascii != 32) {
                newUserInput.append((char) (122));
            }
            else if (ascii == 32) {
                newUserInput.append((char) (ascii));
            }
            else {
                newUserInput.append((char) (ascii + decryptionKey));
            }
        }
        System.out.println(newUserInput);
    }

    public static void runCaesarCipher() {
        String userInput = "";

        System.out.println("Enter the sentence or letter you want to encrypt.");
        if (in.hasNextInt()) {
            System.out.println("Invalid input, exiting the program.");
        }
        else {
            userInput = in.nextLine();
            encrypt(userInput.toLowerCase());
            System.out.println("Now decrypt the message!");
            userInput = in.nextLine();
            decrypt(userInput.toLowerCase());
        }
    }
}

package gr.aueb.cf.exercises;

import java.util.Scanner;

/**
 * Εμφανίζει ένα menu το οποίο δίνει στο
 * χρήστη διάφορες επιλογές εκτύπωσης
 * αστεριών.
 * Έχω χρησιμοποιήσει javadocs
 * ανάμεσα απο τις μεθόδους μου για
 * καλύτερο readability στον κώδικα.
 *
 * @author alexandros peteinaris
 */
public class StarsByUsingMethodsApp {

    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        startApp();
    }

    /**
     * Ξεκινάει το
     * application.
     */
    public static void startApp(){
        int choice = 0;

        do {
            optionsMenu();
            choice = getUserChoice();

            if (choice == 3) {
                System.out.println("Παρακαλώ εισάγετε δύο αριθμούς.");
                generateStars(choice);
                System.out.println();
            }

            if ((choice >= 1) && (choice <= 5 && choice != 3)) {
                System.out.println("Παρακαλώ εισάγετε αριθμό.");
                generateStars(choice);
                System.out.println();
            }
            if (choice < 1 || choice > 6) {
                System.out.println("Λάθος εισαγωγή. Παρακαλώ εισάγετε θετικούς ακέραιους αριθμούς απο 1 έως 6.\n");
            }

        }while (choice != 6);

        System.out.println("Ευχαριστούμε που χρησιμοποιήσατε το πρόγραμμα!");
    }

    /**
     * Κάνει print το menu.
     */
    public static void optionsMenu() {
        System.out.println("Παρακαλώ επιλέξτε:");
        System.out.println("1. Εμφάνισε n αστεράκια οριζόντια");
        System.out.println("2. Εμφάνισε n αστεράκια κάθετα");
        System.out.println("3. Εμφάνισε n γραμμές με n αστεράκια");
        System.out.println("4. Εμφάνισε n γραμμές με αστεράκια 1 – n");
        System.out.println("5. Εμφάνισε n γραμμές με αστεράκια n – 1");
        System.out.println("6. Έξοδος από το πρόγραμμα");
    }

    /**
     * Scanner για αποθήκευση της επιλογής του
     * χρήστη σε μια μεταβλητή.
     * @return
     */
    public static int getUserChoice() {
        return in.nextInt();
    }

    public static int getNumber() {
        return in.nextInt();
    }

    /**
     * Εκτυπώνει αστεράκια οριζόντια.
     * @param a
     */
    public static void starsHorizontally(int a) {
        for (int i = 1; i <= a; i++) {
            System.out.print("*");
        }
    }

    /**
     * Εκτυπώνει αστεράκια κάθετα.
     * @param a
     */
    public static void starsVertically(int a) {
        for (int i = 1; i <= a; i++){
            System.out.println("*");
        }
    }

    /**
     * Παίρνει απο τη χρήστη δύο αριθμούς και
     * εκτυπώνει ενα box απο αστεράκια που
     * αντιστοιχεί σε αυτούς τους αριθμούς.
     * @param a
     * @param b
     */
    public static void starsNxN(int a, int b) {
        for (int i = 0; i < a; i++){
            starsHorizontally(b);
            System.out.println();
        }
    }

    /**
     * Εκτυπώνει αστεράκια σε αύξουσα μορφή.
     * @param a
     */
    public static void starsAsc(int a) {
        for (int i = 1; i <= a; i++) {
            starsHorizontally(i);
            System.out.println();
        }
    }

    /**
     * Εκτυπώνει αστεράκια σε φθίνουσα μορφή.
     * @param a
     */
    public static void starsDesc(int a){
        for (int i = a; i >= 1; i--) {
            starsHorizontally(i);
            System.out.println();
        }
    }

    /**
     * Παίρνει την επιλογή του χρήστη απο το μενού
     * και τρέχει την επιλεγμένη μέθοδο, σύμφωνα με αυτή.
     * @param choice
     */
    public static void generateStars(int choice) {
            switch(choice) {
                case 1:
                    starsHorizontally(getNumber());
                    break;
                case 2:
                    starsVertically(getNumber());
                    break;
                case 3:
                    starsNxN(getNumber(),getNumber());
                    break;
                case 4:
                    starsAsc(getNumber());
                    break;
                case 5:
                    starsDesc(getNumber());
                    break;
                case 6:
                    System.out.println("Επιλέξατε έξοδο.");
                    break;
                default:
                    System.out.println("Λάθος εισαγωγή. Παρακαλώ εισάγετε ακέραιους αριθμούς.");
                    break;
            }
        }
}

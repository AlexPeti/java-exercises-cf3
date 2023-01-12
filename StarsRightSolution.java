package gr.aueb.cf.exercises;

public class StarsRightSolution {

    public static void main(String[] args) {

    }

    public static void printStarsH(int n) {
        for (int i = 1; i <= n; i++){
            System.out.print("*");
        }
    }

    public static void printStarsV(int n) {
        for (int i = 1; i <= n; i++){
            System.out.println("*");
        }
    }

    public static void printStarsNxN(int n) {
        for (int i = 1; i <= n; i++) {
            printStarsH(n);
            System.out.println();
        }
    }

    public static void printStarsAsc(int n) {
        for (int i = 1; i <= n; i++) {
            printStarsH(i);
            System.out.println();
        }
    }

    public static void printStarsDesc(int n) {
        for (int i = n; i >= 1; i--) {
            printStarsH(i);
            System.out.println();
        }
    }
}

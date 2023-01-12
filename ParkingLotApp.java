package gr.aueb.cf.exercises;

import java.util.Arrays;
import java.util.Comparator;

public class ParkingLotApp {

    public static void main(String[] args) {
        startApp();
    }
        public static void print2DArray(int[][] arr) {
            for (int[] ints : arr) {
                for (int j = 0; j < ints.length; j++) {
                    System.out.print(ints[j] + " ");
                }
            }
    }

    public static void findRepeatedElement(int[][] arr) {
        int count = 0;
        int maxCount = 0;

        for (int[] items : arr) {
            if (items[1] == 1) {
                count++;
            } else {
                count = 0;
            }
            if(count > maxCount) {
                maxCount = count;
            }
        }
        System.out.printf("There are %d cars parked at the same time.", maxCount);
        }

        public static void startApp() {
            int[][] source = {{1012, 1136},
                    {1317, 1417},
                    {1015, 1020}};

            int[][] arr = new int[source.length * 2][2];

            for (int i = 0; i < source.length; i++) {
                for (int j = 0; j < source[i].length; j++)
                    if (j == 0) {
                        arr[i * 2][0] = source[i][j];
                        arr[i * 2][1] = 1;
                    } else {
                        arr[i * 2 + 1][0] = source[i][j];
                        arr[i * 2 + 1][1] = 0;
                    }
            }

            Arrays.sort(arr, Comparator.comparingInt(a -> a[0]));
            print2DArray(arr);
            System.out.println();
            findRepeatedElement(arr);
        }
}

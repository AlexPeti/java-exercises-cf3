package gr.aueb.cf.exercises;

/**
 * INTERVIEW SOS
 * Finds the max value in array.
 */
public class FindMaxValueArray {

    public static void main(String[] args) {
        int[] arr = {1,3,18,5,8};
        int maxPosition = 0;
        int maxValue = arr[maxPosition];

        for (int i = 0; i < arr.length -1; i++) {
            if (arr[i] > maxValue) {
                maxPosition = i;
                maxValue = arr[i];
            }
        }

        System.out.printf("Max Value: " + maxValue);
    }
}

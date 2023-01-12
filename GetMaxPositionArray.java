package gr.aueb.cf.exercises;

/**
 * Finds the index (position)
 * of the biggest value(max) in the array.
 */

public class GetMaxPositionArray {

    public static void main(String[] args) {
        int[] arr = {5,9,24,6};
        int maxPosition = 0;

        maxPosition = getMaxPosition(arr, 0, arr.length-1);
        System.out.printf("Max position: %d , Max value: %d",maxPosition +1, arr[maxPosition]);
    }

    public static int getMaxPosition(int[] arr, int low, int high) {
        int maxPosition = high;
        int minPosition = low;
        int maxValue = 0;

        maxPosition = arr[high];
        for (int i = low; i <= high; i++) {
            if(arr[i] > maxValue) {
                maxPosition = i;
                maxValue = arr[i];
            }
        }
        return maxPosition;
    }
}

package gr.aueb.cf.exercises;

/**
 * Finds the second-smallest element in an array.
 */
public class SecondSmallestApp {

    public static void main(String[] args) {
        int[] arr = {1, 3, 10, 20};
        int arrLength = arr.length;
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int i = 0; i < arrLength; i++) {
            if (arr[i] < smallest){
                smallest = arr[i];
            }
        }

        for (int i = 0; i < arrLength; i++) {
            if (arr[i] < secondSmallest && arr[i] > smallest) {
                secondSmallest = arr[i];
            }
        }
        System.out.println("The second-smallest element in the array is " + secondSmallest);
    }
}

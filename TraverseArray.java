package gr.aueb.cf.exercises;

/**
 * Traversing an array.
 */
public class TraverseArray {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};

        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }

        System.out.println();

        for (int item : arr) {
            System.out.print(item + " ");
        }
    }
}

package gr.aueb.cf.exercises;

/**
 * INTERVIEW SOS.
 */
public class FindMinValue {

    public static void main(String[] args) {
        int[] arr = {12,5,7,10};
        int minPosition = 0;
        int minValue = arr[minPosition];

       for (int i = 0; i < arr.length-1; i++){
           if (arr[i] < minValue) {
               minPosition = i;
               minValue = arr[i];
           }
       }
        System.out.printf("Min value: " + minValue);
    }
}

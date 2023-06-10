package Assignment3;
/*
 Element left after reductions. Given an array of positive elements. You
need to perform reduction operation. In each reduction operation smallest
positive element value is picked and all the elements are subtracted by that
value. You need to print the number of elements left after each reduction
process.
 */
import java.util.Arrays;

public class A3Q7 {
        public static void elementLeftAfterReductions(int[] arr) {
            Arrays.sort(arr);
    
            int minElement = arr[0];
            int count = arr.length;
    
            for (int i = 1; i < arr.length; i++) {
                if (arr[i] > minElement) {
                    minElement = arr[i];
                    count = arr.length - i;
                    System.out.println("Number of elements left: " + count);
                }
            }
        }
    
        public static void main(String[] args) {
            int[] arr = {6, 3, 9, 2, 8, 1};
            elementLeftAfterReductions(arr);
        }
    }
    
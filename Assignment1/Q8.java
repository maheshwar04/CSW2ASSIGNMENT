//Maheshwar(2141014002)
import java.util.Arrays;

/*Given an array of size N, containing elements from 0 to N-1. All values
from 0 to N-1 are present in array and if they are not there than -1 is
there to take place. Write a program to arrange values of the array so
that value i is stored at arr[i]. */
public class Q8 {
        public static int[] sortArray(int[] arr) {
           //taking -1 at last of the array
           int start=0;
           int end=arr.length-1;
            while (start< end) {
                while (start < end && arr[start] != -1) {
                    start++;
                }
                while (start< end && arr[end] == -1) {
                    end--;
                }
                if (start < end) {
                    int temp = arr[start];
                    arr[start] = arr[end];
                    arr[end] = temp;
                }
            }
            
            // Then, iterate over the non-negative values and move them to their correct positions
            for (int i = 0; i < arr.length-1; i++) {
                if (arr[i] != -1 && arr[i] != i) {
                    int temp = arr[arr[i]];
                    arr[arr[i]] = arr[i];
                    arr[i] = temp;
                    i--;  // Check the current position again, in case the new value also needs to be moved
                }
            }
            return arr;
        }
    
    public static void main(String[] args) {
        int[] arr = {3, 4, 0, 1, -1, 2};
        System.out.println(Arrays.toString(sortArray(arr)));
    }
}

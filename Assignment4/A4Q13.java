package Assignment4;
import java.util.Arrays;
public class A4Q13 {
    public static void findMinDifference(int[] arr) {
        Arrays.sort(arr);
        int minDiff = Integer.MAX_VALUE;
        int index1 = 0;
        int index2 = 0;

        for (int i = 0; i < arr.length - 1; i++) {
            int diff = Math.abs(arr[i] - arr[i + 1]);
            if (diff < minDiff) {
                minDiff = diff;
                index1 = i;
                index2 = i + 1;
            }
        }

        System.out.println("Pair with minimum difference: (" + arr[index1] + ", " + arr[index2] + ")");
    }

    public static void main(String[] args) {
        int[] arr = {2, 5, 8, 12, 18, 21};
        findMinDifference(arr);
    }
}

package Assignment4;
import java.util.*;
public class A4Q6 {
    public static void findMinMax(int[] arr) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        Set<Integer> numSet = new HashSet<>();

        for (int num : arr) {
            min = Math.min(min, num);
            max = Math.max(max, num);
            numSet.add(num);
        }

        System.out.println("Minimum value: " + min);
        System.out.println("Maximum value: " + max);

        System.out.println("Missing values between " + min + " and " + max + ":");
        for (int i = min + 1; i < max; i++) {
            if (!numSet.contains(i)) {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {4, 2, 9, 7, 5};
        findMinMax(arr);
    }
}


package Assignment4;
import java.util.Arrays;
public class A4Q16 {
    public static boolean findTriplet(int[] arr, int target) {
        Arrays.sort(arr);

        for (int i = 0; i < arr.length - 2; i++) {
            int left = i + 1;
            int right = arr.length - 1;

            while (left < right) {
                int sum = arr[i] + arr[left] + arr[right];

                if (sum == target) {
                    System.out.println("Triplet found: (" + arr[i] + ", " + arr[left] + ", " + arr[right] + ")");
                    return true;
                } else if (sum < target) {
                    left++;
                } else {
                    right--;
                }
            }
        }

        return false;
    }

    public static void main(String[] args) {
        int[] arr = {3, 9, 2, 1, 6, 4, 5};
        int target = 12;
        boolean foundTriplet = findTriplet(arr, target);
        if (!foundTriplet) {
            System.out.println("No triplet found with sum equal to " + target);
        }
    }

}

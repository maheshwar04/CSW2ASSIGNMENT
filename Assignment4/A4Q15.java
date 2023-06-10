package Assignment4;
import java.util.Arrays;
public class A4Q15 {
    public static void findTripletWithZeroSum(int[] nums) {
        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 2; i++) {
            int left = i + 1;
            int right = nums.length - 1;
            int target = -nums[i];

            while (left < right) {
                int sum = nums[left] + nums[right];

                if (sum == target) {
                    System.out.println("Triplet with zero sum: " + nums[i] + ", " + nums[left] + ", " + nums[right]);
                    return;
                } else if (sum < target) {
                    left++;
                } else {
                    right--;
                }
            }
        }

        System.out.println("No triplet with zero sum found.");
    }

    public static void main(String[] args) {
        int[] nums = {-1, 0, 2, -3, 1, 4};
        findTripletWithZeroSum(nums);
    }
}

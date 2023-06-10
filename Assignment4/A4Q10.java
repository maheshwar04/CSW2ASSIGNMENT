package Assignment4;
import java.util.Arrays;
public class A4Q10 {
    public static void findTwoElementsClosestToZero(int[] nums) {
        Arrays.sort(nums);

        int left = 0;
        int right = nums.length - 1;
        int minSum = Integer.MAX_VALUE;
        int num1 = 0;
        int num2 = 0;

        while (left < right) {
            int sum = nums[left] + nums[right];
            if (Math.abs(sum) < Math.abs(minSum)) {
                minSum = sum;
                num1 = nums[left];
                num2 = nums[right];
            }

            if (sum < 0) {
                left++;
            } else {
                right--;
            }
        }

        System.out.println("Two elements with sum closest to zero: " + num1 + " and " + num2);
    }

    public static void main(String[] args) {
        int[] nums = {-4, -2, 1, 3, 5}; // Elements with sum closest to zero: -2 and 1
        findTwoElementsClosestToZero(nums);
    }
}



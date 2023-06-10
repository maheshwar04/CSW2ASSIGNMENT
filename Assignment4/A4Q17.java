package Assignment4;
import java.util.Arrays;
public class A4Q17 {
    public static int countTriangles(int[] nums) {
        Arrays.sort(nums);

        int count = 0;
        int n = nums.length;

        for (int i = n - 1; i >= 1; i--) {
            int left = 0;
            int right = i - 1;

            while (left < right) {
                if (nums[left] + nums[right] > nums[i]) {
                    count += right - left;
                    right--;
                } else {
                    left++;
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int[] nums = {4, 6, 3, 7};
        int count = countTriangles(nums);
        System.out.println("Number of triangles: " + count);
    }
}

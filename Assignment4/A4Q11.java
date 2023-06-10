package Assignment4;
import java.util.HashMap;
public class A4Q11 {
    public static void findTwoElementsWithSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                System.out.println("Elements with sum " + target + ": " + nums[i] + " and " + complement);
                return;
            }
            map.put(nums[i], i);
        }
        System.out.println("No elements found with sum " + target);
    }

    public static void main(String[] args) {
        int[] nums = {2, 4, 1, 5, 3};
        int target = 7;
        findTwoElementsWithSum(nums, target);
    }
}



package Assignment4;
import java.util.HashSet;
public class A4Q9 {
    public static int sumOfDistinctElements(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int sum = 0;
        for (int num : nums) {
            if (!set.contains(num)) {
                sum += num;
                set.add(num);
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] nums = {2, 5, 1, 3, 2, 4, 3, 1, 5}; // Distinct elements: 2, 5, 1, 3, 4
        int sum = sumOfDistinctElements(nums);
     System.out.println("Sum of distinct elements: " + sum);
    }
}

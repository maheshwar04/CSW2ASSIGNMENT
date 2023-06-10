package Assignment4;
import java.util.HashSet;
public class A4Q1 {
    public static int findFirstRepeatedElement(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (set.contains(num)) {
                return num;
            }
            set.add(num);
        }
        return -1; // No repeated element found
    }

    public static void main(String[] args) {
        int[] nums = {2, 5, 1, 3, 2, 4};
        int result = findFirstRepeatedElement(nums);
        System.out.println("First repeated element: " + result);
    }
}



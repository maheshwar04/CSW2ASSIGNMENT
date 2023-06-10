package Assignment4;
import java.util.HashSet;

public class A4Q2 {
    public static void printDuplicateElements(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        System.out.print("Duplicate elements: ");
        for (int num : nums) {
            if (!set.add(num)) {
                System.out.print(num + " ");
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = {2, 5, 1, 3, 2, 4};
        printDuplicateElements(nums);
    }
}


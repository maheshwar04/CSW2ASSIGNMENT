package Assignment4;
import java.util.ArrayList;
import java.util.HashSet;
public class A4Q4 {
    public static ArrayList<Integer> removeDuplicates(ArrayList<Integer> nums) {
        HashSet<Integer> set = new HashSet<>();
        ArrayList<Integer> result = new ArrayList<>();
        for (Integer num : nums) {
            if (set.add(num)) {
                result.add(num);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(2);
        nums.add(5);
        nums.add(1);
        nums.add(3);
        nums.add(2);
        nums.add(4);
        ArrayList<Integer> result = removeDuplicates(nums);
        System.out.println("List after removing duplicates: " + result);
    }
}




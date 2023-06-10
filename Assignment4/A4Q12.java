package Assignment4;
import java.util.HashSet;

public class A4Q12 {
    public static void findPairsFromTwoLists(int[] list1, int[] list2, int target) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : list1) {
            set.add(num);
        }

        for (int num : list2) {
            int complement = target - num;
            if (set.contains(complement)) {
                System.out.println("Pair found: (" + complement + ", " + num + ")");
            }
        }
    }

    public static void main(String[] args) {
        int[] list1 = {1, 2, 3, 4, 5};
        int[] list2 = {6, 7, 8, 9, 10};
        int target = 11;
        findPairsFromTwoLists(list1, list2, target);
    }
}

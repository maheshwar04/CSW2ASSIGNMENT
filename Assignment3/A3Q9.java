package Assignment3;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
public class A3Q9 {
    public static void findUnion(int[] arr1, int[] arr2) {
        Set<Integer> set = new HashSet<>();

        for (int num : arr1) {
            set.add(num);
        }

        for (int num : arr2) {
            set.add(num);
        }

        List<Integer> union = new ArrayList<>(set);
        System.out.println("Union: " + union);
    }

    public static void findIntersection(int[] arr1, int[] arr2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        for (int num : arr1) {
            set1.add(num);
        }

        for (int num : arr2) {
            set2.add(num);
        }

        set1.retainAll(set2);

        List<Integer> intersection = new ArrayList<>(set1);
        System.out.println("Intersection: " + intersection);
    }

    public static void main(String[] args) {
        int[] arr1 = {3, 1, 5, 2};
        int[] arr2 = {4, 2, 6, 3};
        findUnion(arr1, arr2);
        findIntersection(arr1, arr2);
    }
}



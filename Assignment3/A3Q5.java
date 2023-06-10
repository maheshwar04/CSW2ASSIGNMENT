package Assignment3;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class A3Q5 {
    public static void sortArrayByOrder(int[] arr1, int[] arr2) {
        Map<Integer, Integer> map = new HashMap<>();

        // Count occurrences of elements in arr1
        for (int num : arr1) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int index = 0;

        // Sort arr1 based on the order defined in arr2
        for (int num : arr2) {
            if (map.containsKey(num)) {
                int count = map.get(num);
                while (count > 0) {
                    arr1[index] = num;
                    index++;
                    count--;
                }
                map.remove(num);
            }
        }

        // Sort remaining elements in arr1
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int num = entry.getKey();
            int count = entry.getValue();
            while (count > 0) {
                arr1[index] = num;
                index++;
                count--;
            }
        }

        System.out.println("Sorted array: " + Arrays.toString(arr1));
    }
  public static void main(String[] args) {
        int[] arr1 = {1, 3, 2, 4, 5, 6};
        int[] arr2 = {2, 1, 4};
        sortArrayByOrder(arr1, arr2);
    }
}


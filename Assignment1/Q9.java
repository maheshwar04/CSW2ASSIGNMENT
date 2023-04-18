//Maheshwar(2141014002)
import java.util.HashSet;
import java.util.Set;
//Given an unsorted array, find the smallest positive number missing in
//the array.
public class Q9 {
    public static int findSmallestPositiveMissingNumber(int[] arr) {
        Set<Integer> set = new HashSet<Integer>();
    
        // Iterate over the array and add all the positive elements to the HashSet
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                set.add(arr[i]);
            }
        }
    
        // Iterate over the positive numbers starting from 1 and check if each number exists in the HashSet
        for (int i =1; i <= set.size()+1; i++) {
            if (!set.contains(i)) {
                return i;
            }
        }
    
        // If all elements are present, the smallest positive missing number is set.size() + 1
        return set.size() + 1;
    }
    
    public static void main(String[] args) {
        int arr[]={5,7,2,8,-1,1};
        System.out.println(findSmallestPositiveMissingNumber(arr));
    }
}

//Maheshwar(2141014002)
import java.util.HashSet;
import java.util.Set;
//Given an unsorted array, find the smallest positive number missing in
//the array.
public class Q9 {
    public static int findSmallestPositiveMissingNumber(int[] arr) {
        Set<Integer> set = new HashSet<Integer>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                set.add(arr[i]);
            }
        }
        for (int i =1; i <= set.size()+1; i++) {
            if (!set.contains(i)) {
                return i;
            }
        }
        return set.size() + 1;
    }
    
    public static void main(String[] args) {
        int arr[]={5,7,2,8,-1,1};
        System.out.println(findSmallestPositiveMissingNumber(arr));
    }
}

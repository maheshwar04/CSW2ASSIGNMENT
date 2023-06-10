package Assignment4;

public class A4Q7 {
        public static int findOddOccurrence(int[] nums) {
            int result = 0;
            for (int num : nums) {
                result ^= num; // XOR operation to find the odd occurrence
            }
            return result;
        }
    
        public static void main(String[] args) {
            int[] nums = {2, 5, 1, 3, 2, 4, 3, 1, 5}; // Odd occurrence: 4
            int oddOccurrence = findOddOccurrence(nums);
            System.out.println("Element appearing odd number of times: " + oddOccurrence);
        }
    }
    


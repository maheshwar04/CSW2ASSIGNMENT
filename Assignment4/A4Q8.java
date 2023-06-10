package Assignment4;

public class A4Q8 {
        public static void findTwoOddOccurrences(int[] nums) {
            int xorResult = 0;
            for (int num : nums) {
                xorResult ^= num; // XOR operation to find the XOR of two odd occurrence numbers
            }
    
            int rightmostSetBit = xorResult & -xorResult; // Get the rightmost set bit
    
            int oddNum1 = 0;
            int oddNum2 = 0;
    
            for (int num : nums) {
                if ((num & rightmostSetBit) == 0) {
                    oddNum1 ^= num;
                } else {
                    oddNum2 ^= num;
                }
            }
    
            System.out.println("Elements appearing odd number of times: " + oddNum1 + " and " + oddNum2);
        }
    
        public static void main(String[] args) {
            int[] nums = {2, 5, 1, 3, 2, 4, 1, 5}; // Odd occurrences: 3 and 4
            findTwoOddOccurrences(nums);
        }
    }

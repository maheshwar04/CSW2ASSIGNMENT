package Assignment4;

public class A4Q5 {
        public static int findMissingElement(int[] nums, int n) {
            int totalSum = (n * (n + 1)) / 2; // Sum of numbers from 1 to n
            int arraySum = 0;
            for (int num : nums) {
                arraySum += num;
            }
            return totalSum - arraySum;
        }
    
        public static void main(String[] args) {
            int[] nums = {1, 2, 3, 5}; // Missing element: 4
            int n = 5; // Range of numbers: 1 to 5
            int missingElement = findMissingElement(nums, n);
            System.out.println("Missing element: " + missingElement);
        }
    }
    


package Assignment4;

public class A4Q18 {
        public static int findSecondLargest(int[] nums) {
            int n = nums.length;
            int largest = Integer.MIN_VALUE;
            int secondLargest = Integer.MIN_VALUE;
    
            for (int i = 0; i < n; i++) {
                if (nums[i] > largest) {
                    secondLargest = largest;
                    largest = nums[i];
                } else if (nums[i] > secondLargest && nums[i] < largest) {
                    secondLargest = nums[i];
                }
            }
    
            return secondLargest;
        }
    
        public static void main(String[] args) {
            int[] nums = {5, 9, 3, 7, 2};
            int secondLargest = findSecondLargest(nums);
            System.out.println("Second largest element: " + secondLargest);
        }
    }
    


package Assignment4;

public class A4Q20 {
        public static int findElementInBitonicList(int[] nums, int target) {
            int peakIndex = findPeakIndex(nums);
            int leftResult = binarySearch(nums, target, 0, peakIndex);
            if (leftResult != -1) {
                return leftResult;
            }
            return binarySearch(nums, target, peakIndex + 1, nums.length - 1);
        }
    
        public static int findPeakIndex(int[] nums) {
            int left = 0;
            int right = nums.length - 1;
    
            while (left < right) {
                int mid = left + (right - left) / 2;
                if (nums[mid] < nums[mid + 1]) {
                    left = mid + 1;
                } else {
                    right = mid;
                }
            }
    
            return left;
        }
    
        public static int binarySearch(int[] nums, int target, int left, int right) {
            while (left <= right) {
                int mid = left + (right - left) / 2;
                if (nums[mid] == target) {
                    return mid;
                } else if (nums[mid] < target) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
    
            return -1;
        }
    
        public static void main(String[] args) {
            int[] nums = {1, 3, 6, 8, 9, 7, 5, 2};
            int target = 5;
            int index = findElementInBitonicList(nums, target);
            System.out.println("Element " + target + " found at index: " + index);
        }
    }

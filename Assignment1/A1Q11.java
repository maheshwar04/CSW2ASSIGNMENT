//Maheshwar(2141014002)
//. Given an array you need to find the maximum sum of arr[i]*(i+1) for
//all elements such that you are allowed to rotate the array.

public class A1Q11 {
    public static int maxSumWithRotation(int[] arr) {
        int n = arr.length;
        
        // Calculate the sum of arr[i] * (i + 1) for the original array
        int sum = 0;
        int rotationSum = 0;
        
        for (int i = 0; i < n; i++) {
            sum += arr[i] * (i + 1);
            rotationSum += arr[i];
        }
        
        // Initialize the maximum sum with the sum of arr[i] * (i + 1) for the original array
        int maxSum = sum;
        
        // Calculate the maximum sum after each rotation
        for (int i = 1; i < n; i++) {
            rotationSum += arr[i - 1] - (n * arr[n - i]);
            maxSum = Math.max(maxSum, rotationSum);
        }
        
        return maxSum;
    } 
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4 };
        int maxSum = maxSumWithRotation(arr);
        System.out.println("Maximum sum with rotation: " + maxSum);
    }
}


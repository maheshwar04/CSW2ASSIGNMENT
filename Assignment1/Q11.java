//Maheshwar(2141014002)
//. Given an array you need to find the maximum sum of arr[i]*(i+1) for
//all elements such that you are allowed to rotate the array.

public class Q11 {
   public static int  maximumSum(int arr[]){
    int maxSum=Integer.MIN_VALUE;
    for (int i = 0; i < arr.length; i++){
        int sum=0;
    for (int j = 0; j < arr.length; j++)
    {
        int index = (i + j) % arr.length;
        sum += (j+1) * arr[index];
    }
    maxSum=Math.max(maxSum,sum);
}
 return maxSum;
   }
        
public static void main(String[] args) {
    int arr[]={4,3,2,1};
    System.out.println(maximumSum(arr));
}
}

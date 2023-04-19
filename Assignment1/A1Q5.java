//Maheshwar(2141014002)
//Given an array, write a program to rotate its element K numbers of
//times
import java.util.Arrays;
public class A1Q5 {
    public static int[] reverse(int arr[],int start ,int end){
        while(start<end){
            int temp=arr[start];
             arr[start]=arr[end];
             arr[end]=temp;
             start++;
             end--;
        }
        return arr;
    }
    public static int[] arrayRotate1(int arr[],int k){//left Rotate
          k=k%arr.length;
            reverse(arr,0,arr.length-1);
            reverse(arr, 0, k-1);
            reverse(arr, k,arr.length-1);
            return arr;
    }
    public static int[] arrayRotate2(int arr[],int k){//Right Rotate
        k=k%arr.length;
        reverse(arr, 0, k-1);
        reverse(arr, k,arr.length-1);
        reverse(arr,0,arr.length-1);
        return arr;

    }
    public static void main(String[] args) {
        int arr[]={3, 6 ,9,11,15 ,17};
        int k=5;
        System.out.println(Arrays.toString(arrayRotate1(arr, k)));
       // System.out.println(Arrays.toString(arrayRotate2(arr, k)));

    }
}


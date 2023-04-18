//Maheshwar(2141014002)
/*
Write a recursive function to search an element using binary search.
Analyze its time complexity.
 */
public class Q17 {
    public static int BinarySearch(int arr[],int target,int start,int end){
        while(start<=end){
              int mid=start+(end-start)/2;
              if(arr[mid]==target){
                 return mid;
              } else if(target>arr[mid]){
                 return  BinarySearch(arr, target, mid+1, end);
              }else{
                 return BinarySearch(arr, target, start, mid-1);
              }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={4 ,6 ,8, 9, 10 ,24};
        System.out.println(BinarySearch(arr, 24,0,arr.length-1));
    }
    }
    


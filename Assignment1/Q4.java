//Maheshwar(2141014002)
//Write a program to search an element using binary search.
public class Q4 {
    public static int BinarySearch(int arr[],int target){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
              int mid=start+(end-start)/2;
              if(arr[mid]==target){
                 return mid;
              } else if(target>arr[mid]){
                  start=mid+1;
              }else{
                  end=mid-1;
              }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={4 ,6 ,8, 9, 10 ,24};
        System.out.println(BinarySearch(arr, 10));
    }
}

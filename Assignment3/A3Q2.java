package Assignment3;
import java.util.*;
public class A3Q2 {
    static int count1=0;
    static int count2=0;
    public static int[] sort(int arr[]){
       for(int i=0;i<arr.length;i++){
        if(arr[i]==0){
            count1++;
           }
       }
       for(int i=0;i<arr.length;i++){
        if(arr[i]==1){
            count2++;
           }
       }
       for(int j=0;j<count1;j++){
        arr[j]=0;
       }
       for(int j=count1;j<count1+count2;j++){
        arr[j]=1;
       }
       for(int j=count1+count2;j<arr.length;j++){
        arr[j]=2;
       }
       return arr;
        }
     public static void main(String[] args) {
        int arr[]={1,0,1,0,1,2,0,2,0,1,2};
         System.out.println(Arrays.toString(sort(arr)));
    }
}


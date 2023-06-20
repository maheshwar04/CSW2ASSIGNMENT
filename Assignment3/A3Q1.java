package Assignment3;
import java.util.Arrays;

public class A3Q1 {
    static int count =0;
    public static int[] sort(int arr[]){
       for(int i=0;i<arr.length;i++){
        if(arr[i]==0){
            count++;
           }
       }
       for(int j=0;j<count;j++){
        arr[j]=0;
       }
       for(int j=count;j<arr.length;j++){
        arr[j]=1;
       }
       return arr;
        }
     public static void main(String[] args) {
        int arr[]={1,0,1,0,1,0,0,1};
         System.out.println(Arrays.toString(sort(arr)));
    }
}

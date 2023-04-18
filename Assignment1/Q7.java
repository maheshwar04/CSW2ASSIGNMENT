//Given an array, write a program to arrange its elements in waveform
//such that odd elements are lesser than its neighboring even elements.
import java.util.*;
public class Q7 {
    static void swap(int arr[],int a ,int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
     }
    public static int[] waveForm(int arr[]){
        Arrays.sort(arr);
        for(int i=0;i<arr.length-1;i+=2){
            swap(arr, i, i+1);
        }
        return arr;
       
    }
    public static void main(String[] args) {
        int arr[]={10, 90, 49, 2, 1, 5, 23};
        System.out.println(Arrays.toString(waveForm(arr)));
    }
}

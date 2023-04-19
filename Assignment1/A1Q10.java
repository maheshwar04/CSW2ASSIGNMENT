//Maheshwar(2141014002)
//Given a sorted array, rearrange it in maximum-minimum form.
import java.util.Arrays;
public class A1Q10 {
    public static int[] maxMin(int arr[]){
        int temp[]=new int[arr.length];
        int start=0;
        int end=arr.length-1;
         for(int k=0;k<temp.length;k++){
           if(k%2==0){
             temp[k]=arr[end--];
           }else{
             temp[k]=arr[start++];
           }
        }
        return temp;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7};
        System.out.println(Arrays.toString(maxMin(arr)));
    }
}

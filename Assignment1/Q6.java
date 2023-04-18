//Given an array of positive and negative integers, write a program to
//find a contiguous subarray whose sum of elements is maximum.
public class Q6 {
    public static int contiSum(int arr[]){
        int max_so_far=Integer.MIN_VALUE;
        int Maxendinghere=0;
        for(int i=0;i<arr.length;i++){
            Maxendinghere+=arr[i];
            if(Maxendinghere<0){
                Maxendinghere=0;
            }
            if(max_so_far<Maxendinghere){
                max_so_far=Maxendinghere;
            }
        }
        return max_so_far;
    }
    public static void main(String[] args) {
        int arr[]={-2, -3, 4, -1, -2, 1, 5, -3 };
         System.out.println(contiSum(arr));
    }
}

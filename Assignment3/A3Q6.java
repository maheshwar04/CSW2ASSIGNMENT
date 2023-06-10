package Assignment3;

public class A3Q6 {
    public static void separateOddEven(int arr[]){
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                System.out.print("Even numbers:"+arr[i]+", ");
            }else{
                System.out.print("odd numbers:"+arr[i]+", ");
            }
        }
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};
        separateOddEven(arr);
    }
}
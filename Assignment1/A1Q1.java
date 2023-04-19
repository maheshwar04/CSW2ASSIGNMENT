//Maheshwar(2141014002)
//Write a program to check whether a number is prime or not.
public class A1Q1{
    public static  boolean isPrime(int n){
        if(n==0||n==1){
            return false;
        }
        if(n==2){
            return true;
        }
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(isPrime(3));
    }
}
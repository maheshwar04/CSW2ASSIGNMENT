//Maheshwar(2141014002)
//Write a program to find the reverse of a number.
public class A1Q3 {
    static int rev=0;
     public static void Reverse(int n){
        int temp=n;
        if(temp==0){
            return;
        }
        while(temp>0){
            int lastdigit=temp%10;
            System.out.print(lastdigit);
            temp=temp/10;

        }
     }
    public static void main(String[] args) {
        Reverse(5676);
    }
}

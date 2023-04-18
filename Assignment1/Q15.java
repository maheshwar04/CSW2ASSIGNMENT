//Maheshwar(2141014002)
/*
 Write a recursive function to find the GCD of two numbers. Write the
recurrence of the function and solve it for a solution
 */
public class Q15 {
    public static int gcd(int a,int b){
        if(a==b){
            return a;
        }
        if(a>b){
            return gcd(a-b,b);
        }
        return gcd(a,b-a);
    }
    public static void main(String[] args) {
       
        int ans=gcd(98,56);
        System.out.println(ans);
    }
}

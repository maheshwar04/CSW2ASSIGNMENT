//Write a program to find the binary equivalent of a decimal number.
public class Q2 {
    public static int BinarytoDecimal(int n){
       int decimalValue=0;
       int temp=n;
       int base=1;
       while(temp>0){
          int lastdigit=temp%10;
             temp=temp/10;
             decimalValue+=lastdigit*base;
             base=base*2;
       }
       return decimalValue;
    }
    public static void main(String[] args) {
         System.out.println(BinarytoDecimal(1001));
    }
}

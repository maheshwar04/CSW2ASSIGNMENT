/*
 Write a java program to convert a decimal to binary equivalent using
stack(Stack collection).
 */
import java.util.Scanner;
import java.util.Stack;
public class Q3 {
    public static void main(String[] args) {  
        Stack<Integer> binaryStack = new Stack<>(); 
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        int decimalNumber = sc.nextInt();
        
        while (decimalNumber > 0) {
            int remainder = decimalNumber % 2;
            binaryStack.push(remainder);
            decimalNumber = decimalNumber / 2;
        }
        
        StringBuilder binaryNumber = new StringBuilder();
        while (!binaryStack.isEmpty()) {
            binaryNumber.append(binaryStack.pop());
        }
        
        System.out.println("Binary equivalent: " + binaryNumber.toString());
    }
    
}

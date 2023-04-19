//Maheshwar(2141014002)
package Assignment2B;
/*
  Write a program to read N number from user and keep it in suitable
data structure so that no duplicate element is present in that
 */
import java.util.Scanner;
import java.util.HashSet;
public class A2BQ7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        HashSet<Integer> hashSet = new HashSet<>();
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            int element = sc.nextInt();
            hashSet.add(element);
        }
        System.out.println("Elements with no duplicates: " + hashSet);
    }
}



package Assignment2B;
/*
 Write a program to create an TreeSet of Integer type and perform the
below operation on it.
(a.) Display the TreeSet
(b.) Ask the user to enter a number and search that number is it
present in the list or not.
(c.) Remove an element from tree
 */
import java.util.*;
public class Q1 {
      public static void main(String[] args) {
        TreeSet<Integer> ts=new TreeSet<Integer>();
        ts.add(1);
        ts.add(2);
        ts.add(3);
        ts.add(4);
        ts.add(5);
        System.out.println(ts);
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
         int n=sc.nextInt();
         if(ts.contains(n)){
            System.out.println("number is present in the list");
         }else{
            System.out.println("number is not present in the list");
         }
         System.out.println("Enter the number you want to remove");
         int m=sc.nextInt();
         ts.remove(m);
         System.out.println(ts);
      }
}

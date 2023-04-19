//Maheshwar(2141014002)
package Assignment2B;
/*
 Write a program to create a hash set of type string insert some element
into it and display it
 */
import java.util.HashSet;
public class A2BQ4 {
    public static void main(String[] args) {
        HashSet<String> mySet = new HashSet<>();
        mySet.add("apple");
        mySet.add("banana");
        mySet.add("cherry");
        mySet.add("durian");
        mySet.add("elderberry");
        System.out.println("The HashSet contains:");
            System.out.println(mySet);
        
    }
}


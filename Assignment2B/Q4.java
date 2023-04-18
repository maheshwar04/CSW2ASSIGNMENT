package Assignment2B;
/*
 Write a program to create a hash set of type string insert some element
into it and display it
 */
import java.util.HashSet;
public class Q4 {
    public static void main(String[] args) {
        HashSet<String> mySet = new HashSet<>();
        mySet.add("apple");
        mySet.add("banana");
        mySet.add("cherry");
        mySet.add("durian");
        mySet.add("elderberry");
        System.out.println("The HashSet contains:");
        for (String element : mySet) {
            System.out.println(element);
        }
    }
}


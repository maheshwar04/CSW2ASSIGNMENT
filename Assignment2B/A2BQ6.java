package Assignment2B;
/*
 Write a program to create a hash map insert some element into it and
display it
 */
import java.util.HashMap;

//Maheshwar(2141014002)
public class A2BQ6 {
    public static void main(String[] args) {
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("apple", 1);
        hashMap.put("banana", 2);
        hashMap.put("cherry", 3);
        System.out.println(hashMap);
    }
}


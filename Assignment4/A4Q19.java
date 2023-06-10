package Assignment4;
import java.util.*;
public class A4Q19 {
        public static int findMiddleElement(int[] arr) {
            Arrays.sort(arr);
            int middleIndex = arr.length / 2;
            return arr[middleIndex];
        }
    
        public static void main(String[] args) {
            int[] arr = {9, 2, 7, 4, 1, 5};
            int middleElement = findMiddleElement(arr);
            System.out.println("Middle element: " + middleElement);
        }
    }


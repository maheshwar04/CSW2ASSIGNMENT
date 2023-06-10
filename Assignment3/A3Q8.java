package Assignment3;
import java.util.Arrays;
public class A3Q8 {

    public static void sortArraysIntoHalves(int[] arr1, int[] arr2) {
        int m = arr1.length;
        int n = arr2.length;
        int i = m - 1;
        int j = 0;

        while (i >= 0 && j < n) {
            if (arr1[i] > arr2[j]) {
                int temp = arr1[i];
                arr1[i] = arr2[j];
                arr2[j] = temp;
            }
            i--;
            j++;
        }

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        System.out.println("Sorted arr1: " + Arrays.toString(arr1));
        System.out.println("Sorted arr2: " + Arrays.toString(arr2));
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 4, 7, 8};
        int[] arr2 = {2, 3, 5, 6};
        sortArraysIntoHalves(arr1, arr2);
    }
}



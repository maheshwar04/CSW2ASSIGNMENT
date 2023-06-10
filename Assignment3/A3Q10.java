package Assignment3;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
public class A3Q10 {
    public static void sortList(List<Integer> list) {
        Collections.sort(list);
        System.out.println("Sorted list: " + list);
    }

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(5, 2, 8, 1, 4, 9);
        sortList(list);
    }
}



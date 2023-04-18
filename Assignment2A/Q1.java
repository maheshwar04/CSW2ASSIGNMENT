 //Maheshwar(2141014002)
 /*
  Write a program to create an ArrayList of Integer type and perform
the below operation on it.
(a.) Display the list
(b.) Ask the user to enter a number and search that number is it
present in the list or not.
(c.) Remove an element from an asked position.
(d.) Add a condition to check the ArrayList is empty or not.
  */
 
 import java.util.ArrayList;
import java.util.Scanner;
public class Q1{ 
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int choice, number, position;
        do {
            System.out.println("Enter your choice:");
            System.out.println("1.Display the list");
            System.out.println("2.Add a number to the list");
            System.out.println("3.Remove an element from a position");
            System.out.println("4.Search a number");
            System.out.println("5.Check if the list is empty");
            System.out.println("6.Exit");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                   displayList(list);
                    break;
                case 2:
                System.out.println("Enter the number to add:");
                number = scanner.nextInt();
                addToList(list, number);
                break;
                case 3:
                    System.out.println("Enter the position to remove:");
                    position = scanner.nextInt();
                    if (removeFromPosition(list, position)) {
                        System.out.println("Element removed successfully");
                    } else {
                        System.out.println("Invalid position");
                    }
                    break;
                case 4:
                System.out.println("Enter the number to search:");
                number = scanner.nextInt();
                if (searchNumber(list, number)) {
                    System.out.println(number + " is present in the list");
                } else {
                    System.out.println(number + " is not present in the list");
                }
                break;
                case 5:
                    if (isEmpty(list)) {
                        System.out.println("The list is empty");
                    } else {
                        System.out.println("The list is not empty");
                    }
                    break;
                case 6:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }

        } while (choice != 6);

        scanner.close();
    }

   public static void displayList(ArrayList<Integer> list) {
    System.out.println(list);
    }
    public static boolean searchNumber(ArrayList<Integer> list, int number) {
        if (isEmpty(list)) {
            return false;
        }
        return list.contains(number);
    }

    public static boolean removeFromPosition(ArrayList<Integer> list, int position) {
        if (isEmpty(list) || position < 1 || position > list.size()) {
            return false;
        }
        list.remove(position - 1);
        return true;
    }

    public static void addToList(ArrayList<Integer> list, int number) {
        list.add(number);
        System.out.println("Element added successfully");
    }
    public static boolean isEmpty(ArrayList<Integer> list) {
        return list.isEmpty();
    }
}


package Q2;
/*Create a class Student having member variable name, age, mark and
required member variable. Create an LikedList of Student type and
perform the below operation on it.
(a.) Display the list
(b.) Ask the user to enter a student object and print the existence of
the object. Specify is the object is search according to reference
or contain.
(c.) Remove an specified student object.
(d.) Count the number of object present in the list */
import java.util.Scanner;
public class Student {
        private String name;
        private int age;
        private double mark;
    
        public Student(String name, int age, double mark) {
            this.name = name;
            this.age = age;
            this.mark = mark;
        }
    
        public String getName() {
            return name;
        }
    
        public int getAge() {
            return age;
        }
    
        public double getMark() {
            return mark;
        }
    
        @Override
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Student)) {
                return false;
            }
            Student other = (Student) obj;
            return this.name.equals(other.name) && this.age == other.age && this.mark == other.mark;
        }
    }
    
 class StudentLinkedList {
        private class Node {
            private Student student;
            private Node next;
    
            public Node(Student student) {
                this.student = student;
            }
        }
    
        private Node head;
    
        public void add(Student student) {
            Node newNode = new Node(student);
            if (head == null) {
                head = newNode;
            } else {
                Node current = head;
                while (current.next != null) {
                    current = current.next;
                }
                current.next = newNode;
            }
        }
    
        public void display() {
            Node current = head;
            while (current != null) {
                System.out.println("Name: " + current.student.getName() + ", Age: " + current.student.getAge() + ", Mark: " + current.student.getMark());
                current = current.next;
            }
        }
    
        public void search(Student student) {
            Node current = head;
            boolean found = false;
            while (current != null) {
                if (current.student.equals(student)) {
                    found = true;
                    break;
                }
                current = current.next;
            }
            if (found) {
                System.out.println("Student exists in the list.");
            } else {
                System.out.println("Student does not exist in the list.");
            }
        }
    
        public void remove(Student student) {
            if (head == null) {
                return;
            }
            if (head.student.equals(student)) {
                head = head.next;
                return;
            }
            Node previous = head;
            Node current = head.next;
            while (current != null) {
                if (current.student.equals(student)) {
                    previous.next = current.next;
                    return;
                }
                previous = current;
                current = current.next;
            }
        }
    
        public int count() {
            int count = 0;
            Node current = head;
            while (current != null) {
                count++;
                current = current.next;
            }
            return count;
        }

    public static void main(String[] args) {
        StudentLinkedList list = new StudentLinkedList();

        list.add(new Student("Alice", 20, 80.0));
        list.add(new Student("Bob", 21, 75.0));
        list.add(new Student("Charlie", 19, 85.0));
        list.add(new Student("David", 22, 90.0));
        list.add(new Student("Eve", 18, 70.0));

        Scanner sc = new Scanner(System.in);
        System.out.println("List of students:");
        list.display();
        System.out.println("Enter the name of the student to search for:");
        String name = sc.nextLine();
        System.out.println("Enter the age of the student to search for:");
        int age = sc.nextInt();
        System.out.println("Enter the mark of the student to search for:");
        double mark = sc.nextDouble();
        sc.nextLine(); 
        Student student = new Student(name, age, mark);
        list.search(student);
        System.out.println("Enter the name of the student to remove:");
        name = sc.nextLine();
        System.out.println("Enter the age of the student to remove:");
        age = sc.nextInt();
        System.out.println("Enter the mark of the student to remove:");
        mark = sc.nextDouble();
        sc.nextLine(); 
        student = new Student(name, age, mark);
        list.remove(student);
        System.out.println("Updated list of students:");
        list.display();
        int count = list.count();
        System.out.println("Number of students in the list: " + count);
    }
}

    
    


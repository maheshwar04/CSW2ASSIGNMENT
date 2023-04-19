//Maheshwar(2141014002)
/*
 Write a recursive algorithm to solve the Tower of Hanoi problem.
 */
public class A1Q14 {
    public static void towerOfHanoi(int n, char startRod, char endRod, char tempRod){
        if (n == 0) {
            return;
        }
        towerOfHanoi(n - 1, startRod, tempRod, endRod);
        System.out.println("Move disk " + n + " from rod " + startRod+ " to rod " + endRod);
        towerOfHanoi(n - 1, tempRod,endRod,startRod);
    }
  public static void main(String[] args) {
    int n=3;
    towerOfHanoi(n, 'A', 'C','B');
  }
}

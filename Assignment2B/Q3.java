//Maheshwar(2141014002)
package Assignment2B;
/*
 Shortest remaining time next(SRTN) is a scheduling algorithm which
serve first the process which having shortest remaining time among all
the process. Write a java program which take N process burst time
and print the scheduling sequence using SRTN.
 */
import java.util.*;
public class Q3{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of processes: ");
        int n = scanner.nextInt();
        int[] burstTimes = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter the burst time of process " + (i+1) + ": ");
            burstTimes[i] = scanner.nextInt();
        }
        int[] remainingTimes = new int[n];
        for (int i = 0; i < n; i++) {
            remainingTimes[i] = burstTimes[i];
        }
        int currentTime = 0;
        ArrayList<Integer> completedProcesses = new ArrayList<>();
        
        while (completedProcesses.size() < n) {
            int shortestProcess = -1;
            int shortestTime = Integer.MAX_VALUE;
            for (int i = 0; i < n; i++) {
                if (remainingTimes[i] < shortestTime && !completedProcesses.contains(i)) {
                    shortestProcess = i;
                    shortestTime = remainingTimes[i];
                }
            }

            remainingTimes[shortestProcess]--;
            currentTime++;
            
            if (remainingTimes[shortestProcess] == 0) {
                completedProcesses.add(shortestProcess);
            }
        }
    
        System.out.println("Scheduling sequence using SRTN:");
        for (int i = 0; i < n; i++) {
            System.out.print("P" + (completedProcesses.get(i)+1) + " ");
        }
        System.out.println();
        
        scanner.close();
    }
}


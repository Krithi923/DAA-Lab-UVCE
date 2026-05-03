package daaAssignments;

import java.util.Random;

public class UniqueElementArray {
    public static boolean checkUnique(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    return false; 
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int startSize = 1000,endSize = 10000,step = 500;
System.out.printf("%-10s %-15s %-15s %-15s%n",
                          "Size", "Best(ns)", "Worst(ns)", "Average(ns)");

        Random rand = new Random();

        for (int n = startSize; n <= endSize; n += step) {
            // Best case: 
            int[] bestCase = new int[n];
            for (int i = 0; i < n; i++) bestCase[i] = i;
            long t1 = System.nanoTime();
            checkUnique(bestCase);
            long bestTime = System.nanoTime() - t1;

            // Worst case: 
            int[] worstCase = new int[n];
            for (int i = 0; i < n; i++) worstCase[i] = 1;
            long t2 = System.nanoTime();
            checkUnique(worstCase);
            long worstTime = System.nanoTime() - t2;
            
            //Average case:
            int[] avgCase = new int[n];
            for (int i = 0; i < n; i++) avgCase[i] = rand.nextInt(n / 2);
            long t3 = System.nanoTime();
            checkUnique(avgCase);
            long avgTime = System.nanoTime() - t3;
            System.out.printf("%-10d %-15d %-15d %-15d%n",
                              n, worstTime, bestTime, avgTime);
        }
    }
}
package daaAssignments;

public class TowerOfHanoi{
    public static void solveHanoi(int n, String source, String dest, String temp) {
        if (n == 1) {
            return; // base case
        }
        solveHanoi(n - 1, source, temp, dest);
        solveHanoi(n - 1, temp, dest, source);
    }

    public static void main(String[] args) {
        for (int disks = 1; disks <= 50; disks++) {
            long startTime = System.nanoTime();
            solveHanoi(disks, "source", "dest", "temp");
            long endTime = System.nanoTime();

            long duration = endTime - startTime;
            System.out.println("No. of disks->"+disks + "\t\t TimeTaken->" + duration+"ns");
        }
    }
}

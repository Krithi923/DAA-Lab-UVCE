package daaAssignments;
import java.util.Scanner;

public class FibIterative {
	public static long fibIterative(int n) {
        if (n <= 1) return n;
        long a = 0, b = 1;
        for (int i = 2; i <= n; i++) {
            long temp = a + b;
            a = b;
            b = temp;
        }
        return b;
    }
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter n: ");
    int n = sc.nextInt();

    long startIter = System.nanoTime();
    long iterResult = fibIterative(n);
    long endIter = System.nanoTime();
    System.out.println("Iterative Fibonacci(" + n + ") = " + iterResult+ " | Time = " + (endIter - startIter) + " ns");
    sc.close();
}
}

//Non recursive calculation of fibonacci can calculate up to n=164

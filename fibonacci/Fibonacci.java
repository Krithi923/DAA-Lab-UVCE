package daaAssignments;
import java.util.Scanner;
public class Fibonacci {
	public static long fibRecursive(int n) {
	        if (n <= 1) return n;
	        return fibRecursive(n - 1) + fibRecursive(n - 2);
	    }
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

	        long startRec = System.nanoTime();
	        long recResult = fibRecursive(n);
	        long endRec = System.nanoTime();

	        long startIter = System.nanoTime();
	        long iterResult = fibIterative(n);
	        long endIter = System.nanoTime();

	        System.out.println("Recursive Fibonacci(" + n + ") = " + recResult + " | Time = " + (endRec - startRec) + " ns");
	        System.out.println("Iterative Fibonacci(" + n + ") = " + iterResult+ " | Time = " + (endIter - startIter) + " ns");
	        sc.close();
	    }
	}
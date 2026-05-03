package daaAssignments;
import java.util.Random;
public class LinearSearch {
public static int linearSearch(int arr[], int key) {
	        for (int i = 0; i < arr.length; i++) {
	            if (arr[i] == key)
	                return i;
	        }
	        return -1;
	    }
 public static void main(String[] args) {
            Random rand = new Random();
	        System.out.println("N\t\tBest(ns)\t\tAverage(ns)\t\tWorst(ns)");
             for (int n = 10000; n <= 100000; n += 5000) {
             int arr[] = new int[n];

	            for (int i = 0; i < n; i++) {
	                arr[i] = rand.nextInt(100000);
	            }
	            long start, end;
// Best Case
	            start = System.nanoTime();
	            for(int i=0;i<1000;i++)
	                linearSearch(arr, arr[0]);
	            end = System.nanoTime();
	            long best = end - start;
// Average Case
	            start = System.nanoTime();
	            for(int i=0;i<1000;i++)
	                linearSearch(arr, arr[n/2]);
	            end = System.nanoTime();
	            long avg = end - start;
// Worst Case
	            start = System.nanoTime();
	            for(int i=0;i<1000;i++)
	                linearSearch(arr, -1);
	            end = System.nanoTime();
	            long worst = end - start;
            System.out.println(n + "\t\t" + best + "\t\t" + avg + "\t\t" + worst);
	        }
	    }
	}

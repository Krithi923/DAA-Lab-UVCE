package daaLab;

import java.util.*;
public class QuickSort {

	public static int partition(int[] a, int low, int high)
	{
	    int i, j, temp, p;
	    p = a[low];
	    i = low + 1;
	    j = high;

	    while (low < high) {
	        while (a[i] < p && i < high)
	            i++;

	        while (a[j] > p)
	            j--;

	        if (i < j)
	        {
	            temp = a[i];
	            a[i] = a[j];
	            a[j] = temp;
	        } else {
	            temp = a[low];
	            a[low] = a[j];
	            a[j] = temp;
	            return j;
	        }
	    }
	    return j;
	}

	public static void sort(int[] arr, int low, int high)
	{
	    if (low < high)
	    {
	        int s = partition(arr, low, high);
	        sort(arr, low, s - 1);
	        sort(arr, s + 1, high);
	    }
	}
	
	 public static void main(String[] args) {

	        Scanner scn = new Scanner(System.in);
	        Random r = new Random();

	        System.out.println("Enter no of times you want to execute ");
	        int times = scn.nextInt();
	        System.out.println("Enter no. of elements\n");
	        int n = scn.nextInt();

	        for (int i = 0; i < times; i++) {
	            
	            int[] arr = new int[n];
	            System.out.println("Quick sort "+ (i+1));

	            for (int j= 0; j < n; j++) {
	                arr[j] = r.nextInt(20);
	            }
	            System.out.println("Original Array: " + Arrays.toString(arr));

	            long startTime = System.nanoTime();
	            sort(arr, 0, arr.length - 1);
	            long endTime = System.nanoTime();

	            System.out.println("Sorted Array: " + Arrays.toString(arr));

	            double timeElapsed = (endTime - startTime) / 1e6;
	            System.out.println("Time Complexity: " + timeElapsed + "milliseconds");
	            System.out.println();

	            scn.close();
	        }
	       
	 }}

package daaLab;

import java.util.*;

public class HeapSort {
	    public static void heapSort(int[] arr)
	    {
	        int n = arr.length;

	        for (int i = n / 2 - 1; i >= 0; i--)
	        {
	            heapify(arr, n, i);
	        }
	        for (int i = n - 1; i > 0; i--)
	        {
	            int temp = arr[i];
	            arr[i] = arr[0];
	            arr[0] = temp;

	            heapify(arr, i, 0);
	        }
	    }

	    public static void heapify(int[] arr, int n, int i)
	    {
	        int largest = i;
	        int left = 2 * i + 1;
	        int right = 2 * i + 2;

	        if (left < n && arr[left] > arr[largest])
	        {
	            largest = left;
	        }
	        if (right < n && arr[right] > arr[largest])
	        {
	            largest = right;
	        }

	        if (largest != i)
	        {
	            int temp = arr[i];
	            arr[i] = arr[largest];
	            arr[largest] = temp;

	            heapify(arr, n, largest);
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
	            heapSort(arr);
	            long endTime = System.nanoTime();

	            System.out.println("Sorted Array: " + Arrays.toString(arr));

	            double timeElapsed = (endTime - startTime) / 1e6;
	            System.out.println("Time Complexity: " + timeElapsed + "milliseconds");
	            System.out.println();

	            scn.close();
	        }
	       
	 }

}

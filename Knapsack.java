package daaLab;

	import java.util.Scanner;

	public class Knapsack {

	    public static int knapsack(int[] weights, int[] values, int capacity) {
	        int n = weights.length;
	        int[][] dp = new int[n + 1][capacity + 1];

	        for (int i = 0; i <= n; i++) {
	            for (int w = 0; w <= capacity; w++) {
	                if (i == 0 || w == 0) {
	                    dp[i][w] = 0;
	                } else if (weights[i - 1] <= w) {
	                    dp[i][w] = Math.max(values[i - 1] + dp[i - 1][w - weights[i - 1]], dp[i - 1][w]);
	                } else {
	                    dp[i][w] = dp[i - 1][w];
	                }
	            }
	        }
	        displayMatrix(dp);
	        return dp[n][capacity];
	    }

	    public static void displayMatrix(int[][] matrix) {
	        for (int i = 0; i < matrix.length; i++) {
	            for (int j = 0; j < matrix[i].length; j++) {
	                System.out.print(matrix[i][j] + " ");
	            }
	            System.out.println();
	        }
	    }

	    public static void main(String[] args) {
	        Scanner scn = new Scanner(System.in);
	        System.out.println("Enter the no of items");
	        int n = scn.nextInt();

	        int[] weights = new int[n];
	        int[] values = new int[n];

	        System.out.println("Weights \n");
	        for (int i = 0; i < n; i++) {
	            weights[i] = scn.nextInt();
	        }

	        System.out.println("Values \n");
	        for (int i = 0; i < n; i++) {
	            values[i] = scn.nextInt();
	        }

	        System.out.println("Capacity \n");
	        int capacity = scn.nextInt();

	        int maxValue = knapsack(weights, values, capacity);
	        System.out.println("Maximum value : " + maxValue);

	        scn.close();
	    }
	}


import java.util.*;
public class Topo {
	

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter vertices: ");
	        int n = sc.nextInt();
	        int[][] a = new int[n][n];
	        System.out.println("Enter adjacency matrix:");
	        for (int i = 0; i < n; i++)
	            for (int j = 0; j < n; j++)
	                a[i][j] = sc.nextInt();
	        int[] in = new int[n];
	        for (int i = 0; i < n; i++)
	            for (int j = 0; j < n; j++)
	                if (a[i][j] == 1) in[j]++;
	        Queue<Integer> q = new LinkedList<>();
	        for (int i = 0; i < n; i++)
	            if (in[i] == 0) q.add(i);
	        System.out.print("Topological order: ");
	        while (!q.isEmpty()) {
	            int x = q.poll();
	            System.out.print(x + " ");
	            for (int j = 0; j < n; j++)
	                if (a[x][j] == 1 && --in[j] == 0) q.add(j);
	        }
	        sc.close();
	    }
	}

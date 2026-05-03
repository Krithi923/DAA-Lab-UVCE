package daaLab;

	import java.util.*;

	public class BFS {
		 public static void main (String[] args)
		    {
		        int a[][] = new int[10][10];
		        int i, j, n, s;
		        System.out.println("Enter the no of vertices ");
		        Scanner scn = new Scanner(System.in);
		        n = scn.nextInt();
		        
		        System.out.println("Enter the weighted graph\n");
		        for (i = 0; i <n; i++)
		            for (j = 0; j < n; j++)
		        a[i][j] = scn.nextInt();
		        
	           System.out.println("Enter the source:");
	           s=scn.nextInt();
	           
	           System.out.println("BFS traversal5"
	           		+ "");
		       bfs(a,s,n);
		        scn.close();
		    }
		
	    public static void bfs(int[][] a, int source, int vertices)
	    {
	        Queue<Integer> queue = new LinkedList<>();
	        boolean visited[] = new boolean[vertices];
	        
	        visited[source] = true;
	        queue.add(source);
	        
	        while(! queue.isEmpty())
	        {
	            int curr= queue.poll();
	            System.out.println(curr+" ");
	            
	            for(int i = 0; i < vertices; i++) {
	                if(visited[i] == false && a[curr][i] == 1)
	                {
	                    visited[i] = true;
	                    queue.add(i);
	                }
	            }
	        }
	    }
	}


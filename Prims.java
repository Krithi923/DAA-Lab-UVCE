package daaLab;

import java.util.*;

public class Prims {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int i, j, v = 0, u = 0, sum = 0, min, n, k = 0;

        System.out.println("Enter no. of edges");
        n = scn.nextInt();

        int[][] w = new int[10][10];
        int[] sol = new int[10];

        System.out.println("Enter the weighted graph\n");
        for (i = 1; i <= n; i++)
            for (j = 1; j <= n; j++)
        w[i][j] = scn.nextInt();

        System.out.println("Enter the source vertex\n");
        int s = scn.nextInt();

        sol[s] = 1;
        k++;
        while (k <= n - 1) {
            min = 99;
            for (i = 1; i <= n; i++)
                for (j = 1; j <= n; j++)

                    if (sol[i] == 1 && sol[j] == 0)
                        if (w[i][j] < min && i != j) {
                            min = w[i][j];
                            u = i;
                            v = j;
                        }
            sol[v] = 1;
            k++;
            sum = sum + min;
            System.out.println(u + "->" + v + "=" + min);
        }
        int flag = 0;
        if (sol[v] == 0)
            flag = 1;

        if (flag==1) {
            System.out.println("No MST");
        } else {
            System.out.println("Cost of minimum spanning tree is" + sum);
        }
    }
}

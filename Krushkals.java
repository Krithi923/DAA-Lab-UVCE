package daaLab;
import java.util.*;

public class Krushkals {

    int[] parent = new int[10];

    int find(int m) {
        int p = m;
        while (parent[p] != 0)
            p = parent[p];
        return p;
    }

    void union(int i, int j) {
        if (i < j)
            parent[j] = i;
        else
            parent[i] = j;
    }

    void kruskl(int[][] a,int n) {
        int i, j, k = 0, min, sum = 0, v = 0, u = 0;
        while (k < n - 1) {
            min = 99;
            for (i = 1; i <= n; i++) {
                for (j = 1; j <= n; j++)
                    if (a[i][j] < min && i != j) {
                        min = a[i][j];
                        u = i;
                        v = j;
                    }
            }

            i = find(u);
            j = find(v);

            if (i != j) {
                union(i, j);
                System.out.println("(" + u + "," + v + ")" + "=" + a[u][v]);
                sum = sum + a[u][v];
                k++;
            }
            a[u][v] = a[v][u] = 99;
        }
        System.out.println("Cost of MST" + sum);
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        Krushkals k = new Krushkals();

        System.out.println("Enter number of vertices \n");
        int n = scn.nextInt();

        System.out.println("Enter the weighted graph");
        int[][] a = new int[10][10];

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++)
                a[i][j] = scn.nextInt();
        }

        k.kruskl(a, n);
        scn.close();
    }
}

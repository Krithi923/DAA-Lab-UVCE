
import java.util.*;

public class NQueens_14 {
    static int n;
    static boolean isSafe(int[][] b, int r, int c) {
        for (int i = 0; i < c; i++) if (b[r][i] == 1) return false;
        for (int i = r, j = c; i >= 0 && j >= 0; i--, j--) if (b[i][j] == 1) return false;
        for (int i = r, j = c; i < n && j >= 0; i++, j--) if (b[i][j] == 1) return false;
        return true;
    }
    static boolean solve(int[][] b, int c) {
        if (c >= n) return true;
        for (int i = 0; i < n; i++) {
            if (isSafe(b, i, c)) {
                b[i][c] = 1;
                if (solve(b, c+1)) return true;
                b[i][c] = 0;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N: ");
        n = sc.nextInt();
        int[][] b = new int[n][n];
        solve(b, 0);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++)
                System.out.print(b[i][j] + " ");
            System.out.println();
        }
        sc.close();
    }
}
package daaAssignments;

public class PrimeNumbers {
    public static void main(String[] args) {
        int n = 1000; 
        int[] A = new int[n + 1]; 
        int[] L = new int[n + 1]; 

      
        for (int p = 2; p <= n; p++) {
            A[p] = p;
        }

        int limit = (int) Math.sqrt(n);
        for (int p = 2; p <= limit; p++) {
            if (A[p] != 0) {
                int j = p * p;
                while (j <= n) {
                    A[j] = 0;
                    j = j + p;
                }
            }
        }
        int i = 1;
        for (int p = 2; p <= n; p++) {
            if (A[p] != 0) {
                L[i] = A[p];
                i++;
            }
        }
        for (int m = 1; m < i; m++) {
            System.out.print(L[m]+" ");
            if(m%10==0)
            	System.out.println();
        }
    }
}

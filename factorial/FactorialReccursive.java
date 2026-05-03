package daaAssignments;
import java.util.*;
public class FactorialReccursive {
	public static int reccursiveFactorial(int n) {
       if(n==0 || n==1)
	    	return 1;
	    else
	    	return n*reccursiveFactorial(n-1);
	}
	
    public static void main(String[] args) {
    	long startTime=System.nanoTime();
    	for(int i=0;i<=16;i++) {
    	int factorial=reccursiveFactorial(i);
    	long endTime=System.nanoTime();
    	long duration=endTime-startTime;
    	System.out.println("Factorial of "+i+" is "+factorial+" \t Time taken= "+duration+" nanoseconds");
    	System.out.println();
    	}
    }
}

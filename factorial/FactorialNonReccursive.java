package daaAssignments;

public class FactorialNonReccursive {
	public static int factorialNonReccursive(int n){
		int fact=1;
    	while(n>1) {
    		fact=fact*n;
    		n--;
    	}
    	return fact;
	}
	   public static void main(String[] args) {
	
	    	for(int i=1;i<=17;i++) {
	    	long startTime=System.nanoTime();
	    	int factorial=factorialNonReccursive(i);
	    	long endTime=System.nanoTime();
	    	long duration=endTime-startTime;
	    	System.out.println("Factorial of "+i+" is "+factorial+"\t Time taken= "+duration+" nanoseconds");
	    
	    	}
	    }

}

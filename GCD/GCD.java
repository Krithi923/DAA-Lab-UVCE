package daaAssignments;
import java.util.*;

public class GCD {
   public static void main(String[] args) {
	   Scanner scn=new Scanner(System.in);
	   int num1,num2,gcd=1;
	   System.out.println("Enter first number");
	   num1=scn.nextInt();
	   System.out.println("Enter second number");
	   num2=scn.nextInt();
	   
	  int i=2;
	  long startTime = System.nanoTime();

	   while(i<=num1 && i<=num2) {
	       
	       if(num1%i==0 && num2%i==0)
	    	{
	    		gcd=gcd*i;
	    		num1=num1/i;
	    		num2=num2/i;
	    	}else {
	    		i++;
	    	}
	     }
	   System.out.println("GCD is "+gcd); 
	   
	   long endTime = System.nanoTime();
       long duration = endTime - startTime;

      
       System.out.println("Execution time: " + duration + " nanoseconds");
	   scn.close();
   }
}

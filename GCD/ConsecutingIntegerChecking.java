package daaAssignments;
import java.util.*;

public class ConsecutingIntegerChecking {
    public static void main(String[] args) {
    	Scanner scn=new Scanner(System.in);
 	   int num1,num2,gcd=1;
 	   System.out.println("Enter first number");
 	   num1=scn.nextInt();
 	   System.out.println("Enter second number");
 	   num2=scn.nextInt();
 	   
 	  long startTime = System.nanoTime();
 	   int min=Math.min(num1, num2);
 	   
 	   for(int i=min;i>=1;i--) {
 		   if(num1%i==0 && num2%i==0)
 		   {
 			  gcd=i;
 			  break;
 			  
 		   }
 	   } System.out.println("The GCD of the given number is "+gcd);
 	
  
 	  long endTime = System.nanoTime();
      long duration = endTime - startTime;

     
      System.out.println("Execution time: " + duration + " nanoseconds");
	   
    	scn.close();
    }
}

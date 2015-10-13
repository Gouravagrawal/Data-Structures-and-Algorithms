package numberProblem;

import java.util.Scanner;

public class ReverseNumber {
/*
 * n%10 gives the remainder of the division(also if n<10 then n%10 would give only)
 * n/10 gives the quotient of the division(also if n<10 then n/10 would give 0 only)
 */
	 public static void main(String args[])
	   {
	      int n, reverse = 0;	     
	      n=371;
	      while( n != 0 )
	      {
	          reverse = reverse * 10;
	          reverse = reverse + n%10;
	          n = n/10;
	      }
	 
	      System.out.println("Reverse of entered number is "+reverse);
	   }
}

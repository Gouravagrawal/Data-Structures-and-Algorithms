package numberProblem;

import java.math.BigDecimal;

public class CheckMaxValues {
/*
 * Float 4 bytes --use when you want precision upto 7-8 digits
 * Double 8 bytes-- use when you want precision upto 15-16 digits 
 * BigDecimal gives you exact values. useful in case of money transacions
 * Integer 4 bytes ---
 * Long 8 bytes ----
 * Big Integer when you want to go beyond 8 bytes like example calculate factorial of 50 which would be around 40 -60 digits
 * answer. Also this big INteger class in immutable.
 */
	public static void main (String args[])
{
		System.out.println("long max value   "+ Long.MAX_VALUE);
		System.out.println("long min value   "+ Long.MIN_VALUE);
		
		System.out.println("int max value    "+ Integer.MAX_VALUE);
		System.out.println("long max value   "+ Integer.MIN_VALUE);
		
		System.out.println("Double Max value   "+ Double.MAX_VALUE);
		System.out.println("Double Max value   "+ Double.MIN_VALUE);
		
		System.out.println("FLoat Max Value    "+ Float.MAX_VALUE);
		System.out.println("FLoat Max Value    "+ Float.MIN_VALUE);
		
		System.out.println("Big decimal value "+ BigDecimal.ONE);
		System.out.println("Big decimal value "+ BigDecimal.TEN);
		}
}

package array;

import java.util.Arrays;

public class MaximumSubArray {

	public static void main (String args[]){
		int A[]={-2,1,-3,4,-1,2,1,-5,4};
		
		 int maxStartIndex=0;
	        int maxEndIndex=0;
	        int maxSum = Integer.MIN_VALUE; 

	        System.out.println("MAXSUM" +maxSum);
	        int sum= 0;
	        int maxStartIndexUntilNow=0;

	        for (int i = 0; i < A.length; i++) {

	        	sum+=A[i];

	            if(sum>maxSum){
	                maxSum = sum;
	                maxStartIndex=maxStartIndexUntilNow;
	                maxEndIndex = i;
	            }
	            else if (sum<0){
	                maxStartIndexUntilNow=i+1;
	                sum=0;
	            }
	        }

	        System.out.println("Max sum         : "+maxSum);
	        for(int i=maxStartIndex;i<=maxEndIndex;i++){
	    	   System.out.print(A[i]+ " ,");
	       }
	    }
	      
	
}

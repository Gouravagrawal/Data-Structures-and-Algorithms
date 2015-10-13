package numberProblem;

import java.util.Arrays;

public class findMultiplesOfANumber {

	public static void main(String args[]){
		int n=30;
		int a []=new int[n] ;
		for(int i=1; i<n;i++){
			int k=i;
			if(n%i==0){
				a[i]=i;
		
			}
		}
		System.out.println("Multiple of a number is "+ Arrays.toString(a));
	}
}

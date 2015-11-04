package array;

import java.util.Arrays;
import java.util.Collections;

public class ArraySeparationNegetiveAndPostive {


	public static void main(String args[]){
		
		System.out.println("hello");
		
		int a[]={-1,-21,-33,-5,0,1,45,7,2};
		int s1=0;
		int s2=0;
		int neg[]=new int[5];
		int pos[]=new int[5];
		
		for(int i=0;i<a.length;i++){
			if(a[i]<=0){
				neg[s1]=a[i];
				s1++;
				
			}
			
			else{
				pos[s2]=a[i];
				s2++;
			}
			
		}
		
		System.out.println(Arrays.toString(neg));
		System.out.println(Arrays.toString(pos));
		
	}
}


package array;

import java.sql.Array;
import java.util.Arrays;
import java.util.HashSet;

public class FindNumberDoNotOccurTwicwe {

	public static void main (String args[]){
		int a[]={1,2,1,4,5,2,3,4,3}; int sumArray=0; int sumhashSet=0;
		HashSet<Integer> hashSet=new HashSet<Integer>();
		for(int i=0;i<a.length;i++){
			hashSet.add(a[i]);
			sumArray=sumArray+a[i];
		}
		for(int b:hashSet){
			sumhashSet=sumhashSet+2*b;
		}
		
		System.out.println("Element which is not twice is " + (sumhashSet-sumArray));
		}

}
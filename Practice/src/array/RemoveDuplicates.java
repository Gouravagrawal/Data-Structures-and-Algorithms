package array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class RemoveDuplicates {
	
public static void main (String args[]){
	int a[] ={1,2,3,3,4,5,7,5,4,7,92,234,4};
	HashSet<Integer> hashSet=new HashSet<Integer>();
	for(int b=0;b<a.length;b++){
		hashSet.add(a[b]);
	}
	
	/*
	 * First method to iterate a hashset
	 */
	for(int n:hashSet){
		System.out.print(n);
	}
	/*
	 * Second method to iterate a hashset
	 */
	System.out.println(Arrays.toString(hashSet.toArray()));
 
 /*
  * Third method to iterate a hashset
  */
	Iterator i= hashSet.iterator();
	while(i.hasNext()){
		System.out.print(i.next());
	}
}
}

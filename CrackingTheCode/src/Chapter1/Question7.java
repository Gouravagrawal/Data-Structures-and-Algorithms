package Chapter1;

import java.util.Arrays;

public class Question7 {

	
	public static void main (String args[]){
		int aa=3;int bb=3;
		
		int a[][]={{1,0,3,4},{1,2,5,3},{1,2,9,3}};
		
		for(int i=0;i<a.length;i++){
			for(int k=0;k<a[i].length;k++){
				
				if(a[i][k]==0){
					
					int c=i;
					int d=k;
				}
			}
		}
		
		for(int i=0;i<a.length;i++){
			for(int k=0;k<a[i].length;k++){
				if(i==0||k==1){
					a[i][k]=0;
				}
			}
		
	}
		
		System.out.println(Arrays.toString(a[0]));
		System.out.println(Arrays.toString(a[1]));
		System.out.println(Arrays.toString(a[2]));
}
}

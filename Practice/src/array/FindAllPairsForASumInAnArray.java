package array;

import java.util.HashMap;
import java.util.Scanner;

public class FindAllPairsForASumInAnArray {

	public static void main (String args[])
{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENter the number of values to enter");
		int a=sc.nextInt();
		int b[]=new int[a];
		int c[]=new int[a];
		HashMap<Integer,String> hashMap=new HashMap<Integer, String>();
		System.out.println("Enter the elements of the array");
		for(int i=0; i<b.length;i++){
			b[i]=sc.nextInt();
		}
		
		System.out.println("Enter the number whose combinations are to be checked");
		int sum=sc.nextInt();
		
		for(int k=0; k<b.length;k++){
			//int j=sum-b[k];
			while((sum-b[k])!=0&&(sum-b[k])>0){
			System.out.println("Pairs are "+ "("+ b[k]+","+ (sum-b[k])+ ")");
			k++;
		}
		}
		
	
}
}

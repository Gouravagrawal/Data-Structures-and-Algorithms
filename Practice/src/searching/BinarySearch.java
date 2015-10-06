package searching;


import java.util.Arrays;
import java.util.Scanner;


public class BinarySearch {
	int a;
	int size = 0;
	int aray[];

	public void takeInput() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array to sort");
		size = sc.nextInt();
		aray = new int[size];
		System.out.println("ENter the elements of the array");

		for (int i = 0; i < size; i++) {
			System.out.println("ENter the value");
			aray[i] = sc.nextInt();

		}
		System.out.println("Array is " + Arrays.toString(aray));
		
		this.sortarray(aray);
	}

	public void sortarray(int[] aray){
		
		System.out.println("check");
		for(int k=0;k<aray.length;k++){
			
		for(int i=0;i<aray.length-1;i++){
			
			//System.out.println(aray[0]+ aray[4]);
		if(aray[i]>aray[i+1]){
			int x=0;
			x=aray[i];
			aray[i]=aray[i+1];			
			aray[i+1]=x;
		}
		}
		}
		
		this.search(aray);
		System.out.println("Print the sorted Array" + Arrays.toString(aray));
	}
	
	public void search(int[] aray){
		
	}
	
	public static void main(String args[]) {

		bubblesort sort = new bubblesort();
		sort.takeInput();

	}

}

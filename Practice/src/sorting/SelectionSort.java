package sorting;
import java.util.Arrays;


public class SelectionSort {

	public static void main (String args[]){
		
		int arr[]={2,6,12,1,8,3};
	int temp=0;
		for(int i=0; i<arr.length-1;i++){
			int min=arr[i];
			for(int k=i+1;k<arr.length;k++){
				//min=arr[i];
				if(arr[i]>arr[k]){
					min=arr[k];
					
					
				}
				arr[k]=arr[i];
				arr[i]=min;
			}
			
			System.out.println(Arrays.toString(arr));
		}
}

}
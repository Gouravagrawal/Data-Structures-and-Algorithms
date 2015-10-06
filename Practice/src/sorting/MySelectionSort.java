package sorting;
import java.util.Arrays;


public class MySelectionSort {
	 public static int[] doSelectionSort(int[] arr){
         
	        for (int i = 0; i < arr.length - 1; i++)
	        {
	            int index = arr[i];
	            for (int j = i + 1; j < arr.length; j++){
	                if (arr[j] < arr[i]){
	                    index = arr[j];
	            }
	                }
	        
	            int smallerNumber = index; 
	            arr[index] = arr[i];
	            arr[i] = smallerNumber;
	            
	            System.out.println(Arrays.toString(arr));
	        }
	        return arr;
	    }
	     
	    public static void main(String a[]){
	         
	        int[] arr1 = {2,6,12,1,8,3};
	        int[] arr2 = doSelectionSort(arr1);
	        for(int i:arr2){
	            System.out.print(i);
	            System.out.print(", ");
	        }
	    }
	
}

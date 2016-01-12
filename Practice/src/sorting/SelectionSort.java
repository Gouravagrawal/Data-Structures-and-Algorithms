package sorting;

public class SelectionSort {

	 public static int[] doSelectionSort(int[] arr){
         
	        for (int i = 0; i < arr.length - 1; i++)
	        {
	        	//took the first element of the array as index
	            int index = i;
	            
	            //will compare this index element will the rest all element of the array
	            
	            for (int j = i + 1; j < arr.length; j++)
	            	//if we find any element duration iteration to be smaller then the already chosen
	            //	index element then will make the new element as index
	                if (arr[j] < arr[index])
	                    index = j;
	      //then will just swap the index numner and then make it the first element and then again will 
	            // do the same.
	            int smallerNumber = arr[index]; 
	            arr[index] = arr[i];
	            arr[i] = smallerNumber;
	        }
	        return arr;
	    }
	     
	    public static void main(String a[]){
	         
	        int[] arr1 = {10,34,2,56,7,67,88,42};
	        int[] arr2 = doSelectionSort(arr1);
	        for(int i:arr2){
	            System.out.print(i);
	            System.out.print(", ");
	        }
	    }
	
}

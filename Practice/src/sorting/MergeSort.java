package sorting;
import java.util.Arrays;

public class MergeSort {
     
  static int[] readInputArray(){
	  int []a={56,12,99,-3,4,5};
	  return a;
  }
 
  static void sort(int[] array){
	  mergeSort(array,0, array.length-1);
  }
  
  static void merge(int[] array, int low, int mid, int high ){
	  int left=low;
	  int right=mid+1;
	  int k=0;
	  int []temp=new int[high-low+1];
	  while(left<=mid&& right<=high){
	  if(array[left]<array[right]){
		  temp[k]=array[left];
		  left++;
	  }
	  else{
		  temp[k]=array[right];
		  right++;
	  }
	  k++;
  }
	  if(left<=mid){
	  while(left<=mid){
		  temp[k]=array[left];
		  left++;
		  k++;
	  }}
	  else if(right<=high){
	  while(right<=high){
		  temp[k]=array[right];
		  right++;
		  k++;
	  }
	  }
  }
  static void mergeSort(int[] array, int low, int high){
	 //If the start index is lower then the high index only then we want to sort the aray else
	  //if the low=high then array has only one element or if low > high then array does not exists
	  if(low<high){
		  int mid=(high+low)/2;
		  mergeSort(array, low, mid);
		  mergeSort(array, mid+1, high);
		  
		  // finaly after dividing it to smaller arrays we wil merge it ....so this is our merger step
		 //we require here 2 arrays to merge so will pass low and high index here so that we would have 
		 // 2 arrays from low -- mid and mid+1--high
		  merge(array, low,mid, high);
	  }
  }
    public static void main(String a[]){
    	int inputarray[]=readInputArray();
    	System.out.println("INPUT AARAY"+ Arrays.toString(inputarray));
    	sort(inputarray);
    	System.out.println("Print the sorted Array" + Arrays.toString(inputarray));
    }
}

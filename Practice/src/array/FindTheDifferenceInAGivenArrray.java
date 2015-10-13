package array;

public class FindTheDifferenceInAGivenArrray {

public static void main(String[] args) {
	
	int diff=2;
	int a[]={1,2,3,4,5};
	
	for(int i=0;i<a.length;i++){
		for(int j=i+1;j<a.length;j++){
			
			if(a[j]-a[i]==diff){
				
				System.out.println("The difference is found");
			}
			
		}
	}
	System.out.println("No difference found");
}
}


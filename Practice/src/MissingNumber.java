
public class MissingNumber {


public static void main(String args[]){
	
	int [] a={2,3,1,5};
	int sum=0;
	int total=0;
	int n=0;
	for(int i=0; i<a.length;i++){
		
		sum=sum+a[i];
	}
	
	total=(a[a.length-1])*(a[a.length-1]+1)/2;
	System.out.println(total-sum);
}

}

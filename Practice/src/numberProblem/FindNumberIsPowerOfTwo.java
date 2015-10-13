package numberProblem;

public class FindNumberIsPowerOfTwo {

	public static void main(String args[]){
		
		int n=64; int a = 0;int count=1;
		for(int i=2;i<=64;i=i+2){
			
			if(n%i==0){
				a=count;
				count++;
				
				}
		
		}
		System.out.println("number is " + a + " Power of 2");
	}
}

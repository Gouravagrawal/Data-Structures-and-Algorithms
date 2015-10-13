package numberProblem;

public class ArmstrongNumber {

	public static void main(String args[]){
		
		int a=152;
		ArmstrongNumber arms =new ArmstrongNumber();
		arms.reverseNumber(a);
		}
	public void reverseNumber(int num){
		int n=0;int sum=0;int k=num;
		while(num!=0){
			 n=num%10;
			num=num/10;
			sum=sum+n*n*n;
		}
		if(sum==k){
			System.out.println("The number is an armstrong number");
		}
		else{
		System.out.println("Not an arsmtrong no");
	}
	}
}
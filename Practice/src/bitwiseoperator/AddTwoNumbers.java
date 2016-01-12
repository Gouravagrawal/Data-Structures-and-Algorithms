package bitwiseoperator;

public class AddTwoNumbers {

	public int convertDecimalToBinaray(int val){
		int k=val;
		StringBuffer sb=new StringBuffer();
		while((k/2)>=1){
		int d=k%2;
		sb.append(d);
		k=k/2;
		}
		sb.append(1);
		
		return Integer.parseInt(sb.toString());
	}
	
	public int sum(int a, int b){
		
		 while (b != 0){
	            int carry = (a & b) ; //CARRY is AND of two bits
	          System.out.println("CARRY IS "+ carry);
	            a = a ^b; //SUM of two bits is A XOR B
	            
	            System.out.println("XOR IS "+ a);
	          
	            b = carry << 1; //shifts carry to 1 bit to calculate sum
	            
	            System.out.println("VALUE IS "+ b);
	        }
	        return a;
		
	}
	public static void main (String args[]){
		int a=7;
		int b=5;
		AddTwoNumbers s=new AddTwoNumbers();

		System.out.println(s.sum(a,b));
	
	}
}

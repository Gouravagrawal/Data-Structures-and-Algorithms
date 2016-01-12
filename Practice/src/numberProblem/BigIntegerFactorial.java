package numberProblem;

import java.math.BigInteger;

public class BigIntegerFactorial {

    public static void main(String[] args) {
    	
    	check();
        calculateFactorial(50);
    }
    
    
    public static void check(){
    	char aa='a';
    	char bb='A';
    	int aaa=(int)aa;
    	int bbb=(int)bb;
    	
    	if(aa>bb){
    		System.out.println(aaa);
    		System.out.println(bbb);
    		System.out.println("True");
    	}
    	else{
    		System.out.println("false");
    	}
    }
    public static void calculateFactorial(int n) {
        
        BigInteger result = BigInteger.ONE;
        for (int i=1; i<=n; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        System.out.println(n + "! = " + result);
       
    }
    
}
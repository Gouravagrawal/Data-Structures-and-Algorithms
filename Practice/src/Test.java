/**
 * 
 * 1) Static class can be instantiated
 * 2) Static class cannot access not static member variable and method of the above class
 * 3) Static class can access the static member of the above class.
 *
 *//*
public class Test {

	int a=10;
	static int b=18;
	
	public String give(){
		
	 return "Hello";
	}
	
	public class TestStatic{
		
		public void getValue(){
			System.out.println("ram ram " + b);
		}
		
		
	}
	
	public static void main (String args[]){
		
		System.out.println();
		TestStatic tt=new TestStatic();
		tt.getValue();
		
		TestStatic.checkValue();
		
		
		
	}
}
*/
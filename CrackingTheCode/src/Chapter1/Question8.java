package Chapter1;

public class Question8 {

	
	public static boolean isSubtring(StringBuffer sb,String bb,String aa){
		
		boolean flag=false;
		
		if(aa.length()==bb.length()){
			if(sb.indexOf(bb)!=-1){
				flag=true;
			}			
		}
		else{
			System.out.println("String are not of equal length");
		}
		return flag;
	}
	
	public static void main (String args[]){
		
		String aa="waterbottle";
		String bb="ttlewaterbo";
		
		StringBuffer sb=new StringBuffer(aa+aa);
		System.out.println(isSubtring(sb,bb,aa));
	}
}

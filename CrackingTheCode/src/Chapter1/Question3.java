package Chapter1;
/**
 * Check if one string is permutation of other.
 * @author Gourav
 *
 */
public class Question3 {

	public static void main (String args[]){
		
		String a="aacb";
		String b="baca";
		
		StringBuffer sb1=new StringBuffer(a);
		StringBuffer sb2=new StringBuffer(b);
		
		if(a.length()!=b.length()){
			
			System.out.println("String are not the permutation");
		}
		
		else{
			for(int i=0;i<a.length();i++){
				char c=sb1.charAt(i);
				if(sb2!=null){
				int k=sb2.indexOf(""+c);
				if(k!=-1){
					sb2.deleteCharAt(k);
				}		
			
				else{
					System.out.println("Strings are not perm");
					System.exit(0);
				}
			}
			}
			System.out.println("Strings are perm");
		}
		
	}
}

package Chapter1;

public class Question5 {
	/*
	 * I have two pointers count and mark count is for counting repeated characters 
	 * mark is to point unique characters
	 */
	public static String compress(String s){
	    int count = 1;
	    int mark=0;
	    StringBuffer b = new StringBuffer();

	    for(int i = 1; i<s.length(); i++){
	        if(s.charAt(i)==s.charAt(i-1)&& i<s.length()-1){
	            count++;
	        }
	        else if(i==s.length()-1 && s.charAt(i)==s.charAt(i-1)){
	            count++;
	            b.append(s.charAt(mark));
	            b.append(count);
	            count=1;
	            mark=i;
	        }
	        else{
	            b.append(s.charAt(mark));
	            b.append(count);
	            count=1;
	            mark=i;
	        }
	    }
	return b.toString();
	}
	public static void main(String z[]){
	System.out.println(compress("aabbccaaa"));
	}

}

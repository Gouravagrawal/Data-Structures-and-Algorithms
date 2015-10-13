package string;

public class FindallThePermutationsOfString {

 
	 private static void permutation(String prefix, String str){
		 System.out.println(">>"+ prefix);
		 System.out.println("##"+str);
		 
	        int n = str.length();
	        if (n == 0) 
	            System.out.println(prefix);
	        else {
	            for (int i = 0; i < n; i++)
	            	//System.out.println(">>"+prefix + str.charAt(i));
	           // System.out.println("##"+str.substring(0, i) + str.substring(i+1));
	                permutation(prefix + str.charAt(i), str.substring(0, i) + str.substring(i+1));
	        }
	    }
	    public static void main(String[] args) {
	        permutation("", "gourav");
	    }

}

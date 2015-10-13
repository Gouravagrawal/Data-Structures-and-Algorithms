package string;

import java.util.Arrays;

public class RevereseUsingRecursion {

	 public static void main(String args[]) {
		 String str="Gourav agrawal age 21";
	        //recursive method to reverse String in Java
	        String reverseStr = reverseRecursively(str);
	        System.out.println("Reverse String in Java using Recursion: " + reverseStr);

	    }
	    public static String reverseRecursively(String str) {

	        //base case to handle one char string and empty string
	        if (str.length() < 2) {
	        	System.out.println("print the string>>>>" + str);
	            return str;
	        }
System.out.println(str.substring(1));
System.out.println(str.charAt(0));
System.out.println(str.substring(1)+ str.charAt(0));
System.out.println("...........................................");
	        return reverseRecursively(str.substring(1)) + str.charAt(0);

	    }
}
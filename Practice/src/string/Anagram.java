package string;

import java.util.Arrays;

public class Anagram {

		    public static void main(String[] args){
	    	String first="armmy",second="mcary";
	        char[] characters = first.toCharArray();
	        StringBuilder sbSecond = new StringBuilder(second);
	       
	        for(char ch : characters){
	            int index = sbSecond.indexOf(""+ch);
	            System.out.println(index +">>>" +  ch);
	            if(index != -1){
	                sbSecond.deleteCharAt(index);
	            }else{
	            	System.out.println("Strings are not anagram");
	                return;
	            }
	        }
	       
	       System.out.println("string are anagram");
	    }

}
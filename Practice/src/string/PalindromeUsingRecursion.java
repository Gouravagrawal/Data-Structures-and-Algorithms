package string;

import java.util.Scanner;

public class PalindromeUsingRecursion {

	public String compareElements(String s){
		if(s.charAt(0)==s.charAt(s.length()-1)){
			
			
	}
		return(s.substring(1, s.length()-1));
	}
	
	public static void main(String args[]){
			
		Scanner sc= new Scanner(System.in);
		String s=sc.next();		
		PalindromeUsingRecursion p=new PalindromeUsingRecursion();
		p.compareElements(s);
		
	}
}

package Chapter1;

import java.awt.SecondaryLoop;
/**
 * There can be 8-10 methods of reversing the string ...
 * StringBuffer has delete and append method it can be used to reverse a string
 * SB also has inbuilt reverse method
 * String has toCharArray() method which can be used to make it char array and then can reverse on by one.
 * and the list goes on....or different methods..
 * @author Gourav
 *
 */
public class Question2 {

	public static void main(String[] args) {
		String s= "gourav is good";
		StringBuffer sb=new StringBuffer(s);
		
		for(int i=s.length()-2;i>=0;i--){
			char a=sb.charAt(i);
			sb.deleteCharAt(i);
			sb.append(a);
		}

			System.out.println(sb);
	}

}

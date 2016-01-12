package string;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SeparateAllNumberFromString {

	public static void main(String[] args) {
		String s="gourav123agrawal 999.10.65.240 my name is 10.232.88.a 18/12 sapna is ";
		String aa = null;
		Matcher match =Pattern.compile("\\b\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}\\b").matcher(s);
		
		 while (match.find()) {
		         aa=match.group();
		  }		   		
		System.out.println(aa);
	}
}

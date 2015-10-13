package string;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SeparateAllNumberFromString {

	public static void main(String[] args) {
		String s="gourav123agrawal";
		String aa = null;
		Matcher match =Pattern.compile("[0-9]+").matcher(s);
		
		 while (match.find()) {
		         aa=match.group();
		  }		   		
		System.out.println(aa);
	}
}

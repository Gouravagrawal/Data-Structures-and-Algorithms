package oopsDesignQuestion.interfaceQuestion;

import java.util.HashSet;

public class InterfaceImplementation implements MyString{
	String string = null;
	
	public void setString(String s) {		
		this.string=s;		
	}

	public String getString() {
				return string;
	}

	public String getVowels() {
		String string = getString();

		HashSet<Character> hashSet = new HashSet<Character>();
		hashSet.add('a');
		hashSet.add('e');
		hashSet.add('i');
		hashSet.add('o');
		hashSet.add('u');
		StringBuffer sb = new StringBuffer();
		
		for (int i = 0; i < string.length(); i++) {
			if (hashSet.contains(string.charAt(i))) {
				sb.append(string.charAt(i));
			}
		}
		return sb.toString();
		
	}

	public int numberOfVowels() {
		
		String s=this.getVowels();
		return s.length();
	}

	public char getCharacter(int position) {
		
		return 0;
	}

	public void flipCaseInSubstring(int startPosition, int endPosition) {
		
		
	}

	public static void main(String args[]) {
		InterfaceImplementation aa = new InterfaceImplementation();
		aa.setString("gourav");

		System.out.println(aa.getVowels());
		System.out.println("No of Vowels : "+ aa.numberOfVowels());

	}
}

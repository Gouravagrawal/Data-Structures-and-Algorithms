package string;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

/*
 * By using the external data structure
 */
public class FindUniqueCharacters {

	HashMap<Character, Integer> hashMap = new HashMap<Character, Integer>();

	public void findCharacters(String st) {

		char[] charArray = st.toCharArray();
		System.out.println(Arrays.toString(charArray));

		for (int i = 0; i < charArray.length; i++) {
			int count = 1;
			if (hashMap.containsKey(charArray[i])) {

				int val = hashMap.get(charArray[i]);
				val++;
				hashMap.put(charArray[i], val);
			} else {
				hashMap.put(charArray[i], count);
			}
		}

		for (Character c : hashMap.keySet()) {

			System.out.println("The key is " + c + " The value is "
					+ hashMap.get(c));
		}
	}

	public static void main(String args[]) {
		String s;
		FindUniqueCharacters unichar = new FindUniqueCharacters();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String to check for unique Characters");
		s = sc.next();
		unichar.findCharacters(s);
	}

}

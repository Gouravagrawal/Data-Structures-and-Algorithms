package Chapter1;

import java.util.Arrays;

public class Question4 {

	public static void main(String args[]) {
		String a = "my name is";
		int count = 0;
		char aa[] = a.toCharArray();
		for (char d : aa) {
			if (d == ' ') {
				count++;
			}
		}
		int newLength = aa.length + 2 * count;
		char b[] = new char[newLength];
		for (int i = 0; i < newLength; i++) {
			if (i < 10) {
				b[i] = aa[i];
			} else {
				b[i] = ' ';
			}
		}

		for (int i = aa.length - 1; i >= 0; i--) {
			if (b[i] == ' ') {
				b[newLength - 1] = '0';
				b[newLength - 2] = '2';
				b[newLength - 3] = '%';
				newLength = newLength - 3;
			} else {
				b[newLength - 1] = b[i];
				newLength = newLength - 1;
			}
		}
		System.out.println(Arrays.toString(b));
	}
}

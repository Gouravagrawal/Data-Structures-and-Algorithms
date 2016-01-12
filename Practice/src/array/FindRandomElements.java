package array;

import java.util.Arrays;
import java.util.Random;

public class FindRandomElements {

	public static int[] findRandomElements(int k, int a[]) {
		int b[] = new int[k];
		Random random = new Random();
		int j = 0;
		while (j < k) {
			int e = random.nextInt(a.length);
			boolean flag = true;
			for (int i = 0; i < b.length; i++) {
				if (b[i] == a[e]) {
					flag = false;
				}
			}
			if (flag) {
				b[j] = a[e];
				j++;
			}

		}

		return b;

	}

	public static void main(String args[]) {
		int a[] = { 1, 2, 3, 4, 5, 6, 7 };
		int k = 3;
		int c[] = new int[k];

		c = findRandomElements(k, a);
		System.out.println(Arrays.toString(c));
	}
}

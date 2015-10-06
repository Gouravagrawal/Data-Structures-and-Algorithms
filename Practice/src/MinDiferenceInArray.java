public class MinDiferenceInArray {

	public static void main(String args[]) {

		int a[] = { 3, 1, 2, 4, 3 };
		int sum = 0;
		int Sum = 0;
		int Diff = 0;
		int diff = 0;
		int myInf = Integer.MAX_VALUE;
		for (int b = 0; b < a.length; b++) {

			sum = sum + a[b];
		}

		for (int b = a.length - 1; b > 0; b--) {
			Sum = Sum + a[b];
			System.out.println("SUm value is " + Sum);
			diff = Math.abs(Sum - sum);
			Diff = Math.abs(diff - Sum);
			System.out.println("Tha val of diff ae...  " + Diff);

			if (Diff < myInf) {
				myInf = Diff;
			}
		}
		System.out.println("Tha val of min DIff if  " + myInf);

	}
}

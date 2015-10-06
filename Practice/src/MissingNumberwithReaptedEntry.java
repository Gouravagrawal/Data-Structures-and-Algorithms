import java.util.Arrays;

public class MissingNumberwithReaptedEntry {

	int A[] = { 1, 4, 9, 5, 6, 1, 2, 3 };
	int count =0;
	int B[];

	public static void main(String args[]) {
		MissingNumberwithReaptedEntry mn = new MissingNumberwithReaptedEntry();
		mn.numbergenerator(mn.sort());		
	}

	public int sort() {
		for (int k = 0; k < A.length; k++) {
			for (int j = 0; j < A.length - 1; j++) {
				if (A[j] > A[j + 1]) {
					int x = 0;
					x = A[j + 1];
					A[j + 1] = A[j];
					A[j] = x;
				}
			}
		}
		return A[A.length - 1];
	}

	public void numbergenerator(int a) {
		for (int k = a; k >= 1; k--) {
			this.searchForMissingMinimum(k);
		}
		
		//System.out.println("B is "+ Arrays.toString(B));
	}

	public void searchForMissingMinimum(int Y) {
		for (int i = 0; i < A.length; i++) {
 
			if (A[i] == Y) {
				System.out.println("::::::::::::::"+ Y);
				// some issues just to check with the array B statemet rest all is perfect
				B[count]=Y;
				count++;
			}
			
			else{
				System.out.println("Missing no is "+ Y);
				//break;
			}
			//break;
		}
		//return Y;
	}
}

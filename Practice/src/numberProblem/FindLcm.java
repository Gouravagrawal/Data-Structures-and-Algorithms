package numberProblem;

public class FindLcm {

	public static void main(String args[]) {
		int a = 30;
		int b = 45;
		int lcm = 0;
		for (int i = a; i <= a * b; i=i+30) {
			if (i % a == 0 && i % b == 0) 
			{
				lcm = i;
				break; // exiting from the loop, as we don’t need anymore
						// checking after getting the LCM
			}
		}
		System.out.println("L.C.M. = " + lcm);
	}

}

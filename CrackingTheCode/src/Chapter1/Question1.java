package Chapter1;

/**
 * 
 * @author Gourav 1) check whether the length of the string is greater then 256
 *         if it is greater then obviously characters are repeated. 2)Remember
 *         you can ask if you are allowed to use an array or not...if he says
 *         not using extra data structure 3)if the size of array we are using is
 *         constant is independent of the no of input elements then its constant
 *         space or said o(1).
 * 
 * 
 */
public class Question1 {

	public static void main(String[] args) {
		String first = "ah";

		for (int i = 0; i < first.length(); i++) {
			if(i+1<first.length()){
	
				if (first.substring(i+1, first.length()).contains("" + first.charAt(i))) {

				System.out.println("Characters are repetittive");
				System.exit(0);
			}
		}
		}
		System.out.println("All are unique");

	}
}

package vector;

import java.util.Vector;
/**
 * Class to find the patterns/combinations of the vector of vectors containing strings
 * @author Gourav
 *
 */
public class VectorProblem {

	/**
	 * Recursive method to find the combinations of  the strings based on given condition
	 * @param vector is the vector containing strings
	 * @param new_str is passed as a new string after each iteration
	 * @param index to point to the specific element in the vector
	 */
	public static void generateStringPatterns(Vector<Vector<String>> vector, String new_str, int index) {
		/**
		 * This is the base condition where the recursion breaks and return the string
		 */
		if (index == vector.size()) {
			System.out.println(new_str);
			return;
		}

		for (int i = 0; i < vector.elementAt(index).size(); i++) {
			generateStringPatterns(vector, new_str + " " + vector.elementAt(index).get(i), index + 1);
		}
	}
/**
 * Static method to initialize the problem and vector
 * @param args
 */
	public static void main(String[] args) {

		/**
		 * Declaration of the vectors and here I have considered a vector containing three vectors but 
		 * the code is dynamic and will support even if either number of string in the vector or
		 * number of vector increases
		 */
		Vector<Vector<String>> vector = new Vector<Vector<String>>();
		Vector<String> vector1 = new Vector<String>();
		Vector<String> vector2 = new Vector<String>();
		Vector<String> vector3 = new Vector<String>();
		
		vector1.add("quick");
		vector1.add("lazy");
		vector2.add("brown");
		vector2.add("black");
		vector2.add("grey");
		vector3.add("fox");
		vector3.add("dog");

		vector.add(vector1);
		vector.add(vector2);
		vector.add(vector3);
		
		generateStringPatterns(vector, "", 0);

	}
}

package Chapter3;

import java.util.Stack;

public class Question6 {

	public void sortAStack(Stack<Integer> a, Stack<Integer> b) {

		b.push(a.pop());

		while (!a.isEmpty()) {
			int v = a.pop();
			int v1 = b.peek();
			if (v > v1) {
				b.push(v);
			} else {
				while (v < b.peek()) {
					a.push(b.pop());
				}
				b.push(v);
			}
		}
	}

	public static void main(String args[]) {
		Question6 q = new Question6();

		Stack<Integer> a = new Stack<Integer>();
		Stack<Integer> b = new Stack<Integer>();
		a.push(5);
		a.push(40);
		a.push(3);
		a.push(12);
		a.push(1);

		
		System.out.println("The given unsorted steck is A is ::");System.out.println(a.pop());System.out.println(a.pop());System.out.println(a.pop());System.out.println(a.pop());System.out.println(a.pop());
		a.push(5);a.push(40);a.push(3);	a.push(12);	a.push(1);q.sortAStack(a, b);
		
		
		System.out.println("The sorted steck is B is ::");	System.out.println(b.pop());System.out.println(b.pop());System.out.println(b.pop());System.out.println(b.pop());System.out.println(b.pop());

	}
}

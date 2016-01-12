package Chapter3;

import java.util.Stack;

public class Question5 {

	Stack<Integer> s1 = new Stack<Integer>();
	Stack<Integer> s2 = new Stack<Integer>();

	public void enqueue(int val) {
		s1.push(val);
	}

	public int dequeue() {
		while (!s1.isEmpty()) {
			s2.push(s1.pop());
		}
		int v = s2.pop();
		while (!s2.isEmpty()) {
			s1.push(s2.pop());
		}
		return v;
	}

	public static void main(String args[]) {
		Question5 q = new Question5();
		q.enqueue(1);
		q.enqueue(2);
		q.enqueue(3);
		q.enqueue(4);

		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		q.enqueue(8);
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
	}
}

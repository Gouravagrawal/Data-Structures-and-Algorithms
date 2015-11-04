package stack;

import java.util.Arrays;

public class StackUsingArray {

	private int stackSize;
	private static int[] st;
	private int top;

	public StackUsingArray(int size) {
		this.stackSize = size;
		st = new int[stackSize];
		top = -1;
	}

	public static void main(String args[]) {

		StackUsingArray sts = new StackUsingArray(5);
		sts.push(5);
		sts.push(4);
		sts.push(3);
		sts.push(2);
		sts.push(1);
		System.out.println("The stack is "+ Arrays.toString(st));
		sts.pop();
		sts.pop();
		sts.pop();
		sts.pop();
		sts.pop();
		sts.pop();
	}

	public void push(int n) {
		if (top + 1 == stackSize) {
			System.out.println("The stack is full");

		} else {
			top++;
			st[top] = n;
		}
	}

	public int pop() {
		if(isEmpty()){
			System.out.println("The stack is Empty");
		}
		int pop = st[top];
		top--;
		System.out.println("The pop element is " + pop);
		return pop;
	}

	public void peek() {
		int t = st[top];
		System.out.println("The peek element is " + t);
	}

	public boolean isEmpty() {

		if (top == -1) {
			return true;
		}
		return false;
	}
}
package Chapter3;

public class Question2 {

	Node head;
	int min;

	public class Node {

		int data;
		Node next;

		public Node(int data) {
			this.data = data;
		}
	}

	public void push(int val) {
		Node newNode = new Node(val);
		if (head == null) {
			head = newNode;
			head.next = null;
			min = val;
		} else {
			min = Math.min(min, val);
			newNode.next = head;
			head = newNode;
		}
	}

	public int pop() {

		Node temp = head;
		Node newHead = head.next;
		head = newHead;

		return temp.data;
	}

	public void printStack() {

		while (head != null) {
			System.out.println(head.data);

			head = head.next;
		}

	}

	public int getMinimum() {

		return min;
	}

	public static void main(String args[]) {
		Question2 q = new Question2();
		//q.push(5);
		q.push(51);
		q.push(15);
		q.push(75);
		q.push(12);
		q.push(6);
		

		// System.out.println("****Stack after pop ****");

	

		System.out.println("Minimum element is :: " + q.getMinimum());
		int a = q.pop();// System.out.println(q.pop());
		System.out.println("pop:"+a);
			q.printStack();
		 System.out.println("Minimum element is :: " + q.getMinimum());
	}
}

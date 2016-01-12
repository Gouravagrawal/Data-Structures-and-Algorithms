package Chapter2;

import Chapter2.Question3.Node;

public class Question4 {

	Node head;

	public class Node {

		Node next;
		int data;

		public Node(int val) {
			this.data = val;
		}
	}

	public void create(int val) {
		Node newNode = new Node(val);
		if (head == null) {
			head = newNode;
			head.next = null;
		} else {
			newNode.next = head;
			head = newNode;
		}
	}

	public void partitionAroundElement(int val) {

		Node orginalHead = head;
		Node h1 = null;
		Node h2 = null;
		
		while (head != null) {

			if (head.data < val) {
				Node n1 = new Node(head.data);
				if (h1 == null) {

					h1 = n1;
					h1.next = null;
										
				} else {
					n1.next = h1;
					h1 = n1;
				}
			}
			head = head.next;
		}
		
		head=orginalHead;
		
		while (head != null) {

			if (head.data > val) {
				Node n2 = new Node(head.data);
				if (h2 == null) {

					h2 = n2;
					h2.next = null;
				} else {
					n2.next = h2;
					h2 = n2;
				}
			}
			head = head.next;
		}
					printMergedList(h1,h2,val);
	}

	public static void printMergedList(Node h1,Node h2, int val) {
		while (h1 != null) {
			System.out.println(h1.data);
			h1 = h1.next;
		}
		
		System.out.println(val);
		while (h2 != null) {
			System.out.println(h2.data);
			h2 = h2.next;
		}
		
	}

	public static void main(String args[]) {

		Question4 q = new Question4();
		q.create(2);
		q.create(1);
		q.create(8);
		q.create(5);
		q.create(3);
		q.create(10);
		q.create(16);
		q.partitionAroundElement(5);

	}
}

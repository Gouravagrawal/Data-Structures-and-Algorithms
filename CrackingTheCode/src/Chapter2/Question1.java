package Chapter2;

import java.util.HashSet;

import javax.swing.text.html.HTMLDocument.RunElement;

public class Question1 {

	Node head;

	public class Node {

		Node next;
		int data;

		public Node(int val) {
			this.data = val;
		}
	}

	public void create(int val) {
		Node node = new Node(val);

		if (head == null) {
			head = node;
			head.next = null;
		} else {
			node.next = head;
			head = node;
		}
	}

	public void printlist() {

		while (head != null) {
			System.out.println(head.data);
			head = head.next;
		}
	}
/**
 * Method one using extra buffer or hashSet complexity are On and On
 */
	public void removeDuplicatesUsingHashSet() {

		HashSet<Integer> hs = new HashSet<Integer>();
		Node previous = null;
		while (head != null) {

			if (hs.contains(head.data)) {
				previous.next = head.next;

			} else {
				hs.add(head.data);
				previous = head;
				System.out.println(head.data);
			}
			head = head.next;
		}

	}

	public static void printListAfterRemoval(Node head) {

		while (head != null) {
			System.out.println(head.data);
			head = head.next;
		}

	}
/**
 * Metod 2nd without using extra buffer so ..the time complexity here is On^2 and space is constant or O1
 */
	public void removeDuplicatesWithoutUsingBuffer() {
		Node current = head;

		while (current != null) {
			Node runner = current;

			while (runner.next != null) {
				if (runner.next.data == current.data) {
					runner.next = runner.next.next;
				} else {
					runner = runner.next;
				}
			}
			System.out.println(current.data);
			current = current.next;
		}
	}

	public static void main(String args[]) {
		Question1 q = new Question1();
		q.create(1);
		q.create(4);
		q.create(2);
		q.create(1);
		q.create(6);
		q.create(4);
		q.create(1);
		// q.printlist();
		// q.removeDuplicatesUsingHashSet();
		q.removeDuplicatesWithoutUsingBuffer();
		// q.printlist();
	}
}

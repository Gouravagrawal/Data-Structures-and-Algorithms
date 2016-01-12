package Chapter2;

import Chapter2.Question4.Node;

public class Question7 {

	Node head;
	Node endPointer;

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

	

	public void printList() {
		while (head != null) {
			System.out.println(head.data);
			head = head.next;
		}
	}

	
	public boolean checkPallindrome() {

		 if(head == null)
		        return true;
		 
		    Node p = head;
		   Node prev = new Node(head.data);
		 
		    while(p.next != null){
		        Node temp = new Node(p.next.data);
		        temp.next = prev;
		        prev = temp;
		        p = p.next;
		    }
		 
		    Node p1 = head;
		    Node p2 = prev;
		 
		    while(p1!=null){
		        if(p1.data != p2.data)
		            return false;
		 
		        p1 = p1.next;
		        p2 = p2.next;
		    }
		 
		    return true;

	}

	public static void main(String args[]) {
		Question7 q = new Question7();
		    q.create(1);
	        q.create(2);
	        q.create(3);
	        q.create(3);
	        q.create(2);
	        q.create(1);
		
		System.out.println("Check for pallindrome :"+ q.checkPallindrome());
	}
}

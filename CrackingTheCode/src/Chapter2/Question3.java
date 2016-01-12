package Chapter2;

public class Question3 {
	Node head;
	
	public class Node {
		
		Node next;
		int data;
		
		public Node(int val){
			this.data=val;
		}
	}
	
	
	/**
	 * This is another good way to delete an element in which instead changing reference from previous to next
	 * we can just copy the data of next node to current(or to be deleted ) and then can delete the node next to current,
	 * @param n
	 */
	public static void delMidElementWithoutAccessToHead(Node n){		
		
		Node temp=n.next;
		n.data=temp.data;
		n.next=n.next.next;
	}
	
	public static void main(String args[]){
		Node n=null;
		
		delMidElementWithoutAccessToHead(n);
		
		
	}
}

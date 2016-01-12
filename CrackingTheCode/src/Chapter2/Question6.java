package Chapter2;

public class Question6 {
	
	Node head;
	
	public class Node{
		int data;
		Node next;
		
		public Node(int data){
			this.data=data;
		}
	}

	public void create(int data,Node h){
		Node newNode=new Node(data);
		if(head==null){
			head=newNode;
			head.next=null;
		}
		
		else{
			newNode.next=head;
			head=newNode;
		}
		h1=h;
	}
	public void printList() {
		while (head != null) {
			System.out.println(head.data);
			head = head.next;
		}
	}
	
	public static void main(String args[]) {
		Node h1;Node h2;
		Question6 q = new Question6();
		    q.create(6,h1);
	        q.create(1,h1);
	        q.create(7,h1);
	        
	        q.create(3);
	        q.create(2);
	        q.create(1);
		
		
	}
}

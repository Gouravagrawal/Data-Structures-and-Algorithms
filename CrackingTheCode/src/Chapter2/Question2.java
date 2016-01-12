package Chapter2;

public class Question2 {

	Node head;
	
	public class Node {
		
		Node next;
		int data;
		
		public Node(int val){
			this.data=val;
		}
	}
	
	public void create(int val){		
		Node newNode=new Node(val);		
		if(head==null){
			head=newNode;
			head.next=null;
		}		
		else{
			newNode.next=head;
			head=newNode;
		}		
	}
	/**
	 * Without knowing the length of the Linked List
	 * @param val
	 */
	public void findKthFromLast(int val){
		
		Node t2=head;
		Node t1=head;
		Node t3=null;
		
		for(int i=1;i<val;i++){			
			 t2=t2.next;
		}
			
		while(t2.next!=null){
		    t3=t1;
		    t1=t1.next;
			t2=t2.next;			
		}
		
		System.out.println(t3.data);
		
	}
	
	public static void main(String args[]){
		
		Question2 q=new Question2();
		q.create(1);q.create(2);q.create(3);q.create(4);q.create(5);q.create(6);
		q.findKthFromLast(3);
	}
	
}

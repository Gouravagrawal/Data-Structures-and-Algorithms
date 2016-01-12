package Chapter2;



public class Question5 {
	//Node h1; Node h2; Node h; Node head;
	
 public class Node {
		
		Node next;
		int data;
		
		public Node(int val){
			this.data=val;
		}
	}
	
	public void create(int val, Node h1,Node head){		
		Node newNode=new Node(val);		
		
		head=h1;
		
		if(head==null){
			head=newNode;
			head.next=null;
		}		
		else{
			newNode.next=head;
			head=newNode;
		}		
	}
	
	public void sumOfTwoLinkedList(){
		
	
	}
	
	public static void main(String args[]){
		Node h1=null; Node h2=null; Node h=null; Node head = null;
		Question5 q=new Question5();
		q.create(6,h1,head);q.create(1,h1,head);q.create(7,h1,head);
		//q.create(2,h2,head);q.create(9,h2,head);q.create(5,h2,head);
		
		q.sumOfTwoLinkedList();
	}
}

package linkedList;

public class ReverseALinkedList {

	Node head;
	Node tail;
	
	public ReverseALinkedList(){
		head=null;
		tail=null;
	}
	
	public void insert(int n){
		
		
		Node newNode1=new Node(n);
		newNode1.next = null;
		if(head==null){
			head=newNode1;
			tail=newNode1;
			tail.next=null;

		}
		
		else{
			
			newNode1.next=head;
			head=newNode1;
		}
		
	}
	
	public void printLinkedList(){
		
		while(head!=null)
		{
			System.out.println(head.data);
			head=head.next;
		}
		
	}
	
	public void reverseALinkedList(){
		
		Node temp;
		Node previous = null;
		while(head!=null){
			temp = head.next;
			head.next = previous;
			previous = head;
			head = temp;
		}
		head = previous;
		printLinkedList();
	}
	
	public static void main (String args[]){
		
		ReverseALinkedList r=new ReverseALinkedList();
	
		r.insert(5);
		r.insert(4);
		r.insert(3);
		r.insert(2);
		r.insert(1);
		

		System.out.println("*************");
    	r.reverseALinkedList();
		r.printLinkedList();
	}

	public class Node{
		
		Node next;
		int data;
		
		public Node(int val){
			data=val;
		}
	}
}

package linkedList;

public class LinkedListRevise {

	/*
	 * Insertion method 
	 */
	public class Node{
		
		int data;		
		Node next;
	}
	Node head=null;
	
	public void create(int value){
		Node newNode=new Node(); 
		newNode.data=value;
		
		if(head==null){
			head=newNode;
			head.next=null;
		}
		
		else{
			newNode.next=head;
			head=newNode;
		}				
	}
	
	
	
	public void insertIntoSpecifiedINdex(int index, int val){
		Node temp=head;
		
		while((temp).data!=index){
			temp=temp.next;
		}
		Node n=new Node();
		n.data=val;
		Node x=temp.next;
		temp.next=n;
		n.next=x;
	}
	
	/*public void insertAtTail(int val){
		Node tempHead=head;
		Node temp=new Node();
		while(tempHead.next!=null){
			tempHead=tempHead.next;
		}
		temp.data=val;
		tempHead.next=temp;		
		temp.next=null;
		tempHead=tail=temp;
	}*/
	
	/*
	 * Deletion operation methods
	 */
	public void deleteHead(){
		head=head.next;
	}
	
	/*public void deleteTail(){
		Node temp=head;
		while(temp.next.next!=null){
			temp=temp.next;
		}
		temp.next=null;
		tail=temp.next;
	}*/
	
	public void deleteAtIndex(int val){
		Node newNode=new Node();
		newNode.data=val;
		Node temp=head;
		while(temp.next.data!=val){
			temp=temp.next;
		}
		temp.next=temp.next.next;
	}
	public void printList(){
			
		while(head!=null){
			System.out.println(head.data);
			head = head.next;
		}
		
	}
	public static void main (String args[]){
			LinkedListRevise lr=new LinkedListRevise();
			lr.create(5);
			lr.create(10);
			lr.create(15);
			lr.create(4);
			lr.create(49);
			lr.create(40);
			lr.create(141);
		//	lr.insertIntoSpecifiedINdex(15,20);
			//lr.insertAtTail(60);
			//lr.deleteHead();
		//	lr.deleteTail();
		//	lr.deleteAtIndex(49);
			lr.printList();
			//
	}
}

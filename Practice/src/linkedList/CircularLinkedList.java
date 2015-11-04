package linkedList;

import linkedList.LinkedListRevise.Node;


public class CircularLinkedList {

	private Node head=null;
	private Node tail;
	
	private class Node{
		Node next;
		int data;
		
		public Node(int data) {
			
			this.data = data;
		}
		public Node() {
			
			
		}
	
			
		
		
	}
	public static void main(String[] args) {
		
		CircularLinkedList dd=new CircularLinkedList();
		//dd.create();
		
		
		System.out.println("The given linked list has looop : " + dd.checkWhetherLinkedListisCircular());
	}
	
	


public void create(Node value){
	Node newNode=new Node(); 
	newNode=value;
	
	if(head==null){
		head=newNode;
		tail.next=head;
	}
	
	else{
		newNode.next=head;
		head=newNode;
	}				
}

	
	public boolean checkWhetherLinkedListisCircular(){
		
		Node slow=head.next;
		Node fast=head.next.next;
		
		while(slow!=null&& fast!=null){
			slow=slow.next;
			fast=fast.next;
			
			if(slow==fast){
				
				return true;
			}
		}
		
		return false;
		
	}
	}
package linkedList;

public class MergeTwoSortedLinkedList {
	Node head=null;
	
	private class Node{		
		Node next;
		int data;		
		public Node(int a){
			this.data=a;			
		}	
	}
	
	public void create(int a){		
		Node newNode=new Node(a);
		if(head==null){
			head=newNode;		
			head.next=null;
		}
		else{
		newNode.next=head;	
		head=newNode;
		}
	}
	
	public  void display(MergeTwoSortedLinkedList ml){	
		Node head=ml.head;
		while(head!=null){
			System.out.println(head.data);
			head=head.next;
		}		
	}
	
	public static  void displayMerged(Node head){		
		while(head!=null){
			System.out.println(head.data);
			head=head.next;
		}		
	}
	
	public static void reverseLinkedList(MergeTwoSortedLinkedList ml){
		Node head=ml.head;
		Node previous=null;
		while(head.next!=null){
			Node temp=head;
			
			temp.next=previous;
			previous=temp;
			head=head.next;
			
		
		}
		
		
		
	}
	public static void main(String args[]){		
		MergeTwoSortedLinkedList ml=new MergeTwoSortedLinkedList();
		MergeTwoSortedLinkedList m2=new MergeTwoSortedLinkedList();
		/*ml.create(17); 
		ml.create(10)*/
		ml.create(5);
		ml.create(4);
		ml.create(3);
		ml.create(2);
		ml.create(1);
		
				
		m2.create(6);
		m2.create(5);
		m2.create(4);
		m2.create(2);
		
	 reverseLinkedList(ml);
		ml.display(ml);
		//Node head=mergeList(ml,m2);
		//displayMerged(head);
		
	}
	
	public static Node mergeList(MergeTwoSortedLinkedList ml,MergeTwoSortedLinkedList m2){
		Node head1=ml.head; 
		Node head2=m2.head;
		Node temp1=null;
		Node temp2=null;
		Node start=null;
		boolean flag=true;
		Node result = null;
		if(head1.data<head2.data)
		{
			result = head1;
		}
		else
		{
			result = head2;
		}
		while(head1.next!=null && head2.next!=null){
			if(head1.data<head2.data){
			if(Math.abs(head1.data-head1.next.data)<Math.abs(head1.data-head2.data)){				
				head1=head1.next;
			}
					
			else{
				temp1=head1.next;
				head1.next=head2;				
				head1=temp1;
 			}
			}
			
			else{
				if(Math.abs(head2.data-head2.next.data)<Math.abs(head2.data-head1.data)){				
					head2=head2.next;
				}
						
				else{
					temp2=head2.next;
					head2.next=head1;				
					head2=temp2;
	 			}
				
			}
		}
		
		if(head1==null){
			
			 head1=head2.next;
	
		}
		
		 if(head2==null){
			
			head2=head1.next;
		
		}
		//
		return result;
		
	}
	
}

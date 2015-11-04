package queue;

import java.util.Arrays;

public class QueueUsingArray {

	private int rear;
	private int front;
	private static int[] queue;
	private int size;
	
	public QueueUsingArray(int size){
		this.size=size;
		rear=front=-1;
		queue=new int[size];
	}
	
	public static void main (String args[]){
		
		QueueUsingArray qa=new QueueUsingArray(5);
		qa.enqueue(5);
		qa.enqueue(4);
		qa.enqueue(3);
		qa.enqueue(2);
		qa.enqueue(1);
		System.out.println("The queue is "+ Arrays.toString(queue));
	}
	
	public void enqueue(int n){
		if(rear==size+1){
			System.out.println("The queue is full");
		}
		else if(isEmpty()){
			rear=front=0;
			queue[rear]=n;
		}
		else{
			rear++;
			queue[rear]=n;
		}
	}
	
	public boolean isEmpty(){
		if(front==-1&&rear==-1){			
			return true;
		}
		return false;
	}
	
	public void dequeue(){
		
		if(isEmpty()){
			rear=front=0;
			System.out.println("The queue is empty");
		}
		else{
			front++;
		}
	}
}

package queue;

import java.util.Arrays;
/**
 * 
 * @author Gourav
 *here there are 3 conditions which should be taken care while enqueue and 3 conditions while dequeue
 * 
 */
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
		QueueUsingArray qa1=new QueueUsingArray(5);
		
		qa.enqueue(5);
		qa.enqueue(4);
		qa.enqueue(3);
		qa.enqueue(2);
		qa.enqueue(1);
		System.out.println("The queue is "+ Arrays.toString(queue));
		
		qa.createStackUsingTwoQueue(qa,qa1);
	}
	/**
	 * 
	 * @param n
	 * 1st --- if queue is full 
	 * 2nd --- if queue is empty
	 * 3rd --- if queue is neither full nor empty
	 */
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
	/**
	 * 1st -- if queue is empty
	 * 2nd -- if it has only one element 
	 * 3rd ---if it is many elements or more then one element
	 */
	public int dequeue(){
		int val=0;
		if(isEmpty()){
			rear=front=0;
			System.out.println("The queue is empty");
		}
		else if(front==rear){
			val=queue[front];
			front=-1;
			rear=-1;
		}
		else{
			val=queue[front];
			front++;
		}
		
		return val;
	}
	
	public void createStackUsingTwoQueue(QueueUsingArray qa,QueueUsingArray qa1){
		while(qa.front!=-1&&qa.rear!=-1){
			
		while(qa.front!=-1&&qa.rear!=-1&&qa.front!=qa.rear ){
			qa1.enqueue(qa.dequeue());
		}
		System.out.println(qa.dequeue());
		qa=qa1;
		
		}
		
	}
}

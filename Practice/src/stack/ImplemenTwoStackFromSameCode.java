/*package stack;


public class ImplemenTwoStackFromSameCode {

	int top;
	int size;
	
	
	public ImplemenTwoStackFromSameCode(int size) {

		top = -1;
		this.size = size;
		a = new int[size];
		b=new int[size];
	}

	public void push(int[] array,int v){

		if (!isFull()) {
			array[++top] = v;
		}
	}

	public int pop() {

		int val = a[top];
		top--;
		return val;

	}

	public boolean isEmpty() {
		if (top == -1) {
			return true;
		}
		return false;
	}

	public boolean isFull() {

		if (top+1 == size) {
			return true;
		}
		return false;
	}

	public int peek() {
		return a[top];
	}

	
	
	public static void main(String args[]) {
		ImplemenTwoStackFromSameCode q=new ImplemenTwoStackFromSameCode(5);
		int a[];
		int b[];
		
	q.push(a,5);q.push(a,40);q.push(a,3);q.push(a,12);q.push(a,1);
	
	
		

	}
}
*/
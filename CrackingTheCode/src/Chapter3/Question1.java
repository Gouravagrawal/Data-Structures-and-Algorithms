package Chapter3;

public class Question1 {
	static int a[] ;
	int top1 = -1;	
	int top2 = 5;
	int top3 = 8;

	public void push(int stackNumber, int i) {
		if (stackNumber == 1) {
			if (!isStackOneFull()) {
                a[++top1]=i;
			}
			else{
				System.out.println("Stack 1 is full");
			}
		} else if (stackNumber == 2) {
			if (!isStackOneFull()) {
				a[++top2]=i;
			}
			else{
				System.out.println("Stack 2 is full");
			}
		} else if (stackNumber == 3) {
			if (!isStackOneFull()) {
				a[--top3]=i;
			}
			else{
				System.out.println("Stack 3 is full");
			}
		}
	}

	public boolean isStackOneFull() {
		if (top1 + 1 == top2) {

			return true;
		}
		return false;
	}

	public boolean isStackTwoFull() {
		if (top2 + 2 == top3) {

			return true;
		}
		return false;

	}

	public boolean isStackThreeFull() {
		if (top2 + 2 == top3) {

			return true;
		}
		return false;

	}
	public boolean firstIsEmpty(){
		if(top1==-1){
			return true;
		}
		return false;
	}
	
	public boolean secondIsEmpty(){
		if(top2==5){
			return true;
		}
		return false;
	}
	
	public boolean thirdIsEmpty(){
		if(top3==8){
			return true;
		}
		return false;
	}
public int popFirstStack(){
	if(!firstIsEmpty()){
		return a[top1--];
	}
	else{
		System.out.println("Stack 1 is empty");
		return -1;
	}
}
public int popSecondStack(){
	if(!secondIsEmpty()){
		return a[top2--];
	}
	else{
		System.out.println("Stack 2 is empty");
		return -1;
	}
}
public int popThirdStack(){
	if(!thirdIsEmpty()){
		return a[top3++];
	}
	else{
		System.out.println("Stack 3 is empty");
		return -1;
	}
}
	public static void main(String args[]) {

		a = new int[8];
		// int stackno=0;
		Question1 q = new Question1();
		q.push(1, 1);		
		q.push(3, 3);
		q.push(1, 42);
		q.push(1, 35);
		q.push(3, 6);
		q.push(1, 70);
		q.push(2, 12);
		q.push(1, 40);
		
		System.out.println("Stack first is ::");
		System.out.println(q.popFirstStack()+" , " + q.popFirstStack()+" , " + q.popFirstStack()	
		+" , " + q.popFirstStack()+" , " + q.popFirstStack());
		
		System.out.println("Stack Two is ::");
		System.out.println(q.popSecondStack());
		
		System.out.println("Stack Three is ::");
		System.out.println(q.popThirdStack()+" , "+ q.popThirdStack());
	}

}

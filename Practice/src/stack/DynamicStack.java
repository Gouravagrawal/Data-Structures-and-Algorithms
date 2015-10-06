package stack;

import java.util.Arrays;

public class DynamicStack {
	int size;
	int[] st;
	int top=-1;
public DynamicStack (int size){
	this.size=size;
	st=new int[size];
}

public boolean stackIsFull(){
	if(top+1==size){
		
		return true;
	}
	return false;
}

public void push(int a){
	
	if(stackIsFull()){
		
		System.out.println("The stack is full");
		extendStack(a);
	}
	else{
		
		st[++top]=a;
	}
}

public void extendStack(int a){
	
	size=size*2;
	int[] stc=new int[size];
	for(int i=0;i<st.length;i++){
		
		stc[i]=st[i];
	}
	st=new int[size];
	st=stc;
	push(a);
	
	System.out.println("The stack finally is " + Arrays.toString(st));
}

public static void main(String args[]){
	
	DynamicStack ds=new DynamicStack(5);
	ds.push(3);
	ds.push(4);
	ds.push(5);
	ds.push(6);
	ds.push(7);
	ds.push(8);
	
	
}


}

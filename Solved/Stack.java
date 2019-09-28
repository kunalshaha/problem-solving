package test;


public class Stack {	
	
	private Object[] array = new Object[10];
	private int top;

	public Stack() {
		this.top = -1;
	}

	// missing empty checks
	
	public Object pop() {
		if(top == -1) {
			System.out.println("No element to pop");
		}
		return array[top--];
	}

	//check for the whether stack is full
	public Object push(Object ele) {
		if(top == 10) {
			System.out.println("Stack Full");
		}
		return array[top++] = ele;
	}
	
	
	//1. Method commenting
	//2. variable  names
	//3.
}

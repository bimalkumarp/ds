package com.java.stack;

class MinimumElementStack {
	
	Stack<Integer> stack = new Stack<Integer>();
	Stack<Integer> minStack = new Stack<Integer>();

	public void push(int data) throws StackUnderFlowException, StackOverFlowException {
		int min=data;
		if(!minStack.isEmpty()){
			if(min>minStack.peek()){
				min=minStack.peek();
			}
		}
		stack.push(data);
		minStack.push(min);
	}

	public int pop() throws StackUnderFlowException {
		minStack.pop();
		return stack.pop();
		
	}

	public int getMinimum() throws StackUnderFlowException {
		return minStack.peek();
	}

}

public class MinimumElementStackTester{
	public static void main(String[] args) throws StackUnderFlowException, StackOverFlowException {
		MinimumElementStack stack=new MinimumElementStack();
		stack.push(1);
		System.out.println("Minimum element is :" +stack.getMinimum());//1
		stack.push(2);
		System.out.println("Minimum element is :" +stack.getMinimum());//1
		stack.push(3);
		System.out.println("Minimum element is :" +stack.getMinimum());//1
		stack.push(4);
		System.out.println("Minimum element is :" +stack.getMinimum());//1
		 
		stack.push(0);
		System.out.println("Minimum element is :" +stack.getMinimum());//0
		
		stack.pop();
		System.out.println("Minimum element is :" +stack.getMinimum());//1

		stack.pop();
		System.out.println("Minimum element is :" +stack.getMinimum());//1

		stack.pop();
		System.out.println("Minimum element is :" +stack.getMinimum());//1


		
	}
}


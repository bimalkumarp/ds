package com.java.stack;

public class Stack<T> {
	
	private Element<T> top;
	private int MAX_SIZE=5;
	private int CURR_SIZE=0;
	
	public void push(T data) throws StackOverFlowException{
		if(isFull()){
			throw new StackOverFlowException();
		}
		if(top==null){
			Element<T> e1=new Element<T>();
			e1.setData(data);
			top=e1;
		}
		else{
			
				Element<T> e2= new Element<T>();
				e2.setData(data);
				e2.setNext(top);
				top=e2;
				
			}
		CURR_SIZE++;
		
	}
	
	public T pop() throws StackUnderFlowException{
		if(isEmpty()){
			throw new StackUnderFlowException();
		}
		T data = top.getData();
		top=top.getNext();
		CURR_SIZE--;
		return data;
	}
	
	public T peek() throws StackUnderFlowException{
		if(isEmpty()){
			throw new StackUnderFlowException();
		}
		T data = top.getData();
		return data;
	}
	
	public boolean isEmpty(){
		if(CURR_SIZE==0)
		return true;
		else
			return false;
	}
	
	public boolean isFull(){
		if(CURR_SIZE>=MAX_SIZE)
			return true;
		else
			return false;
	}
	
	public void printElements(){
		Element<T> curr_element=top;
		while(curr_element!=null){
			System.out.println(curr_element.getData());
			curr_element=curr_element.getNext();
		}
		
	}
	
	

	

}

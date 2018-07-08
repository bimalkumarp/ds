package com.java.stack;

public class StackUnderFlowException extends Exception {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public StackUnderFlowException(){
		super("Stack is empty!!...");
	}

}

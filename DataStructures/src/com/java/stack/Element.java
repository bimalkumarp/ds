package com.java.stack;

public class Element<T> {

	private T data;
	private Element<T> next;

	public T getData() {
		return data;
	}
	public void setData(T data) {
		this.data = data;
	}
	public Element<T> getNext() {
		return next;
	}
	public void setNext(Element<T> next) {
		this.next = next;
	}
	
	@Override
	public String toString() {
		return "Element [data=" + data + ", next=" + next + "]";
	}
	
	
}

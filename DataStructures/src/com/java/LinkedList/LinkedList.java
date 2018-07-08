package com.java.LinkedList;

public class LinkedList<T> {

	Node<T> head;
	int count = 0;

	public LinkedList(T data) {
		head = new Node<T>(data);
		count++;
	}

	public void add(T data) {
		Node<T> node = new Node<T>(data);
		node.next = head;
		head = node;
		count++;
	}

	public void add(Node<T> node) {

		node.next = head;
		head = node;
		count++;
	}

	public int size() {
		return count;
	}

	public void printElements() {
		Node<T> current = head;
		while (current != null) {
			System.out.println(current.data);
			current = current.next;
		}
	}

	public T findmiddleOfLinkedLIst() {

		Node<T> current = head;
		Node<T> main = head;

		while (current != null && current.next != null) {
			current = current.next.next;
			main = main.next;
		}
		return main.data;

	}

	public boolean detectCycle() {

		Node<T> slow = head;
		Node<T> fast = head;

		while (fast != null && fast.next != null && slow != null) {
			fast = fast.next.next;
			slow = slow.next;

			if (fast == slow)
				return true;
		}
		return false;

	}

	public T findElementFromLast(int pos) {
		Node<T> current1 = head;
		Node<T> main = head;

		while (current1 != null) {
			if (pos > 0) {
				current1 = current1.next;
				pos--;

			} else {
				current1 = current1.next;
				main = main.next;
			}

		}
		
		return main.data;

	}
	
	public void reverseLinkedList(){
		
		Node<T> current=head;
		Node<T> prev=null;
		
		while(current.next!=null){
			head=current.next;
			current.next=prev;
			prev=current;
			current=head;
		}
		
		current.next=prev;
	
		
		
	}

}

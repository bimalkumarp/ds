package com.java.LinkedList;

public class LinkedListTester {
	public static void main(String[] args) {
		LinkedList<Integer> ll = new LinkedList<Integer>(12);
		ll.add(11);
		ll.add(10);
		ll.add(9);
		ll.add(8);
		ll.add(7);
		ll.add(6);
		ll.add(5);
		
		
		//ll.head.next.next=ll.head;
		System.out.println("Size:  "+ll.size());
		ll.printElements();
		ll.reverseLinkedList();
		System.out.println("Size:  "+ll.size());
		ll.printElements();
		
		//System.out.println(ll.findmiddleOfLinkedLIst());
		//System.out.println(ll.detectCycle());
	//	System.out.println(ll.findElementFromLast(5));
	}
	
	
	
}

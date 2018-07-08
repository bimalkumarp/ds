package com.java.designpatterns;

public class Singleton {

	private static volatile Singleton instance;
	private static final Object lock = new Object();

	private Singleton() {
	}

	public static Singleton getInstance() {
		Singleton result = instance;// just copying the instance for checking
		
		if (result == null) {
				synchronized (lock) {
					result = instance;
					if (result == null)
						instance = result = new Singleton();
				}
		}
		
		return result;
	}
	
	
	
}

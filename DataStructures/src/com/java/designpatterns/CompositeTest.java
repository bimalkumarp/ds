package com.java.designpatterns;

import java.util.ArrayList;
import java.util.List;

public class CompositeTest {
	public static void main(String[] args) {
	
		Component mouse=new Leaf("mouse",200);
		Component keyboard=new Leaf("keyboard",1200);
		Component monitor=new Leaf("monitor",10000);
		
		Component cpu=new Leaf("cpu",20000);
		Component harddisk=new Leaf("harddisk",2000);
		
		Composite ph=new Composite("peri");
		Composite cabinet=new Composite("peri");
		Composite computer=new Composite("computer");
		 
		ph.addComponent(mouse);
		ph.addComponent(keyboard);
		ph.addComponent(monitor);
		
		cabinet.addComponent(harddisk);
		cabinet.addComponent(cpu);
		
		computer.addComponent(cabinet);
		computer.addComponent(ph);
		cpu.showPrice();
		computer.showPrice();
	}
}

interface Component {
	void showPrice();
}

class Leaf implements Component {
	String name;
	int price;

	public Leaf(String name, int price) {
		this.name = name;
		this.price = price;
	}

	@Override
	public void showPrice() {
		System.out.println("name :" + name + "-price :" + price);
	}
}

class Composite implements Component {
	String name;
	List<Component> components = new ArrayList<>();

	
	public Composite(String name) {
		this.name = name;
	}

	@Override
	public void showPrice() {

		 
		for (Component comp : components) {
			comp.showPrice();
		}
	}

	public void addComponent(Component comp) {
		components.add(comp);
	}

}

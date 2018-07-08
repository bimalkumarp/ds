package com.java.designpatterns;

public class Adapter {
	public static void main(String[] args) {
		AssignmentWork assignmentWork=new AssignmentWork();
		assignmentWork.setP(new penAdapter());
		assignmentWork.writeassignment("Testing");
	}
	
}



interface Pen{
	void write(String str);
	
}
class AssignmentWork{
	
	 public Pen getP() {
		return p;
	}
	public void setP(Pen p) {
		this.p = p;
	}
	Pen p;
	 public void writeassignment(String str){
		 p.write(str);
	 }
	
}

class PilotPen{
	
	public void fastwrite(String str){
		System.out.println("Super fast writing!!!"+str);
		
	}
}

class penAdapter implements Pen{
PilotPen p=new PilotPen();
	@Override
	public void write(String str) {
		p.fastwrite(str); 
		
	}
	
}
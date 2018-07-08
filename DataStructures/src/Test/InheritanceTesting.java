package Test;

class Parent1{
	//int id;
	
	public Parent1(){
		System.out.println("Insside Parent class Constructor");
	}
	/*public Parent1(int id){
		System.out.println("Insside Parent class parameterized Constructor");
		this.id=id;
	}*/
	
}


class Child extends Parent1{
	int id;
	public Child(){
		
		System.out.println("Inside child default constructor");
	}
	public Child(int id){
		//super(20);
		this.id=id;
		System.out.println("Inside child Parametrized constructor");
	}
	
}

public class InheritanceTesting {

	public static void main(String[] args) {
		 
      Parent1 child=new Child(30);
     System.out.println(child.id); 
	}

}

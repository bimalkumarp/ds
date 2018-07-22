package Test;

public class Test2 {

	int x=12;
	
	
	public void method1(String str){
		System.out.println("Inside str");
	}
	public void method1(Object str){
		System.out.println("Inside Obj");
	}
	
	public void method1(Character str){
		System.out.println("Inside char");
	}
	public static void main(String[] args) {
		Test2 t2=new Test2(5);
		 t2.method1('c'); //12
	}
	
	
	public Test2(int x){
		this.x+=x;
		System.out.println(x); //10
	}
	
	
}

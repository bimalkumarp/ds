package Test;

public class Test2 {

	int x=12;
	
	
	public static void main(String[] args) {
		Test2 t2=new Test2(5);
		System.out.println("in main" + t2.x); //12
	}
	
	
	public Test2(int x){
		this.x+=x;
		System.out.println(x); //10
	}
	
	
}

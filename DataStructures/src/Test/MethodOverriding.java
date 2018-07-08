package Test;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;


class Parent {
	public  String myshoe="Parent";;
	static void method1(Object str) {
		System.out.println("String :" + str);
	}
}

public class MethodOverriding extends Parent{
	
	public  String myshoe="Child";
	
	public MethodOverriding(){
		 
	}
	
	
	
	void method1(String c){
		java.sql.Connection conn;
		
		System.out.println("c"+c);
		
	}
	public void method2(String args) throws FileNotFoundException  {
		
		
		File f=new File("D:/test.txt");
		 
		 
		throw new ArrayIndexOutOfBoundsException();
		 
	}
}

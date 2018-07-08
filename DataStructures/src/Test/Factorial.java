package Test;

public class Factorial {
public static void main(String[] args) {
	System.out.println(factorial(5));
}


//4!=4*3*2*1
private static int factorial(int num) { 
	if(num==0)
	return 0;
	
	if(num==1)
		return 1;
	
	else
		return num * factorial(num-1);
	
	
}
}

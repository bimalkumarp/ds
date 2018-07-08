package Test;

public class Fibinacci {

	public static void main(String[] args) {
		 		
		
		for(int i=1;i<17;i++)
			System.out.println(fibonacii(i));
		
	}

	public static int fibonacii(int n){
		
		if( n==2 ||n==1){
			return 1;
		}
		
		return fibonacii(n-2)+fibonacii(n-1);
		
	}

}

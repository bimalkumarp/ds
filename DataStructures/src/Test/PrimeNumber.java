package Test;

public class PrimeNumber {

	public static void main(String[] args) {
		//System.out.println(isPrime(1));
		int count=0;
		int num=2;
		while(count<10000000){
			if(isPrime(num)){
				System.out.println(num);
				count++;
			}
			num++;
		}
		
	}
	
	public static boolean isPrime(int n){
		 
		if(n==1||n==2)
			return true;
		
		if(n%2==0){
			return false;
		}
		
		double sqrt = Math.sqrt(n)+1;
		for (int i=3;i<sqrt;i=i+2){
			
			if((n%i)==0)
				return false;
			
		}
		return true;
	}

}

package Test;

public class ArmStrong {

	public static void main(String[] args) {
		 System.out.println(isArmStrong(153));

	}

	private static boolean isArmStrong(int number) {
		if(number<10){
			return false;
		}
		
		int sum=0;
		int backup=number;
		
		while(number>0){
			int lastDigit=number%10;
			sum+=lastDigit*lastDigit*lastDigit;
			 
			number=number/10;
		}
		
		return sum==backup;
	 
	}
	
	

}

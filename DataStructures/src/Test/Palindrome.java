package Test;

import java.util.Arrays;

public class Palindrome {

	public static void main(String[] args) {
	System.out.println(isPallindrome(" "));
	System.out.println(isPallindrome(1001));	
	System.out.println(isPallindrome(10011));	
	}
	  
	
	
	
	public static boolean isPallindrome(String name){
		if(name==null || "".equalsIgnoreCase(name.trim()))
			return false;
		
		char[] val= name.toCharArray();
		int length=val.length;
		int count=val.length/2;
		for (int i=0;i<count;i++){
			
			if(val[i]!=val[val.length-i-1]){
				return false;
			}
			
		}
		return true;
	}
	
//1234
	
	public static boolean isPallindrome(int number){
		 if(number<10){
			 return true;
		 }
			
		int backUp=number;
		int reverse=0;
		
		while(number>0){
			
			int lastnum=number%10;
			reverse=reverse*10+lastnum;
			
			number=number/10;
			
			 
		}
		 
		 
			return backUp==reverse;
		 
		 
		
	}
}

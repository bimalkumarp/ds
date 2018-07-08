package com.java.sorting;

import java.util.Arrays;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		
		String str="bimal kumar panigrahi";
		
		
		System.out.println(reverseString(str));
		
	}

	private static String reverseString(String str) {
		 
		 if(str.length()==1)
			 return str;
		 
		 return str.charAt(str.length()-1) +reverseString(str.substring(0, str.length()-1));
	}

}

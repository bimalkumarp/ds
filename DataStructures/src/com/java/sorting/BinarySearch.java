package com.java.sorting;

import java.lang.reflect.Array;
import java.util.Arrays;

public class BinarySearch {

	public static void main(String[] args) {
		Integer [] array=(Integer[]) Array.newInstance(Integer.class, 100);
	 for(int i=0;i<100;i++)
		 array[i]=i+1;

	 System.out.println(Arrays.toString(array));
	 
	 System.out.println(findElement(array,100));
	}
	
	
	public static int findElement(Integer[] array,int num){
		int min=0;
		int max=array.length-1;
		
		
		while(min<=max){
			int mid=(min+max)/2;
			//System.out.println(mid);
			if(array[mid]==num)
				return mid;
			
			else if(num>array[mid]){
				min=mid+1;
			}
			else{
				max=mid-1;
			}
		}
		
		
		return -1;
	}

}

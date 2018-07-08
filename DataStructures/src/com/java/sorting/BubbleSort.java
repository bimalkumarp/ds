package com.java.sorting;

import java.util.Arrays;

public class BubbleSort {

 public static void main(String[] args) {
	int [] array={12,6,7,10,2};
	bubbleSort(array);
	System.out.println(Arrays.toString(array));
}
	
	
public static void bubbleSort(int[] array){
	//0 4  length 5
	for(int i=0;i<array.length;i++){//number of iterations
		for(int j=0;j<array.length-i-1;j++){
			if(array[j]>array[j+1]){
				//swap a and b
				/*
				 * a=a+b;
				 * b=a-b;
				 * a=a-b;
				 */
				
				array[j]=array[j]+array[j+1];
				array[j+1]=array[j]-array[j+1];
				array[j]=array[j]-array[j+1];
				
				
				
			}
		}
	}
}
 
 
}

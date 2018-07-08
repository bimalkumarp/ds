package com.java.sorting;

import java.util.Arrays;
import java.util.HashMap;

public class SelectionSort {

	public static void main(String[] args) {
		
		
		
		
		HashMap<String,String> map=new HashMap<String,String>();
		 String dummay="Shradha";
		System.out.println(map.put("key", dummay));;
		System.out.println(map.put("key", dummay));;
		
		
		
		
		
		
		
		
		
		
		
		/*
		int[] numArray = { 3, 4, 6, 7, 1, 2, 5, 8, 10, 9 };

		//selectionSort(numArray);
		bubbleSort(numArray);

	*/}

	public static void selectionSort(int[] numArray) {
		System.out.println("Array " + Arrays.toString(numArray));
		]HashSet

		for (int i = 0; i < numArray.length; i++) {
			for (int j = i + 1; j < numArray.length; j++) {

				if (numArray[i] > numArray[j]) {
					int k = numArray[i];
					numArray[i] = numArray[j];
					numArray[j] = k;
				}

			}

		}
		System.out.println("Array is sorted!!" + Arrays.toString(numArray));

	}

	public static void bubbleSort(int[] numArray) {

		System.out.println("Array " + Arrays.toString(numArray));
		
		for (int i=0;i<numArray.length;i++){
			for(int j=0;j<numArray.length-i-1;j++){
				if(numArray[j]>numArray[j+1]){
					int k=numArray[j];
					numArray[j]=numArray[j+1];
					numArray[j+1]=k;
				}
			}
		}
		
		System.out.println("Array is sorted!!" + Arrays.toString(numArray));

	}

}

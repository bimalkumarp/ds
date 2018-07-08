package Test;

import java.util.Arrays;

public class FindMissingNumberArray {
	public static void main(String[] args) {

		int[] array = new int[100];

		for (int i = 0; i < 50; i++)
			array[i] = i + 1;
		for (int i = 51; i < 100; i++)
			array[i] = i + 1;

		System.out.println(Arrays.toString(array));
		System.out.println(findMissingElement(array));
	}

	static int findMissingElement(int[] arr) {
		int length =arr.length;
		int expSum=(length*(length+1))/2;
		int actSum=0;
		for (int i = 0; i < 100; i++)
			actSum+=arr[i];
		
		
		//System.out.println(expSum+"--"+actSum);
		return expSum-actSum;
		
		
		

	}

}

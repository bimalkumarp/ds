package com.java.practiceinterview;

import java.util.ArrayList;

public class StockBuySellProb {
	
	
	
	public static void main(String[] args) {
		
		ArrayList<Interval> solution=new ArrayList<Interval>();
		
		int [] intArray={12,45,67,1,56,3,567};
		
		
		int i=0;
		int n=intArray.length;
		
		while(i<n-1){
		
			//find local minima
			
			while((i<n-1) && (intArray[i+1]<=intArray[i])) 
				i++;//i=5
				
			if(i==n-1){
				break;
			}
			
			Interval interval=new Interval();
			interval.buy=i++;//i=1;//i=4//i=6
			
			
			
			
			
			
			
			while(i<n && intArray[i]>=intArray[i-1]){
				i++;//i=5
				
			}
			
			 
			interval.sell=i-1;//i=3; 2
			solution.add(interval);
			
			
			
			
			
		}
		
		
		System.out.println(solution);
		
	 
		
		
	}
}

class Interval{
	int buy;
	int sell;
	@Override
	public String toString() {
		return "Interval [buy=" + buy + ", sell=" + sell + "]";
	}
	
}

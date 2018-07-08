package Test;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatedChar {
	public static void main(String[] args) {/*
		System.out.println(nonRepeatedChar("kizlllllllllllllllllllpgooooooooogyiydp"));
	*/
		
		 
		    long sum = 0L; // uses Long, not long
		    for (long i = 0; i <= Integer.MAX_VALUE; i++) {
		        sum += i;
		    }
		    System.out.println(sum);
		 }

	public static char nonRepeatedChar(String str) {
		
		
		char[] chars=str.toCharArray();
		LinkedHashMap<Character, Integer> map= new LinkedHashMap<Character, Integer>();
		
		for(int i=0;i<chars.length;i++){
			char ch=chars[i];
			
			if(map.containsKey(ch)){
				map.put(ch, map.get(ch)+1);
			}
			else{
				map.put(ch, 1);
			}
		}
		
		for(Character ch1:map.keySet()){
			if(map.get(ch1)==1){
				return ch1;
			}
		}
		
		
		return 0;
		
	}

}

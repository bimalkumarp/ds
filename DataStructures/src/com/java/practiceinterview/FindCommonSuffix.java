package com.java.practiceinterview;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class FindCommonSuffix {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("cornfiledo");
		list.add("Exfiledo");
		list.add("Easkjfhdaffileado");
		list.add("ghgjhjskjfhdaffiledo");
		System.out.println(findCommonSuffix(list));
	}

	static String findCommonSuffix(List<String> wordList) {

		String firstWord=wordList.get(0);
		String commonSuffix=firstWord;
		String tempSuffix="";
		
		
		//Find the common 
		
		
		
		for(int j=1;j<wordList.size()-1;j++){
			
			String currentWord=wordList.get(j);
			
			
			for(int i=0;i<commonSuffix.length();i++){
				char lastCharCS=commonSuffix.charAt(commonSuffix.length()-i-1);
				char lastCharCW=currentWord.charAt(currentWord.length()-i-1);
				
				if(lastCharCS==lastCharCW){
						tempSuffix=lastCharCS+tempSuffix;
				}
			 	else{
			 		break;
			 	}
			 		 
				
			}
			
			if(j==1){
				commonSuffix=tempSuffix;
				tempSuffix="";
			}
			
		
		}
		
		
		return commonSuffix;
		
		
		
		
		
		
		
		/*
		String[] words = {"cornfiled", "Exfiled", "eled"};
		 
		Stream.of(words)
                .sorted(Comparator.reverseOrder()).forEach(System.out::println);;
		
        Stream.of(words)
                .sorted(Comparator.reverseOrder())
                .reduce((r, l) ->
                {
                    String suff = "";
                    for (int i = r.length() - 2; i >= 0; i--) {
                        String temp = r.substring(i);
                        if (!l.endsWith(temp)) {
                            break;
                        }
                        suff = temp;
                    }
                    return suff;

                }).ifPresent(System.out::println);
        
        
        
        return null;*/

		/*
		 * 
		 * String matchedfuffix=""; String str1=wordList.get(0);
		 * 
		 * for(int i=0;i<str1.length();i++){ char
		 * firstChar=str1.charAt(str1.length()-i-1);
		 * 
		 * for(int j=1;j<wordList.size();j++){ char
		 * currentChar=wordList.get(j).charAt(wordList.get(j).length()-i-1);
		 * if(firstChar!=currentChar) return matchedfuffix;
		 * 
		 * 
		 * } matchedfuffix=firstChar+matchedfuffix ;
		 * 
		 * 
		 * }
		 * 
		 * return matchedfuffix;
		 * 
		 */}

}

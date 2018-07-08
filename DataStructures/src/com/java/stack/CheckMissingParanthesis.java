package com.java.stack;

import java.util.ArrayList;
import java.util.HashMap;

public class CheckMissingParanthesis {

	public static void main(String[] args) throws StackOverFlowException, StackUnderFlowException {
		String expr = "{[(2+3))+45]/{(2+1)*(7+8)}";
		System.out.println(checkMissingParanthesis(expr));
	}

	public static boolean checkMissingParanthesis(String expr) throws StackOverFlowException, StackUnderFlowException{

		HashMap<Character,Character> map=new HashMap<Character,Character>();
		map.put('}', '{');
		map.put(']', '[');
		map.put(')', '(');

		ArrayList<Character> list=new ArrayList<Character>();
		list.add('{');
		list.add('[');
		list.add('(');
		Stack<Character> stack=new Stack<Character>();


		char[] charArray=expr.toCharArray();

		for(int i=0;i<charArray.length;i++){
			char c=charArray[i];
			if(list.contains(c))
				stack.push(c);
			else if(map.containsKey(c)){
			  char poppedChar=stack.pop();
			  if(poppedChar!=map.get(c))
				  return true;
			}
		}
		return false;

	}
}

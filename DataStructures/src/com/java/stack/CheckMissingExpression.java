package com.java.stack;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class CheckMissingExpression {

	public static void main(String[] args) throws StackOverFlowException, StackUnderFlowException {
		String input="(A+B)}(X+Y)";
		boolean value=hasMatchingElements(input);
		System.out.println(value);
		
	}

	public static boolean hasMatchingElements(String input) throws StackOverFlowException, StackUnderFlowException {
		try {
			if (input == null && "".equalsIgnoreCase(input.trim())) {
				return false;
			}

			HashMap<Character, Character> map = new HashMap<Character, Character>();
			Set<Character> set = new HashSet<Character>();
			map.put(')', '(');
			map.put(']', '[');
			map.put('}', '{');
			set.addAll(map.values());

			Stack<Character> stack = new Stack<Character>();
			for (int i = 0; i < input.length(); i++) {
				char ch = input.charAt(i);
				if (ch == '(' || ch == '{' || ch == '[') {
					stack.push(ch);
				}
				if (ch == ')' || ch == '}' || ch == ']') {
					Character val = map.get(ch);
					Character poppedVal = stack.pop();
					if (val != poppedVal) {
						return false;
					}
				}

			}
			return stack.isEmpty();
		}

		catch (StackOverFlowException e1) {
			//e1.printStackTrace();
		} catch (StackUnderFlowException e2) {
		//	e2.printStackTrace();
		}
		return false;

	}
}

package Test;

import java.util.Arrays;

public class Palindrome {

	public static void main(String[] args) {
		System.out.println(isPallindrome("Bimib"));
		//System.out.println(isPallindrome(1001));
		//System.out.println(isPallindrome(10011));
		System.out.println(longestPalindromeString("9912333321456"));
	}

	/*public static boolean isPallindrome(String name) {
		if (name == null || "".equalsIgnoreCase(name.trim()))
			return false;

		char[] val = name.toCharArray();
		int length = val.length;
		int count = val.length / 2;
		for (int i = 0; i < count; i++) {

			if (val[i] != val[val.length - i - 1]) {
				return false;
			}

		}
		return true;
	}*/

	// 1234

	public static boolean isPallindrome(String name) {
		name=name.toLowerCase();
		if (name == null || "".equalsIgnoreCase(name.trim()))
			return false;

		char[] chArray = name.toCharArray();
		int length = chArray.length;
		for (int i = 0; i < length / 2; i++) {

			if (chArray[i] != chArray[length - 1 - i])
				return false;

		}
		return true;

	}

	public static boolean isPallindrome(int number) {
		if (number < 10) {
			return true;
		}

		int backUp = number;
		int reverse = 0;

		while (number > 0) {

			int lastnum = number % 10;
			reverse = reverse * 10 + lastnum;

			number = number / 10;

		}

		return backUp == reverse;

	}
	
	
	//System.out.println(longestPalindromeString("9912333321456"));
	public static String longestPalindromeString(String s) {
		if (s == null) return null;
		String longest = s.substring(0, 1);
		for (int i = 0; i < s.length() - 1; i++) {
			//odd cases like 121
			String palindrome = intermediatePalindrome(s, i, i);
			if (palindrome.length() > longest.length()) {
				longest = palindrome;
			}
			//even cases like 1221
			palindrome = intermediatePalindrome(s, i, i + 1);
			if (palindrome.length() > longest.length()) {
				longest = palindrome;
			}
		}
		return longest;
	}
	static public String intermediatePalindrome(String s, int left, int right) {
		//if (left > right) return null;
		while (left >= 0 && right < s.length()
				&& s.charAt(left) == s.charAt(right)) {
			left--;
			right++;
		}
		return s.substring(left + 1, right);
	}
	
	
	
	
}

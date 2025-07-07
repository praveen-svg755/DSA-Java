package com.praveen.mathemathics;

public class PalindromeNum {
	
	public static boolean isPalindrome(int num) {
		int original = num;
		int reverse = 0;
		while(num>0) {
			int last = num % 10;
			reverse = reverse*10 + last;
			num /=10;
		}
		
		return original == reverse;
	}

	public static void main(String[] args) {
		System.out.println(isPalindrome(121));

	}

}

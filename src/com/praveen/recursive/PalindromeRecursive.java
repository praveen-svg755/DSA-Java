package com.praveen.recursive;

public class PalindromeRecursive {
	
	public static boolean ispalindrome(String str,int left , int right) {
		if(left >= right) {
			return true;
		}
		
		if(str.charAt(left) != str.charAt(right)) {
			return false;
		}
		
		return ispalindrome(str , left+1 , right-1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Madam";
	    str = str.toLowerCase();
	    
		System.out.println(ispalindrome(str,0,str.length()-1));
		

	}

}

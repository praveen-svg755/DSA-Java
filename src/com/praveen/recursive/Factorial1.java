package com.praveen.recursive;

public class Factorial1 {
	
	public static int fact(int n) {
		if(n == 0 || n == 1) return 1;
		return n*fact(n-1);
		
		
	}

	public static void main(String[] args) {
		// factorial 
		
		
		System.out.println(fact(5));

	}

}

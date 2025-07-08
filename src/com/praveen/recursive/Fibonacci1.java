package com.praveen.recursive;

public class Fibonacci1 {
	
	public static int fibb(int n) {
		
		if(n<=1) return n;
		return fibb(n-1) + fibb(n-2);
	}

	public static void main(String[] args) {
	
		System.out.println(fibb(7));
		

	}

}

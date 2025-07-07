package com.praveen.mathemathics;

public class Factorial {
	
	public static int fact(int num) {
		int factorial = 1;
		while(num>0) {
			factorial = factorial*num;
			num--;
		}
		return factorial;
	}

	public static void main(String[] args) {
		System.out.println(fact(5));

	}

}

package com.praveen.recursive;

public class PrintNum1 {
	
	public static void print(int n) {
		if(n <=0) return;
		System.out.println(n);
		print(n-1);
	}

	public static void main(String[] args) {
		// print n to 1
		print(10);

	}

}

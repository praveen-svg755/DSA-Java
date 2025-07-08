package com.praveen.recursive;

public class PrintNum2 {
	
	public static void print(int current ,int n) {
		if(current > n) return;
		System.out.println(current);
		print(current+1 ,n);
		
		
	}

	public static void main(String[] args) {
		// print 1 to n
		print(1 , 10);

	}

}

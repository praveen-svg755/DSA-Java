package com.praveen.mathemathics;

public class countDigits {
	
	public static int countDig(int num) {
		
		int count = 0 ;
		while(num>0) {
		num /=10;
		count++;
		}
		
		return count;
		
	}

	public static void main(String[] args) {
		
		System.out.println(countDig(123));
		

	}

}

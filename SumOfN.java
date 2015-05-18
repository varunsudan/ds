package com.varun.recursion;

public class SumOfN {

	public static void main(String [] args) {
		int n = 10;
		System.out.println("sum of n = " + sum(n));
	}
	
	public static long sum(int n) {
		if(n == 1) {
			return 1;
		} else {
			return (n + sum(n-1));
		}
	}
}

package com.varun.recursion;
/**
 *  Calculate the sum of the first n numbers.
 *  i.e 1+2+3+4 = 10
**/
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

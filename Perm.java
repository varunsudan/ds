package com.varun.perm;

import java.util.Arrays;
/**
 *  Calculate all possible permutations of 
 *  given input values.
 * 
**/
public class Perm {
	
	public static int counter = 1;
	
	public static void main(String [] args) {
		perm(new int[]{1,2,3,4}, 0, 4);
	}
	
	public static void perm(int [] input, int startIndex, int size) {
		
		if(startIndex == (size-1)) {
			System.out.println(counter+"-- Perm ---->  "+ Arrays.toString(input));
			counter++;
		} else {
			for(int index = startIndex; index < size ;index++) {
				int temp = input[startIndex];
				input[startIndex] = input[index];
				input[index] = temp;
				perm(input, startIndex+1, size);
				temp = input[index];
				input[index] = input[startIndex];
				input[startIndex] = temp;
			}
		}
		
	}

}

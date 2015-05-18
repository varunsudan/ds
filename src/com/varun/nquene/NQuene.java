package com.varun.nquene;

public class NQuene {
	
	private static int[] columns = null;
	
	public static void main(String [] args) {
		nQueens(0,8);
	}
	
	private static void nQueens(int row, int n) {

		columns = new int[n];
		
		for(int i = row; i < n; i++) {
			if(isPlaced(row, i)) {
				columns[row] = i;
				if(row == (n-1)) return;
				nQueens(row+1, n);
			} else {
				nQueens(row-1,n);
			}
		}
		System.out.println("result is = " );
	
		int rowNum = 0;
		for(int column : columns) {
			System.out.println("row = " + rowNum+", column  =" + column);
			rowNum++;
		}
	}
	
	private static boolean isPlaced(int row, int column) {
		for(int rowNum = 0; rowNum < row; rowNum++) {
			if(columns[rowNum] == column) {
				return false;
			} else if(Math.abs(row - rowNum) 
						== Math.abs(columns[rowNum] - column)) {
				return false;
			}
		}
		return true;
	}
	

}

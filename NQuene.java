package com.varun.nquene;

public class NQuene {
	
	private static int[] columns = null;
	
	public static void main(String [] args) {
		int n = 4;
		columns = new int[n];
		nQueens(0,n);
	}
	
	private static void nQueens(int row, int n) {
		
		for(int i = row; i < n; i++) {
			if(isPlaced(row, i)) {
				//System.out.println("(" + row + " , " + i +" )");
				columns[row] = i;
				if(row == (n-1)) return;
				nQueens(row+1, n);
			} else {
				if((row-1) >= 0) {
					nQueens(row-1,n);
				}
				
			}
		}
		System.out.println("result is = " );
	
//		int rowNum = 0;
//		for(int column : columns) {
//			System.out.println("row = " + rowNum+", column  =" + column);
//			rowNum++;
//		}
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

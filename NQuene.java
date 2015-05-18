import java.util.Arrays;
/**
 *  Please refer to n- blocking queue problem 
 *  where in we are looking to place n queens in NxN chess board such that
 * none of them are blocking each other.
**/
public class NQueens {
	
	private static int[] columns = null;
	
	public static void main(String [] args) {
		int n = 2;
		columns = new int[n];
		nQueens(0,n);
	}
	
	private static void nQueens(int row, int n) {
		
		for(int i = 0; i < n; i++) {
			if(isPlaced(row, i)) {
				columns[row] = i;
				if(row == (n-1)) {
					System.out.println("Current state in array = " + Arrays.toString(columns));
					return ;
				} else {
					nQueens(row+1, n);
				}
				
			} 
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

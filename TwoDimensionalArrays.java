
public class TwoDimensionalArrays {
public static  void main(String[] args) {
	int[][] grid = new int[3][4];//can only use one type, but theyre ways around it, later- quote by Davis 
	for(int row = 0; row < grid.length; row++) {//always use zero because it will always be there, keeps it from "troubles" happening
		for(int col = 0; col < grid[0].length; col++) {
			grid[row] [col] = row + col;
		}//end for loop
	}//end for loop
	for(int[] row : grid) {
		for(int num: row) {
			System.out.print(num+" ");
		}//end for each loop
		System.out.print("\n");
	}//end for each loop
}//end static
}//end class

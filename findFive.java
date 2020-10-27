public class findFive {
public static void main(String[] args) {
	int[][] array = new int[3][4];
	for(int row = 0; row < array.length; row++) {
		for(int col = 0; col < array[0].length; col++) array[row][col] = (int)(Math.random() * 10);//populates an array w/ numbes 0-9;
		//practicing making code short
	}//end first first for loop
	System.out.println("First List: ");
	for(int[] row : array) {
		for(int num : row) {
			System.out.print(num+" ");
		}//end second for each loop
		System.out.print("\n");
	}//end first for each loop
	System.out.println("\nWhere 5 Pops Up: ");
	for(int row = 0; row < array.length; row++) {
		for(int col = 0; col < array[0].length; col++) {
			if(array[row][col] == 5) System.out.println("Row: " + row + " Col: " + col);
		}//end second for loop
	}//end for loop
}//end static void 
}//end of class

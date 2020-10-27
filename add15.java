public class add15 {
public static void main (String[] args) {
	int[][] array = new int[3][5];
	int sumOne = 0, rowOne = 0, rowTwo = 0, rowThree = 0, colOne = 0, colTwo = 0, colThree = 0, colFour = 0, colFive = 0;
	for(int row = 0, i = 1; row < array.length; row++) {
			for(int col = 0; col < array[0].length; col++) {
				array[row][col] = i;
				sumOne = sumOne +array[row][col];
				i++;
			}//end for loop
		}//end for loop
	System.out.println("Original List:");
	for(int[] row : array) {
		for(int num : row) {
			System.out.print(num+" ");
		}//end second for each loop
		System.out.print("\n");
	}//end first for each loop
	System.out.println("\nSum of the entire array: " + sumOne);
	for(int row = 0; row < array.length; row++) {
		for(int col = 0; col < array[0].length; col++) {
			if(array[row][col] <= 5) {
				rowOne = rowOne + array[row][col];
			}//end if 
			if(array[row][col] <= 10 && array[row][col] > 5) {
				rowTwo = rowTwo + array[row][col];
			}//end if 
			if(array[row][col] <= 15 && array[row][col] > 10) {
				rowThree = rowThree + array[row][col];
			}//end if 
			if(col == 0) {
				colOne = colOne + array[row][col];
			}//end if 
			if(col == 1) {
				colTwo = colTwo + array[row][col];
			}//end if 
			if(col == 2) {
				colThree = colThree + array[row][col];
			}//end if 
			if(col == 3) {
				colFour = colFour + array[row][col];
			}//end if 
			if(col == 4) {
				colFive = colFive + array[row][col];
			}//end if 
		}//end for loop
	}//end for loop
	System.out.println("\nThe sum of Row Zero: " + rowOne + "\nThe sum of Row One: " + rowTwo + "\nThe sum of Row Two: " + rowThree );
	System.out.println("\nThe sum of Col Zero: " + colOne + "\nThe sum of Col One: " + colTwo + "\nThe sum of Col Two: " + colThree + "\nThe sum of Col Three: " + colFour + "\nThe sum of Col Four: " + colFive);
}//end static 
}//end class

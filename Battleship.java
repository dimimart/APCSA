import javax.swing.JOptionPane;
public class Battleship {
public static void main (String[] args) {
	int[][] gameBoard;
	String[][] gameX;
	int rowInput = Integer.parseInt(JOptionPane.showInputDialog("Enter how may rows you want in this game"));
	int colInput = Integer.parseInt(JOptionPane.showInputDialog("Enter how may columns you want in this game"));
	gameBoard = new int [rowInput][colInput];
	gameX = new String [rowInput][colInput];
	for(int row = 0; row < gameBoard.length; row++) {
		for(int col = 0; col < gameBoard[0].length; col++) {
			gameBoard[row][col] = (int)(Math.random() * 100);
			gameX[row][col] = "X";
		}//end for loop
	}//end for loop
	//finding a place using math rand to place 0
	int zeroRow = (int)(Math.random()*rowInput);
	int zeroCol = (int)(Math.random()*colInput);
	gameBoard[zeroRow][zeroCol] = 0;
	for(String[] row : gameX) {
		for(String X : row) {
			System.out.print(X+" ");
		}//end second for each loop
		System.out.print("\n");
	}//end first for each loop
	boolean found = false;
	int rGuess = Integer.parseInt(JOptionPane.showInputDialog("Enter the row where you think the battleship is hiding, KEEP IN MIND, ITS COUNTING BY INDEX!"));
	int cGuess = Integer.parseInt(JOptionPane.showInputDialog("Enter the column where you think the battleship is hiding, KEEP IN MIND, ITS COUNTING BY INDEX!"));
	
	while(found == false) {
		for(int row = 0; row < gameBoard.length; row++) {
			for(int col = 0; col < gameBoard.length; col++) {
				
				if(rGuess > rowInput-1 || cGuess > colInput-1) {
					System.out.println("\n"+ "Next Round: ");
					for(String[] rowW: gameX) {
						for(String F : rowW) {
							System.out.print(F + " ");
						}//end second for loop
						System.out.print("\n");
					}//end first for loop	
					rGuess = Integer.parseInt(JOptionPane.showInputDialog("That was unsuccessful, Enter the row where you think the battleship is hiding, KEEP IN MIND, ITS COUNTING BY INDEX!"));
					cGuess = Integer.parseInt(JOptionPane.showInputDialog("That was unsuccessful,Enter the column where you think the battleship is hiding, KEEP IN MIND, ITS COUNTING BY INDEX!"));
					found = false;
				}//end if statement 
				if(gameBoard[rGuess][cGuess] == 0) {
					found = true;//breaks while loop
				}//end if statement 
				
				else {
					int rOff = java.lang.Math.abs(rGuess - zeroRow);//absolute value
					int cOff = java.lang.Math.abs(cGuess - zeroCol);
					System.out.println("\nYou are off by: " + rOff + " rows and " + cOff + " columns");
					gameX[rGuess][cGuess] = "M";
					System.out.println("Next Round: ");
					
					for(String[] rowW: gameX) {
						for(String F : rowW) {
							System.out.print(F + " ");
						}//end second for loop
						System.out.print("\n");
					}//end first for loop	
					rGuess = Integer.parseInt(JOptionPane.showInputDialog("That was unsuccessful, Enter the row where you think the battleship is hiding, KEEP IN MIND, ITS COUNTING BY INDEX!"));
					cGuess = Integer.parseInt(JOptionPane.showInputDialog("That was unsuccessful,Enter the column where you think the battleship is hiding, KEEP IN MIND, ITS COUNTING BY INDEX!"));
					found = false;
				}//end else statement 
			}//end for loop
		}//end for loop
	}//end while loop
	if(found = true) {
		System.out.println("You sunk my battle ship!");
		found = true;//ends while loop
	}//end if statement 
	}//end static 
}//end class

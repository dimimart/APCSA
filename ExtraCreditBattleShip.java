import javax.swing.JOptionPane;
public class ExtraCreditBattleShip {
public static void main (String[] args) {
	int[][] gameBoard;
	String[][] gameX;
	int rowInput = Integer.parseInt(JOptionPane.showInputDialog("Enter how may rows you want in this game"));
	int colInput = Integer.parseInt(JOptionPane.showInputDialog("Enter how may columns you want in this game"));
	gameBoard = new int [rowInput][colInput];
	gameX = new String [rowInput][colInput];
	for(int row = 0; row < gameBoard.length; row++) {
		for(int col = 0; col < gameBoard[0].length; col++) {
			gameBoard[row][col] = (int)(Math.random() * (100-5) + 5);
			gameX[row][col] = "X";
		}//end for loop
	}//end for loop
	//finding a place using math rand to place 0
	//created all of ships
	int destroyerR = (int)(Math.random()*rowInput), destroyerC = (int)(Math.random()*colInput);
	gameBoard[destroyerR][destroyerC] = 00;
	int cruiserR = (int)(Math.random()*rowInput), cruiserC = (int)(Math.random()*colInput);
	gameBoard[cruiserR][cruiserC] = 111;
	int submarineR = (int)(Math.random()*rowInput), submarineC = (int)(Math.random()*colInput);
	gameBoard[submarineR][submarineC] = 222;
	int battleshipR = (int)(Math.random()*rowInput), battleshipC = (int)(Math.random()*colInput);
	gameBoard[battleshipR][battleshipC] = 3333;
	int aircraftR = (int)(Math.random()*rowInput), aircraftC = (int)(Math.random()*colInput);
	gameBoard[aircraftR][aircraftC] = 3333;
	//end of creating all of the ships, starting to print og array
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
						for(String F : rowW) System.out.print(F + " ");
						System.out.print("\n");
					}//end first for loop	
					rGuess = Integer.parseInt(JOptionPane.showInputDialog("That was unsuccessful, Enter the row where you think the battleship is hiding, KEEP IN MIND, ITS COUNTING BY INDEX!"));
					cGuess = Integer.parseInt(JOptionPane.showInputDialog("That was unsuccessful,Enter the column where you think the battleship is hiding, KEEP IN MIND, ITS COUNTING BY INDEX!"));
					found = false;
				}//end if statement 
				if(gameBoard[rGuess][cGuess] == gameBoard[battleshipR][battleshipC]) {
					found = true;//breaks while loop
				}//end if statement 
				else {
					int battleshipOff = (java.lang.Math.abs(rGuess - battleshipR)) + (java.lang.Math.abs(cGuess - battleshipC));
					int destroyerOff = (java.lang.Math.abs(rGuess - destroyerR)) + (java.lang.Math.abs(cGuess - destroyerC));
					int cruiserOff = (java.lang.Math.abs(rGuess -  cruiserR)) + (java.lang.Math.abs(cGuess - cruiserC));
					int submarineOff = (java.lang.Math.abs(rGuess - submarineR)) + (java.lang.Math.abs(cGuess - submarineC));
					int aircraftOff = (java.lang.Math.abs(rGuess - aircraftR)) + (java.lang.Math.abs(cGuess - aircraftC));
					int[] numArray = {battleshipOff, destroyerOff, cruiserOff, submarineOff, aircraftOff};
					int l = numArray[0], s = numArray[0];
					for(int i = 0; i < numArray.length; i++) {
						if(numArray[i] > l) l = numArray[i];
						else if(numArray[i] < s) s = numArray[i];
					}//end for loop
					if(s == battleshipOff ) System.out.println("\nBattleship is the closest to you");
					if(s == destroyerOff ) System.out.println("\nDestroyer is the closest to you");
					if(s == cruiserOff ) System.out.println("\nCruiser is the closest to you");
					if(s == submarineOff ) System.out.println("\nSubmarine is the closest to you");
					if(s == aircraftOff )System.out.println("\nAircraft is the closest to you");		
					gameX[rGuess][cGuess] = "M";
					System.out.println("Next Round: ");
					for(String[] rowW: gameX) {
						for(String F : rowW) System.out.print(F + " ");
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

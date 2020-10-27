package timesTabl;
import javax.swing.JOptionPane;
public class timesTabl {
public static void main(String[] args) {
	int numR = Integer.parseInt(JOptionPane.showInputDialog("Enter how many rows you want in the times table"));
	int numC = Integer.parseInt(JOptionPane.showInputDialog("Enter how many columns you want in the times table"));
	int r = 1, c = 1; //must equal one, cant begin with 0
	int[][] timesTable = new int[numR][numC];
	for(int row = 0; row < timesTable.length; row++) {
		for(int col = 0; col < timesTable[0].length; col++) {
			timesTable[row][col] = r*c;
			c = c +1;//only temp
		}//end for loop
		r = r + 1;//rows gotta keep increasing
		c = 1;// making it equal 1 again cause it needs to be the same as the other corresponding number
	}//end for loop
	for(int[] num : timesTable) {  //must use for each loops cause theyre popular in the AP exam and I need to finesse that 
		for(int nummy : num) {
			System.out.print(nummy + " ");
		}//end for loop
		System.out.print("\n");
	}//end for loop
}//end static 
}//end main class

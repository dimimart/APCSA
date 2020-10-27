import javax.swing.JOptionPane;
public class AlphaList {
public static void main (String[] args) {
	int r = Integer.parseInt(JOptionPane.showInputDialog("Enter how many rows you want the array to have"));
	int c = Integer.parseInt(JOptionPane.showInputDialog("Enter how many columns you want the array to have"));
	String[][] array = new String[r][c];//6 rows, 5 columns
	char alphabet = 'a';
	for(int row = 0; row < array.length; row++) {
		for(int column = 0; column < array.length; column++) {
			    array[row][column] = Character.toString(alphabet);
			    if(alphabet =='z') {//if it equals z, make it go back to a
			    	alphabet = 'a';
			    }//end if statement
			    else {
			    	alphabet++;
			    }//end else statement 
			}//end for loop
		}//end for loop
	for(String[] num : array) {
		for(String nummy : num) {
			System.out.print(nummy + " ");
		}//end for loop
		System.out.print("\n");
	}//end for loop
}//end static void 
}//end class

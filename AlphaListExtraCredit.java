import javax.swing.JOptionPane;
public class AlphaListExtraCredit {
public static void main(String[] args) {
	//do while loop later
	String choose = JOptionPane.showInputDialog("Would you choose \"lowercase\"/ \"uppercase\" letters or \"digits\" 0-9?");
	boolean check = false, done = false;
	while(check  == false) {
	if(choose.equals("lowercase")) { //REMEMBER TO DO THIS, OR ELSE CODE WONT RUN!!
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
				    	alphabet++;//treat it like an index, similar to the other stuff
				    }//end else statement 
				}//end for loop
			}//end for loop
		/*int i = 0;
		for(String[] num : array) {
			for(String nummy : num) {
				System.out.print(nummy);
				i+=1;
			}//end for loop
			if(i % 2 == 0) {
				System.out.print("\t\n");
			}//end if 
			else System.out.print("\n");*/
		for(int row = 0; row < array.length; row++) {
			for(int col = 0; col < array[0].length; col++) {
				if(row % 2 == 0) {
					System.out.print(array[row][col] + "\t");
				}//end if statement
				if(row%2 != 0) {
					System.out.print("\t" + array[row][col] + "\t");
				}//end else 
			}//end for loop
		}//end for loop 
		done = true;
	}//end if statement 
	if(choose.equals("uppercase")) {
		int r = Integer.parseInt(JOptionPane.showInputDialog("Enter how many rows you want the array to have"));
		int c = Integer.parseInt(JOptionPane.showInputDialog("Enter how many columns you want the array to have"));
		String[][] array = new String[r][c];//6 rows, 5 columns
		char alphabet = 'A';
		for(int row = 0; row < array.length; row++) {
			for(int column = 0; column < array.length; column++) {
				    array[row][column] = Character.toString(alphabet);
				    if(alphabet =='Z') {//if it equals z, make it go back to a
				    	alphabet = 'A';
				    }//end if statement
				    else {
				    	alphabet++;
				    }//end else statement 
				}//end for loop
			}//end for loop
		for(String[] num : array) {
			for(String nummy : num) {
				System.out.print(nummy + "\t");
			}//end for loop
			System.out.print("\n");
		}//end for loop
		done = true;
	}//end if statement 
	if(choose.equals("digits")) {
		int r = Integer.parseInt(JOptionPane.showInputDialog("Enter how many rows you want the array to have"));
		int c = Integer.parseInt(JOptionPane.showInputDialog("Enter how many columns you want the array to have"));
		int[][] array = new int[r][c];//6 rows, 5 columns
		for(int row = 0, i = 0; row < array.length; row++) {
			for(int column = 0; column < array.length; column++) {
				    array[row][column] = i;
				    if(i == 9) {//if it equals z, make it go back to a
				    	i = 0;
				    }//end if statement
				    else {
				    	i++;
				    }//end else statement 
				}//end for loop
			}//end for loop
		for(int[] num : array) {
			for(int nummy : num) {
				System.out.print(nummy + "\t");
			}//end for loop
			System.out.print("\n");
		}//end for loop
		done = true;
	}//end if statement 
	if(done == true) break;
	else {
		choose = JOptionPane.showInputDialog("Would you choose lowercase/ uppercase letters or digits 0-9?");
		check = false;
	}//end else statement 
	}//end while loop
}//end static  void
}//end class

//start of code
import javax.swing.JOptionPane;
public class Artist {
	public static void main(String args[]) {
		String[] artists = new String[4];
		for(int i = 0; i < artists.length; i++) {
			artists[i] = JOptionPane.showInputDialog("Enter 4 artist names, 3 you like, 1 you hate");
		}//end for loop
		String artistYouHate = JOptionPane.showInputDialog("Who is the artist you hate again?");
		for(int i = 0; i < artists.length; i++) {
			if(artists[i].equals(artistYouHate)) {
				System.out.println("I dont like this one!");
			} // end if statement
			else {
				System.out.println("this one is ok...");
			}//end else statement
		}//end for loop
	//	artists[2] = null;
	}//end static void
}//end of class

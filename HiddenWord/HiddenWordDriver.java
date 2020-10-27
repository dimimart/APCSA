//start of driver
import javax.swing.JOptionPane;
public class HiddenWordDriver {
public static void main (String[] args) {
	
	String word = "HARPS";	//word you're looking for , Guess from the last code lol
	HiddenWord name = new HiddenWord(word);				//trying new stuff to make the code short , calling the getter 
	System.out.println(name.getHint(JOptionPane.showInputDialog("The length of the word is: " + word.length() + " letters, remember- use all CAPS when entering the guess")));
	
}//end of static
}//end of driver
//end of code
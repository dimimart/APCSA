package scrambleWord;
import java.util.List;
import java.util.ArrayList;
import javax.swing.JOptionPane;
public class scrambleWordDriver {
public static void main (String[] args) {
	
	//scrambleWord obj = new scrambleWord(); 
	String ogWord = (JOptionPane.showInputDialog("Enter the word you wish to be scrambled")).toUpperCase();
	String finalW = scrambleWord.scram(ogWord);
	
	List<String> wordList = new ArrayList<String>();
	wordList.add("TAN");
	wordList.add("ABRACADABRA");
	wordList.add("WHOA");
	wordList.add("APPLE");
	wordList.add("EGGS");
	
	List<String> finalLista = scrambleWord.scrambleOrRemove(wordList);
	
	System.out.println("Your original word is: " + ogWord + "\nThe scrambled version of your word is: " + finalW + "\nList of scrambled words: " + finalLista);
	
	
}//end static 
}//end class

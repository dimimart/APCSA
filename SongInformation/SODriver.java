//beg of code
package SO;
public class SODriver {
	public static void main(String[] args) {
		SO songuno = new SO();
		System.out.println(songuno);	
		SO songdos = new SO("BTS", "Love Yourself", "Serendipity", 567);
		System.out.println(songdos);
		
		int lengthB = songdos.getLengthInSec();
		SO bts = new SO("BTS", "Love Yourself", "Serendipity", lengthB);
		System.out.println("\nNew Length of Song Two (Serendipity) in seconds is: " + lengthB);
		System.out.println("New length of the song Info: " + bts);
	}//end static
}//end class
//end of class
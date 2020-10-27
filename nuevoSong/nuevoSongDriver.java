//beg of code
package nuevoSong;
public class nuevoSongDriver {
	public static void main(String[] args) {
		nuevoSong songuno = new nuevoSong();
		System.out.println(songuno);	
		nuevoSong songdos = new nuevoSong("BTS", "Love Yourself", "Serendipity", 567);
		System.out.println(songdos);
		
		/*int screen = bedroomTV.getScreenSize();
		bedroomTV.setScreenSize(40);//order matters
		System.out.println(screen);*/
		
		
		int lengthB = songdos.getLengthInSec();
		nuevoSong bts = new nuevoSong("BTS", "Love Yourself", "Serendipity", lengthB);
		System.out.println("\nNew Length of Song Two (Serendipity) in seconds is: " + lengthB);
		System.out.println("New length of the song Info: " + bts);
	}//end static
}//end class
//end of code
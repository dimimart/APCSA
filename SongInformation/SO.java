//beg of code
package SO;
public class SO {
	//instance variables
	private String artist;
	private String title;
	private String album;
	private int lengthInSecs;
	//constructor
	public SO() {
		this.artist = "Ariana Grande";
		this.title = "God is a Woman";
		this.album = "Sweetner";
		this.lengthInSecs = 343;
	}//end constructor
		public SO(String artist, String title, String album, int lengthInSecs) {
		this.artist = artist;
		this.title = title;
		this.album = album;
		this.lengthInSecs = lengthInSecs;
	}//end constructor

		public int getLengthInSec() {
			this.lengthInSecs = 444;
			return lengthInSecs;
		}//ending getter

		//starting setter
		public void setLengthInSec(int newSeconds ) {
			this.lengthInSecs = newSeconds;
		}//ending setter
		
		public String convertToMinSec() {
			int min = lengthInSecs / 60;
			int sec = lengthInSecs % 60;
			String sum = "\nThe length of the song is: " + min + " minutes and " + sec + " long";
			return sum;
		}//ending getter?

		//to String
	public String toString() {
		String Output;
		Output =  "\nTitle- " + title + "\nArtist- " + artist + "\nAlbum- " + album + convertToMinSec();
		return Output;
	}//end toString
}//end song main
//end of code

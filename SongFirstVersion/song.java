//beg of code
package SonP;
public class song {
	//instance variables
	private String artist;
	private String title;
	private String album;
	//constructor
	public song() {
		this.artist = "Ariana Grande";
		this.title = "God is a Woman";
		this.album = "Sweetner";
	}//end constructor
		public song (String artist, String title, String album) {
		this.artist = artist;
		this.title = title;
		this.album = album;
	}//end constructor 
		//to String
	public String toString() {
		String Output;
		Output =  "Title- " + title + "\nArtist- " + artist + "\nAlbum- " + album;
		return Output;
	}//end toString
}//end song main
//end of code
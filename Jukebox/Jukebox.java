//beg of code
package Jukebox;
public class Jukebox {
	private String artist;
	private String title;
	private String album;
	private int rating;
	private int lengthInSecs;
	//constructor
	public Jukebox() {
		this.title = "God is a Woman";
		this.rating = 4;
	}//end constructor
		public Jukebox(String title, int rating) {
		this.title = title;
		this.rating = rating;
	}//end constructor
		public String getName() {
			return title;
		}//end getter
		public int getRating() {		
			return rating;
		}//end getter
		public int getLengthInSec() {
			this.lengthInSecs = 444;
			return lengthInSecs;
		}//ending getter

		//starting setter
		public String toString() {
		String Output;
		Output =  "\nTitle- " + title + ", Rating: " + rating;
		return Output;
	}//end toString
}//end song main
//end of code

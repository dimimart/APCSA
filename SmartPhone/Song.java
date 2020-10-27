public class Song {
	private String title;
	private int lengthInSecs;
	
	public Song() {
		this.title = "God is a Woman";
		this.lengthInSecs = 343;
	}//end constructor
	
		public Song(String  title,  int lengthInSecs) {
		this.title = title;
		this.lengthInSecs = lengthInSecs;
	}//end constructor

		public int getLengthInSec() {
			return lengthInSecs;
		}//ending getter

		public void setLengthInSec(int newSeconds ) {
			this.lengthInSecs = newSeconds;
		}//ending setter
		
		public String convertToMinSec() {
			int min = lengthInSecs / 60;
			int sec = lengthInSecs % 60;
			String sum = "\nThe length of the song is: " + min + " minutes and " + sec + " long";
			return sum;
		}//ending getter?
		public String getSong() {
			return this.title;
		}//returns song title 
}//end song main


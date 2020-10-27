public class SmartPhoe {
	private String brand;
	private int GB;
	private Song[] songLibrary;
	
	public SmartPhoe(String brand,  int GB) {  //, String[] songLibrary
		this.brand = brand;
		this.GB = GB;		
		this.songLibrary = new Song[4];
		songLibrary[0] = new Song ("DNA, ", 123);
		songLibrary[1] = new Song("FAKE LOVE, ", 456);
		songLibrary[2] = new Song("Blood Sweat & Tears, ", 789);
		songLibrary[3] = new Song("Go Go", 123);
	}//end 2 arg  constructor
	
	public int totalPlayTime() {
		int lengthInSecs = 0;
		for (int i = 0; i < songLibrary.length; i++)  {
			lengthInSecs += songLibrary[i].getLengthInSec();
		}//end for loop
		return lengthInSecs;
	}//end getter
		
	public void deleteAllSongs() {
		for(int i = 0; i < songLibrary.length; i++) {
			songLibrary[i] = null;
		}//end for
	}//end setter
	
	public String toString() {
		String output = "Smart Phone Brand: " + brand + "\nStorage Space: " + GB + " GB" + "\nSong Library : ";
		if(!(songLibrary[0] == null)) {
			for(int i = 0; i < songLibrary.length; i++) {//basically not gonna print anything is songLibrary = null; meaning it will leave space blank
				output += songLibrary[i].getSong();
			}//end for 
		}//end if 
		return output;
	}//end toString
}//main class

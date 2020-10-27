import java.util.ArrayList;
public class SmartPhoneDos {
	private String brand;
	private int GB;
	private ArrayList<Song> songLibrary;// = new ArrayList<Song>();	//remember the song stuff
	
	public SmartPhoneDos(String brand, int GB) {
		this.brand = brand;
		this.GB = GB;
		this.songLibrary = new ArrayList<Song>(4);
		songLibrary.add(new Song("DNA, ", 123));
		songLibrary.add(new Song("FAKE LOVE, ", 456));
		songLibrary.add(new Song("Blood Sweat & Tears, ", 789));
		songLibrary.add(new Song("Go Go", 123));
	}//end 2 arg  constructor
	
	public int totalPlayTime() {
		int lengthInSecs = 0;
		for (int i = 0; i < songLibrary.size(); i++)  {
			lengthInSecs += songLibrary.get(i).getLengthInSec();
		}//end for loop
		return lengthInSecs;
	}//end getter
	
	public void deleteAllSongs() {
		songLibrary.removeAll(songLibrary);
		/*for(int i = 0; i < songLibrary.size(); i++) {
		songLibrary.get(i).equals(null);
		}//end for */
	}//end setter
	
	public String toString() {
		String output = "Smart Phone Brand: " + brand + "\nStorage Space: " + GB + " GB" + "\nSong Library : ";
		for(int i = 0; i < songLibrary.size(); i++) {
				output += songLibrary.get(i).getSong();
			}//end for 
		return output;
	}//end toString
}//main class

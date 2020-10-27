package Jukebox;
public class JukeboxNewClass {
	Jukebox[][] songList = new Jukebox[3][4];
	String songy = "";
	String randomSong = null, song = null, rand = null;
	public JukeboxNewClass() {
		songList[0][0] = new Jukebox( "Jet Airliner", 5 );
		songList[0][1] = new Jukebox( "Slide", 4 );
		songList[0][2] = new Jukebox( "Tom Sawyer", 3 );
		songList[0][3] = new Jukebox( "Purple Rain", 2 );
		songList[1][0] = new Jukebox( "Sing a Song", 1 );
		songList[1][1] = new Jukebox( "Baba O'Riley", 5 );
		songList[1][2] = new Jukebox( "Jumper", 4 );
		songList[1][3] = new Jukebox( "Car Wash", 3 );
		songList[2][0] = new Jukebox( "Kung Fu Fighting", 2 );
		songList[2][1] = new Jukebox( "Right as Rain", 4 );
		songList[2][2] = new Jukebox( "Beat It", 5 );
		songList[2][3] = new Jukebox( "Bust a Move", 4 );
	}//end 0 arg 
	public String randomSong() {
		int row = (int)(Math.random()*3);
		int col = (int)(Math.random()*4);
		for(int r = 0; r < songList.length; r++) {
			for(int c = 0; c < songList[0].length; c++) {
				song = songList[row][col].getName();
				if(songList[r][c].getName().equals(song)) {
					randomSong = (songList[r][c].getName());
				}//end if statement 
			}//end for loop
		}//end for loop
		return randomSong;
	}//end method i
	public  String playSongofRating(int rating) {
		for(int row = 0, i = 0; row < songList.length; row++) {
			for(int col = 0; col < songList[0].length; col++) {
				//System.out.println("fgarg");, used to debug code
				if(rating == songList[row][col].getRating()) {
					//problem has to do with this 
					songy += songList[row][col].getName() + "\n";
				}//end if
				else {
					continue;
				}//end else statement 
			}//end for loop
		}//end for loop
		return songy;
	}//end method
	public String toString() {
	String output = "";
	for(Jukebox[] thing : songList) {
		for(Jukebox thingy : thing) {
			output+= thingy;
		}//end for each loop
		output+="\n";
	}//end first for each loop
	return output;
	}//end to string
}//end class

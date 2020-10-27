package Jukebox;
public class JukeboxDriver {
public static void main(String[] args) {
	JukeboxNewClass object = new JukeboxNewClass();
	System.out.println(object);
	String rand = object.randomSong();
	System.out.println("Here is the name of the random song: " + rand);
	int r = 4;
	System.out.println("\nHere are the following songs with the rating of: " + r);
String rating = object.playSongofRating(r);
	System.out.println(rating);
}//end static
}//end class


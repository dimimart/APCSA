public class ProgramTwo {
	public static void main (String[] args) {

		String movie[] = {"Tangled", "Frozen", "Cinderella"};

		String songs[] = {"Bad, Thriller, Remember the Time"};

		for (int index = 0; index < movie.length; index++) {
			System.out.println(movie[index]);
		}//end for

		int thingy = 0;

		while ( thingy < songs.length ) {
			System.out.println();
			System.out.println();
			System.out.println(songs[thingy]);
			thingy++;
		}//end while

	}//end static void main
}//end class

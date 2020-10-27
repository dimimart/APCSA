import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
public class DownloadDriver {
public static void main (String[] args) {
	
	List<String> titles = new ArrayList<String>();
	titles.add("DNA");
	titles.add("Fake Love");
	titles.add("Cotton Eye Joe");
	
	String songName = JOptionPane.showInputDialog("Enter the song you're searching for");
	MusicDownload clas = new MusicDownload();
	System.out.println("Original Playlist:\n" + clas + "\nSong Searched for: " + songName + "\nSong Found: " + clas.getDownloadInfo(songName));
	clas.updateDownloads(titles);//order matters
	System.out.println("Titles Playlist: " + titles + "\n\nNew Playlist:\n" + clas);
	//System.out.println(clas.updateDownloads(songTitles));
	
}//end static 
}//end of driver
//end of code
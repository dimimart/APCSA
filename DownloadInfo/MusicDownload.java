import java.util.List;
import java.util.ArrayList;
public class MusicDownload {
	
	private List<DownloadInfo> downloadList = new ArrayList<DownloadInfo>();
	List<DownloadInfo> ik = new ArrayList<DownloadInfo>();
	
	public MusicDownload() {
		this.downloadList.add(new DownloadInfo("Serendipity"));
		this.downloadList.add(new DownloadInfo("DNA"));
		this.downloadList.add(new DownloadInfo("Fake Love"));
	}//end 0 arg con
	public DownloadInfo getDownloadInfo(String title) {
		for (DownloadInfo info : downloadList){  //practice this
	           if (info.getTitle().equals(title)){
	        	   return info;
	           } //end if statement
	     }//end for loop   
	     return null;//doesnt work unless i put null here
	}//end getter
	
	public void updateDownloads(List<String> titles) {
		ArrayList<String> down = new ArrayList<String>();
		for(int i = 0; i < downloadList.size(); i++) {
			down.add(downloadList.get(i).getTitle());
		}//end for loop
		/* .clone()     --- copies an array, keep in mind for next assignment */
		for(int k = 0; k < titles.size(); k++) {
			if(down.contains(titles.get(k))) {
				downloadList.get(down.indexOf(titles.get(k))).incrementTimesDownloaded();
			}//end if statement
			else {
				DownloadInfo ner = new DownloadInfo(titles.get(k));
				downloadList.add(ner);
			}//end else statement
		}//end for loop
	}//end setter?

	public String toString() {
		String output = "";
		for(int i = 0; i < downloadList.size(); i++) {
			output += downloadList.get(i);
		}//end for loop
		return output;
	}//end toString
	
}//end class
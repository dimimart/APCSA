public class DownloadInfo {
	
	private String title;
	private int num = 1;
	
	public DownloadInfo(String title) {
		this.title = title;
	}//end public
	
	public String getTitle() {
		return title;
	}//end getter
	
	public void incrementTimesDownloaded() {
		this.num = num + 1;
	}//end setter?
	
	public String toString() {
		String output = "Title of the Song: " + title + "; Number of times Downloaded: " + num + "\n";
		return output;
	}//end toString
	
}//end class
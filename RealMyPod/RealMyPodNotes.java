public class RealMyPodNotes {
	private String color;
	private MySong[] songList;
	
		public MyPod() {
			this.color = "White";
			this.songList = new MySong[2]; //mysong comes from a diff class
			songList[0] = new MySong("Despasito", 0);
			songList[1] = new RealM yPodNotesDrive("Sick Obama" , 10);
		}//end constructor 
		
		public String toString() {
			String output = "My Pod is " + color;
			for(int i = 0; i < songList.length; i++) output += songList[i];
			return output;
		}//end toString
		
}//end of class

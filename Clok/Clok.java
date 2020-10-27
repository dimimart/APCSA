//beg of code
package Clok;
public class Clok {
	//instance variables
	private int hour;
	private int minute;
	private int seconds;
	double totalSeconds;
	//constructor
	public Clok() {
		this.hour = 3;
		this.minute = 45;
		this.seconds = 16;
	}//end constructor
		public Clok(int hour, int minute, int seconds) {
		this.hour = hour;
		this.minute = minute;
		this.seconds = seconds;
	}//end constructor
		//making the setter
		public void setTime(int hour, int minute, int seconds) {
			this.hour = hour;
			this.minute = minute;
			this.seconds = seconds;
		}//ending setter
		//making the getter
		public int gethour() {
			return hour;
		}//end getter
		//to String
		//starting the total seconds thing
		public double totalSeconds() {
		   double  totalSeconds = ((hour*3600) + (minute*60) + seconds);//remember the this.
			return totalSeconds;
		}//end getter total seconds
	public String toString() {
		String Output;
		Output =  "The Clock Time is " + hour + ":" + minute + ":" + seconds + "\nTotal Seconds: ";
		return Output;
	}//end toString
}//end song main
//end of code

public class AlarmSet {

private int hours;
private int minutes;
private int seconds;
private boolean amPm;

String day = "";

public AlarmSet() {
	this.hours = 0;
	this.minutes = 00;
	this.seconds = 00;
	this.amPm = false;
}//0 arg constructor

public AlarmSet(int hours, int minutes, int seconds, boolean amPm) {
	this.hours = hours;
	this.minutes = minutes;
	this.seconds = seconds;
	this.amPm = amPm;
}//4 arg constructor

public String toString() {
	if (amPm = false) {
		day = "pm";
	}//end if statement 
	else {
		day = "am";
	}//end else statement
	String output;
	output = "Your Alarm is set for " + hours + ":" + minutes + ":" + seconds + " " + day;
	return output;
}//end toString
	
}//end main class

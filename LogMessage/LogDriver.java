//start of driver
import java.util.ArrayList;
import java.util.List;
public class LogDriver {
public static void main (String[] args) {
	String newKeyword = "disk";
	ArrayList <LogMessage> logDump = new  ArrayList <LogMessage>();
	
	logDump.add(new LogMessage("CLIENT3:security alert - repeated login failures"));    //add more to test 
	logDump.add(new LogMessage("Webserver:disk offline"));
	logDump.add(new LogMessage("SERVER1:file not found"));
	logDump.add(new LogMessage("SERVER2:read error on disk DSK1"));
	logDump.add(new LogMessage("SERVER1:write error on disk DSK2"));
	logDump.add(new LogMessage("Webserver:error on /dev/disk"));
	
	SystemLog theLog = new SystemLog(logDump);//
	
	ArrayList<LogMessage> returned = (ArrayList<LogMessage>) theLog.removeMessages(newKeyword);  //newkeyword = disk
	
	System.out.println("-Including keyword-");
	for(LogMessage  removed  : returned) {		//AP test uses for- each loop extensively 
		System.out.println(removed);		//prints the ones with disk prop
	}//end for loop
	
	
	System.out.println("\n" + "\n-Not including keyword-");
	
	for(LogMessage left : logDump) {		//biggest main thing it does is print a whole array 
		System.out.println(left);		//prints the ones w/o disk properly
	}//end for each loop	
	
}//end of static 
}//end of driver
//end of code
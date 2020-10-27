import java.util.ArrayList;
import java.util.List;		//asl diff between List & ArrayList later 
public class SystemLog {  //class needs constructor & toStrin() 

	private List<LogMessage> messageList;
	
	public  SystemLog(List<LogMessage> messageList) {		//0 arg con    ///
		this.messageList = messageList;
	}//end constructor ??
	
	public List<LogMessage> removeMessages(String keyword) { //remove from message list
		List<LogMessage> removed = new ArrayList<LogMessage>();		//go back to driver and do this to that
		for(int i = 0; i < messageList.size(); i++) {
			if(messageList.get(i).containsWord(keyword)) {	//checks if something is in the mesage, try doing this for LogMessage posibly 
				removed.add(messageList.remove(i));  //maybe change to get(i) incase it still doesnt work 
				i--;
			}//end if statement
			
		}//end first? for loop
		return removed;
	}//end list 
	
	public String toString() {
		String output = "";		//print list?
		for(int i = 0; i < messageList.size(); i++) {
			output += messageList.get(i);
		}//end for loop
		return output;
	}//end toString()
	
}//end of this class

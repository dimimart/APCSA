//start of main class						,,, remember to do toString() 
public class LogMessage { //dont delete stuff cause u dont wanna rewrite anything like the last assignment lol
private String machineId;
private String description;
String mess;		

public LogMessage(String message) { //break up string from 0-:
	mess = message;
	int colonSpaces = message.indexOf(":");
	this.machineId = message.substring(0, colonSpaces);//creates parameter for that certain part of message,,, check in a separate class if this could work??
	this.description = message.substring(colonSpaces + 1); 	
}//end public message


public boolean containsWord(String keyword) {
//	keyword = "disk";	
	int dl = description.length();
	int kl = keyword.length();
	int r = dl - kl - 1;		//makes sure we find the right index!!
	boolean check = false;
	//boolean dlkl = true;
	if(dl > kl) {
		if((description.substring(r).equals(" " + keyword))) { //checks if keyword is the last word
			check = true;
			return check;
		}//end second if 
	}//end first? if statement			//make these sep 
	if(description.equals(keyword)) {		//makes sure it meets all of the requirements
		check = true;
		return check;
	}//end first third? statement
	if(description.indexOf(" " + keyword + " ") != -1) {  //gonna check if its in between words 
		check = true;
		return check;
	}//enbd if 
	if(description.indexOf(keyword + " ") == 0) {     
		check = true;
		return check;
	}//end if 
	else {
		check = false;
		return check;
	}//end else statement
	}//end public boolean

public String getMachineId() {
	return machineId;
}//return getter machineId

public String getDescription() {
	return description;
}//end getter description

	
public String toString() {  //according to instructions, class MUST USE toString() 
	//print out instance variables 		
	String output =  getMachineId() + ":" + getDescription();
	return output;
}//end public to string
}//end of main class

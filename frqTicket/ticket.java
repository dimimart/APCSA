package frqTicket;
public abstract class ticket {
	private int serialNumber;//unique ticket id number
	public ticket() {
		serialNumber = getNextSerialNumber();
	}//end 0 arg
	public abstract int getPrice();//returns price for this ticket
	public String toString() {//returns a string w/ info about the ticket
		return "Number: " + serialNumber + "\nPrice: " + getPrice();
	}//end toString
	private static int getNextSerialNumber() {
		//trying out new things to decrease the amount of lines one writes 
		return (100 + (int)(Math.random() * ((999 - 100) + 1)));
	}//end method
}//end of class

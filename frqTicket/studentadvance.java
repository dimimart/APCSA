package frqTicket;
public class studentadvance extends ticket{
	private int price;
	public studentadvance() {
		super();
		price = 0;
	}//end con 
	public studentadvance(int days) {
		if(days >=10) price = 15;
		if(days <=9) price = 20;
	}//end arg con
	public int getPrice() {
		return price;
	}//end getter
	public String toString() {
		return super.toString() +  "\n(student ID required)";
	}//end toString
}//end class

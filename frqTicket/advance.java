package frqTicket;
public class advance extends ticket {
	private int price;
	public advance() {
		super();
		price = 0;
	}//end con 
	public advance(int days) {
		if(days >=10) price = 30;
		if(days <=9) price = 40;
	}//end arg con
	public int getPrice() {
		return price;
	}//end getter
}//end class

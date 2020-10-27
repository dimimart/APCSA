
public class drink implements frqLunch {

	private String name;
	private double price;
	
	public drink(String name, double price) {
		this.name = name;
		this.price = price;
	}//end con
	
	public drink() {
		this.name = name;
		this.price = price;
	}//end con
	
	public String getName() {
		return name;
	}//end getter
	
	public double getPrice() {
		return price;
	}//end getter
	
	public String toString() {
		return getName() + ";" + getPrice();
	}//end toString
	
}//end class

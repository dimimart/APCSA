//beg of code
package Telii;
public class Telii {

	private int cost;
	private String carrier;
	private String memory;
	private String color;
	
	public Telii() {
		this.cost = 430;
		this.carrier = "Verizon";
		this.memory = "46 GB";
		this.color = "red";
	}//end first pub
	
	public String toString() {
		String output;
		output = "This iPhone Cost " + cost + " dollars, through the carrier " + carrier + " , and has " + memory + " of memory, and is the color " + color + ".";
		return output;
	}//end sec pub toString
	
}//end class
//end code
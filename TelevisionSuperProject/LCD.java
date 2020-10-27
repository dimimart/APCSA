
public class LCD extends TelevisionSuper{
	private static String modelo = "LCD ";
	public LCD() {
	super();
	modelo = modelo;;
}//end 0 arg
public LCD(String model, double price) {
	super(modelo + model, price);
}//end 2 arg con
public String toString() {
	String output = super.toString();
	return output;
}//end to string
}//end plasma class

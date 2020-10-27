package MyTV;
public class MyTV {
//dont use main
	//instance variables
	//instance variables must always be first
	private int ScreenSize;//private prevents changes from outside of the code
	private String brand;
	//constructor 
	public MyTV(int ScreenSize, String brand) {           // public NAME OF CLASS() { }
		ScreenSize = 60;
		brand = "Samsung";//must use "quotes"
	}//end CONSTRUCTOR public
	//starting getter
	public int getScreenSize() { //Doesn't need get, methods could be named 
								//BUT No one will know what you're talking about, 
							    //so name it whatever you want
		return ScreenSize;
	}//ending getter
	public String getBrand() {
		return brand;          //every getter is only good for ONE variable, and ONE variable only
	}//ending another getter
	//order of setter and getter doesn't matter, but it doesn't matter
	public void setScreenSize (int ScreenSize) {
		this.ScreenSize = ScreenSize;  //setter overwrites constructor
	}//ending setter
	public void setBrand(String brand) {
		this.brand = brand;
	}//ending setter
	//toString
	//to string should always be last
	public String toString() {
		String output;
		output = "This is a " + brand + "with a " + ScreenSize + " inch screen";//Can't print from constructor
		return output;
	}//end toString 
}//end public class
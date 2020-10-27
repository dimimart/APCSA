//beg of code
package Car;
public class Car {
	//instance variables
	private String model;
	private String brand;
	private int year;
	private int price;
	//constructor
	public Car() {
		this.model = "Bel Air";
		this.brand = "Chevrolet";
		this.year = 1957;
		this.price = 250000;
	}//end constructor 
	public Car (String model, String brand, int year, int price) {
		this.model = model;
		this.brand = brand;
		this.year = year;
		this.price = price;
	}//end constructor
		//to String
	public String toString() {
		String Output;
		Output =  "Model: " + model + "\nBrand: " + brand + "\nYear: " + year + "\nPrice: " + price;
		return Output;
	}//end toString
}//end song main
//end of code
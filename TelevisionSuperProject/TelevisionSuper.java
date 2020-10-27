public class TelevisionSuper {
//Create a Television class with instance variables for model and price, a 
//zero argument and 2 argument constructor, getters and setters for both variables, and a toString. 
private String model;
private double price;
public TelevisionSuper() {
	this.model = "Sony";
	this.price = 599.99;
}//end 0 arg
public TelevisionSuper(String model, double price) {
	this.model = model;
	this.price = price;
}//end 2 arg
public String getModel() {
	return model;
}//end getter for model
public double getPrice() {
	return price;
}//end getter for price
public void setModel(String newModel) {
	model = newModel;
}//end setter for model
public void setPrice(double newPrice) {
	price = newPrice;
}//end setter for price
public String toString() {
	String output = "The Model of this tv is: " + model + "          Price: " + price;
	return output;
}//end toString()
}//end television superclass

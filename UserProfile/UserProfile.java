//beg of code
package UserProfile;
public class UserProfile {
	//instance variables
	private String name;
	private String password;
	private int phone;
	private int age;
	//constructor
	public UserProfile() {
		this.name = "Diana Martinez";
		this.password = "kanye";
		this.phone = 87654;
		this.age = 16;
	}//end constructor 
	public UserProfile (String name, String password, int phone, int age) {
		this.name = name;
		this.password = password;
		this.phone = phone;
		this.age = age;
	}//end constructor
		//to String
	public String toString() {
		String Output;
		Output =  "Name: " + name + " " + "\nPassword: " + password + "\nPhone Number: " + phone + "\nage: " +age;
		return Output;
	}//end toString
}//end user main
//end of code
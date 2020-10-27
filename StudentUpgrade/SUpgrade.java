//beg of code
package Supgrade;
public class SUpgrade {
	//instance variables
	private String firstName;
	private String lastName;
	private double[] grades = {4.00, 3.70, 3.30, 3.00, 3.90, 3.70};
	private String[] classes = {"English", "Math", "Science", "Social Science", "Foreign Language", "Elective"};
	//constructor
	
	public SUpgrade() {
		this.firstName = "Diana";
		this.lastName = " Martinez";
	}//end constructor
	
	public SUpgrade (String firstName, String lastName, double[] grades) {
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.grades = grades;
	}//end constructor
	
	public double calcGPA() {
		double num = 0.0;
		for (int i = 0; i < grades.length; i++) {
			num = num + grades[i];
		}//ending for loop
		double calc = num / grades.length;
		return calc;
	}//end getter?

	//creating setter
	/*public void setBrand(String brand) {
		this.brand = brand;
	}//ending setter*/

	public void setMath(double[] grades) {
		this.grades[1] = grades[1];
	}//ending setter
	//starting getter 
	/*public String getBrand() {
		return brand;          //every getter is only good for ONE variable, and ONE variable only
	}//ending another getter*/
	public double getMath() {
		this.grades[1] = 4.0;
		return grades[1];
	}//ending getter
	
		//to String
	public String toString() {
		String Output;
		Output =  "\nStudent : " + firstName + lastName + "\nCumulative GPA: "  + calcGPA() + "\nMath Grade: " + grades[1];
		return Output;
	}//end toString

}//end song main
//end of code

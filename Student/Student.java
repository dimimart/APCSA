//beg of code
package Student;
public class Student {
	//instance variables
	private String firstName;
	private String lastName;
	private int phoneN;
	private int grade;
	//constructor
	public Student() {
		this.firstName = "Diana";
		this.lastName = "Martinez";
		this.phoneN = 12345;
		this.grade = 98;
	}//end constructor 
	public Student (String firstName, String lastName, int phoneN, int grade) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneN = phoneN;
		this.grade = grade;
	}//end constructor
		//to String
	public String toString() {
		String Output;
		Output =  "Name: " + firstName + " " + lastName + "\nPhone Number: " + phoneN + "\nGrade: " +grade;
		return Output;
	}//end toString
}//end song main
//end of code
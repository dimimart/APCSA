//beg of main code
package StudentOverallGrade;
public class StudentOverallGrade {
	//instance variables
		private String firstName;
		private String lastName;
		private double[] grades = {4.00, 3.70, 3.30, 3.00, 3.90, 3.70};
		private String[] classes = {"English", "Math", "Science", "Social Science", "Foreign Language", "Elective"};
		//constructor
		
		public StudentOverallGrade() {
			this.firstName = "Diana";
			this.lastName = " Martinez";
		}//end constructor
		
		public StudentOverallGrade (String firstName, String lastName, double[] grades) {
			
			this.firstName = firstName;
			this.lastName = lastName;
			this.grades = grades;
		}//end constructor
		
		public double calcGPA() {
			double num = 0.0;
			for (int i = 0; i < grades.length; i++) {
				num = num + grades[i];
			}//ending for loop
			double calc = num % grades.length;
			return calc;
		}//end getter?

		//creating setter
		/*public void setBrand(String brand) {
			this.brand = brand;
		}//ending setter*/
		public void setmathGPA(double[] grades) {
			this.grades[1] = grades[1];
		}//ending setter 
		public void setMath(double[] grades) {
			this.grades[1] = 4.0;
		}
		//starting getter 
		/*public String getBrand() {
			return brand;          //every getter is only good for ONE variable, and ONE variable only
		}//ending another getter*/
		public double getmathGPA() {
			return grades[1];
		}//ending getter
		public double getmath() {
			return grades[1];
		}//ending getter
		
		public String getGrade() {
			if (calcGPA() >= 4.00) {
				String A = "A";
				return A;
			}//end if loop
			else if (calcGPA() >= 3.00) {
				String B = "B";
				return B;
			}//end if loop
			else if (calcGPA() >= 2.00) {
				String C = "C";
				return C;
			}//end if loop 
			else if (calcGPA() >= 1.00) {
				String D = "D";
				return D;
			}//end if loop 
			else {
				String F = "F";
				return F;
			}//end else
		}//ending getter
			//to String
		public String toString() {
			String Output;
			Output =  "Student : " + firstName + lastName + "\nCumulative GPA: " + calcGPA() + "\nLetter Grade: " + getGrade();
			return Output;
		}//end string
}//end of class
//end of main code
//start of driver
public class ClassDriver {
public static void main (String[] args) {
	
	int year = 11;
	ClassRoster Andrew = new ClassRoster(); //student object is Andrew
	System .out.println("Original List: \n" + Andrew);
	System.out.println("\nCut off year: " + year + "\nStudent with MAX GPA: " + Andrew.studentWithMaxGPA() + "\nNumber of students removed: " + Andrew.dropStudent(year));
	Andrew.addStudent(new Student("Andrew", "Dresel", 12, 2.0, 4.0, 2.0, 2.0, 2.0));
	
	System.out.println("\nStudent List: " +Andrew);
	
}//end static 
}//end of driver class
//end of main code 

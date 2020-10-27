import java.util.ArrayList;
public class ClassRoster {
	//List<Student> removed = new ArrayList<Student>();	
	String courseName;
	String lastN;
	ArrayList <Student> studentNames = new  ArrayList <Student>();
	//ArrayList <Student> newStudent = new  ArrayList <Student>();
	Student newStuden;
	int dropStudent;
	//private boolean newStudent;
	
	public ClassRoster() {
		
		this.studentNames.add(new Student("Camila", "Fernandez", 12, 3.0, 4.0, 3.0, 3.0, 3.0));
		this.studentNames.add(new Student("James", "Kocher", 11, 4.0, 4.0, 4.0, 4.0, 4.0));
		this.studentNames.add(new Student("PJ", "Smith", 12, 1.0, 1.0, 1.0, 4.0, 1.0));
		this.studentNames.add(new Student("Maya", "Zeevi", 10, 2.0, 2.0, 3.0, 1.0, 1.0));
		this.studentNames.add(new Student("Theophilus", "Theryan", 12, 2.0, 4.0, 2.0, 2.0, 2.0));
	}//end constructor 
	
	public String studentWithMaxGPA() {  //returns last name 
		if(studentNames.get(0).calcGPA() >  studentNames.get(1).calcGPA() && studentNames.get(0).calcGPA() >  studentNames.get(2).calcGPA() && studentNames.get(0).calcGPA() >  studentNames.get(3).calcGPA() && studentNames.get(0).calcGPA() >  studentNames.get(4).calcGPA()) {
				lastN = studentNames.get(0).getLastName();
			}//end if
		if(studentNames.get(1).calcGPA() >  studentNames.get(0).calcGPA() && studentNames.get(1).calcGPA() >  studentNames.get(2).calcGPA() && studentNames.get(1).calcGPA() >  studentNames.get(3).calcGPA() && studentNames.get(1).calcGPA() >  studentNames.get(4).calcGPA()) {
			lastN = studentNames.get(1).getLastName();
		}//end if
		if(studentNames.get(2).calcGPA() >  studentNames.get(0).calcGPA() && studentNames.get(2).calcGPA() >  studentNames.get(1).calcGPA() && studentNames.get(2).calcGPA() >  studentNames.get(3).calcGPA() && studentNames.get(2).calcGPA() >  studentNames.get(4).calcGPA()) {
			lastN = studentNames.get(0).getLastName();
		}//end if
		if(studentNames.get(3).calcGPA() >  studentNames.get(1).calcGPA() && studentNames.get(3).calcGPA() >  studentNames.get(2).calcGPA() && studentNames.get(3).calcGPA() >  studentNames.get(0).calcGPA() && studentNames.get(3).calcGPA() >  studentNames.get(4).calcGPA()) {
			lastN = studentNames.get(0).getLastName();
		}//end if
		if(studentNames.get(4).calcGPA() >  studentNames.get(1).calcGPA() && studentNames.get(4).calcGPA() >  studentNames.get(2).calcGPA() && studentNames.get(4).calcGPA() >  studentNames.get(3).calcGPA() && studentNames.get(4).calcGPA() >  studentNames.get(0).calcGPA()) {
			lastN = studentNames.get(0).getLastName();
		}//end if
			return lastN;
	}//end method
	
	public int dropStudent( int minGradeLevel ) {
		dropStudent = 0;
		for(int i = 0; i < studentNames.size(); i++) {
			if(studentNames.get(i).getGradeLevel() < minGradeLevel) {
				dropStudent = dropStudent + 1;
				studentNames.remove(i);
				i--;
			}//end if statement 
		}//end for loop
		return dropStudent;
	}//end method 
	
	public void addStudent(Student newStudent) {
		this.studentNames.add(newStudent);
	}//end method
	
	public String toString() {
		String output = "";		//print list?
		for(int i = 0; i < studentNames.size(); i++) {
			output += studentNames.get(i);
		}//end for loop
		return output;
	}//end toString()
	
}//end classroster

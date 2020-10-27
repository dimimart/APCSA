package studentFRQ;
//make this super duper basic cause SeatingChart is the important one 
public class Student {
	private String name;
	private int absenceCount;
	public Student(String name, int absenceCount) {
		this.name = name;
		this.absenceCount = absenceCount;
	}//end 0arg
	public String getName() {
		return name;
	}//end method 
	public int getAbsenceCount() {
		return absenceCount;
	}//end method 
	public String toString() {
		String output = name + " " + absenceCount + "; ";
		return output;
	}//end toString
}//end class

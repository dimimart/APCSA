package studentFRQ;
import java.util.List;
public class SeatingChart {
	private Student[][] seats, listy;
	public SeatingChart(List<Student> studentList, int rows, int cols){ 
		this.seats = new Student[rows][cols];
		this.listy = new Student[rows][cols];
		int kk=0;
		for (int col = 0; col < cols; col++){//dont get mixed up w/ cols vs col
			for (int row = 0; row < rows; row++){
				if (kk < studentList.size()){
					seats[row][col] = studentList.get(kk);
					listy[row][col] = studentList.get(kk);
					kk++; 
				}// end first if
			} //end second for
		}//end first for
	}//end method
	public int removeAbsentStudents(int allowedAbsences){ //try to actually use "allowedAbsences" instead of copying it into another int or something
		int count = 0;
		for (int row=0; row < seats.length; row++){
			for (int col=0; col < seats[0].length; col++){ 
				if ((seats[row][col] != null) && (seats[row][col].getAbsenceCount() > allowedAbsences)){ 
					seats[row][col]=null;
					count++;
				} //end first if 
			}//end second for 
		}//end first for 
		return count; 
	}//end method
	public String toString() {
		String output = "New List:\n";
		for(Student[] student : seats) {
			for(Student studenty : student) {
				output += studenty + " ";
			}//end for 
			output += "\n";
		}//end for 
		output+="\nOriginal List:\n";
		for(Student[] stud : listy) {
			for(Student stude : stud) {
				output += stude + " ";
			}//end for 
			output += "\n";
		}//end for 
		return output;
	}//end tostring
}//end class

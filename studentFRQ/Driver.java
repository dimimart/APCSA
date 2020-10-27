package studentFRQ;
//STUDENT & SEATING CHART
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
public class Driver {
public static void main(String[] args) {
	List<Student> studentList = new ArrayList<Student>();
	studentList.add(new Student("Karen", 3));
	studentList.add(new Student("Paul", 4));
	studentList.add(new Student("Lester", 1));
	studentList.add(new Student("Henry", 5));
	studentList.add(new Student("Renee", 9));
	studentList.add(new Student("Glen", 2));
	studentList.add(new Student("Fran", 6));
	studentList.add(new Student("David", 1));
	studentList.add(new Student("Danny", 3));
	int rows = Integer.parseInt(JOptionPane.showInputDialog("Enter how many rows you want"));
	int cols = Integer.parseInt(JOptionPane.showInputDialog("Enter how many cols you want"));
	SeatingChart object = new SeatingChart(studentList, rows, cols);
	int removed = object.removeAbsentStudents(4);
	System.out.println("Number of removed students: " + removed + "\n\nSeating Chart:");
	System.out.print(object);//DONT DO PRINTLN CAUSE ITS A DOUBLE ARRAY AND IT WONT WORK 
}//end static 
}//end class

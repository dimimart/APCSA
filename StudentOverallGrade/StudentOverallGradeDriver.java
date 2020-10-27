//beg of driver code
package StudentOverallGrade;
public class StudentOverallGradeDriver {
public static void main (String[] args) {
	 StudentOverallGrade junior = new StudentOverallGrade();
	 System.out.println(junior);
	 StudentOverallGrade senior = new StudentOverallGrade("Master", " Yoda", new double[]{2.5, 3.0, 3.5, 4.0, 3.5, 4.0} );
	 System.out.println(senior);
	 
}//end static void main string args 
}//end of main class
//end of driver
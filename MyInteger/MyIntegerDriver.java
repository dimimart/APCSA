


//beg of Driver
package MyInteger;
import javax.swing.JOptionPane;
public class MyIntegerDriver {
public static void main (String[] args) { //if parsing in one line doesnt work, do it the reg way
	int request = Integer.parseInt(JOptionPane.showInputDialog("Enter an integer"));
	MyInteger obj = new MyInteger(request);
	//remember what davis said, order MATTERS
	System.out.print(obj);
	//obj.getNum(request);
	int summy = obj.calculateSum();
	System.out.println("\nThe sum of the integers of nums is " + summy);
}//end of static
}//end of class
//end of driver code
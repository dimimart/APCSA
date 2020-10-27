//beg of code
package Clok;
import javax.swing.JOptionPane;
public class ClokDriver {
	public static void main(String[] args) {
		//jop
		String HOUR = JOptionPane.showInputDialog("Type in the hour:");
		int hour = Integer.parseInt(HOUR);
		String MINUTE = JOptionPane.showInputDialog("Type in the minutes:");
		int minute = Integer.parseInt(MINUTE);
		String SECONDS = JOptionPane.showInputDialog("Type in the seconds:");
		int seconds = Integer.parseInt(SECONDS);

		Clok kitchenClock = new Clok();
		System.out.println(kitchenClock);
		Clok bedroomClock = new Clok(hour, minute, seconds);
		//System.out.println("The bedroomClock time is " + hour + ":" + minute + ":" + seconds);

		kitchenClock.setTime(hour, minute, seconds);
		int hr = kitchenClock.gethour();
		

		double sec = kitchenClock.totalSeconds();
		System.out.println(sec);
		System.out.println("The kitchen HR is:" + hr);
		System.out.println("The bedroomClock time is " + hour + ":" + minute + ":" + seconds);
	}//end public static void
}//end of class
//end of code

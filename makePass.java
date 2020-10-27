package makePass;
import javax.swing.JOptionPane;
public class makePass {
public static void main (String[] args) {//while working on this, think of using a boolean or something
																					//just something to think about
	String password = JOptionPane.showInputDialog("Enter password.");
	boolean correct = false;
	
		while(correct == false){
			if(password.length() >= 6){
				boolean accept = false; 
				for(int i = 0; i < password.length(); i++){
					if(password.substring(i, i + 1).equals("/") || password.substring(i, i + 1).equals("*") || password.substring(i, i + 1).equals("@") || password.substring(i, i + 1).equals("~") || password.substring(i, i + 1).equals("-")) {
						accept = true;
					}//end if statement  perf sc
				}//end for loop
				
				if(accept == true) {
					System.out.println("correct");
					correct = true;
				}//end if 	
					else if(accept == false) {
						System.out.println("wrong");
						password = JOptionPane.showInputDialog("Enter password.");
					}//end if statement 
		
			}//endif loop
		else{
				System.out.println("wrong");
				password = JOptionPane.showInputDialog("Enter password.");
			}//end else statement 
	}//end while 
}//end static
}//end of class
//end of code

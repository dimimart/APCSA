import javax.swing.JOptionPane;
public class PasswordCreator { 
	 public static void main(String[] args) {
	String lastName = JOptionPane.showInputDialog("Enter your last name");
	String proposedPass = JOptionPane.showInputDialog("Enter your proposed password. It must have at least 6 characters, "
			+ "and have at least one Alphanumerical number");
	String last = lastName.toLowerCase();
	boolean correct = false;
	while(correct == false){
		String password = proposedPass.toLowerCase();
		if(password.length() >= 6){
			boolean accept = false; 
			for(int i = 0; i < password.length(); i++){ //maybe not in this code, but maybe in the future try to use char instead of checking one by one if tis is equal to the other 
				if((password.substring(i, i + 1).equals("/") || password.substring(i, i + 1).equals("*") || password.substring(i, i + 1)
						.equals("@") || password.substring(i, i + 1).equals("~") || password.substring(i, i + 1).equals("-")) && (!password.contains(last))) {
					accept = true;
					break;
				}//end if statement  perf sc
			}//end for loop
			if(accept == true) {
				System.out.println("correct");
				correct = true;
			}//end if 	
				else if(accept == false) {
					System.out.println("wrong");
					password = JOptionPane.showInputDialog("Enter a good password.");
				}//end if statement 
		}//end if statement
	else{
			System.out.println("wrong");
			proposedPass = JOptionPane.showInputDialog("Enter a good password.");
		}//end else statement 
}//end while 
}//end static 
}//end class

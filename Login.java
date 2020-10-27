//beginning of code
import javax.swing.JOptionPane;
public class Login {
	public static void main(String[] args) {
		
		String username = "kanye";
		int password = 1234;
		
		String userInput = JOptionPane.showInputDialog("Type the Username");
		
		if (userInput.equals(username)) {
			String passwordInput = JOptionPane.showInputDialog("Type the Password");
			int passwordInputDos = Integer.parseInt(passwordInput);
			
			if (passwordInputDos == password) {
				System.out.println("Congrats you logged in!");
			}//end second if
			
			if (passwordInputDos != password) {
				System.out.println("Login Unsuccessful. Try again");
			}//end third if
			
		}//end first if 
		
		else {
			System.out.println("Your username is wrong! Try again!");
		}//end else 
		
	}//end public static void main arg string
}//public class
//end of code
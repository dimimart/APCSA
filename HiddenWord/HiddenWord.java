//start of code
public class HiddenWord {
	private String word;
	
		public HiddenWord(String letterLook) {		//the word is gonna be made in the druver 
			this.word = letterLook;
	}//end 1 arg
		
	public String getHint(String Guess) {		//guess is going to be made with driver & joption pane
		String letter = Guess; //again, its going to the driver 
		String hint = "";  //cant set it to null, so gotta do this 
		for(int i = 0; i < letter.length(); i++) {
			
			if (letter.substring(i,i+1).equals(word.substring(i,i+1))){	//checks if the letter is in the exact position
                hint += letter.substring(i,i+1);
			} //end if statement 		//CHECK THE LAST CODE, IT HELPS A LOT WITH THE INDEXOF STUFF
			
			else if (word.indexOf(letter.substring(i,i+1))!= -1){	//checks if the letter is in the word
                hint += "+";  //not just for ints!! look at the book sofia told u to buy... 
			} //end else if statement
			
			else {
            hint += "*"; 	//if not in the word
			}//end else statement
		}//end for loop
		return hint;
	}//end getter
	
	//no toString needed here 
	
}//end of class

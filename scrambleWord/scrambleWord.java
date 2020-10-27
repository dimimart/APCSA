package scrambleWord;
import java.util.List;
public class scrambleWord {
	private static String resul;//make all of these static or else it wont work and that sucks 
	private static List<String> listy;
	public static String scram(String word)  {
		String result = "";
		 int index = 0; //try to actually use index instead of i cause thats BAD Programming habits !!
		 while (index < word.length()-1){
			 if ((word.substring(index,index+1).equals("A")) && (!word.substring(index+1,index+2).equals("A"))){
				 result += word.substring(index+1,index+2); 
				 result += "A";
				 index += 2;//skips every 2 letters, at least it should!!
			 }//end if 
			 else {
				 result += word.substring(index,index+1);
				 index++; 
			 }//end else
		 }//end while?
		 if (index < word.length()){
			 result += word.substring(index); 
		 }//end if 
		 resul = result;
		 return resul;
	}//end method 

	 public static List<String> scrambleOrRemove(List<String> wordList)  {
		 //play around with index and stuff, maybe it will help to keep short and concise code 
		 int i = 0;//same thing as previous one 
		 while ( i < wordList.size() ){//breaks once i is greater than wordList
			 String word = wordList.get(i); 
			 String scrambled = scram(word); 
			 if ( word.equals(scrambled) ){
				 wordList.remove(i); 
			 }//end if
			 else { 
				 wordList.set(i,scrambled); 
				 i++;
			 } //end else
		 }//end while
		 listy = wordList;
		 return listy;
	 }//end method 
}//end class

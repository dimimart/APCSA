package stringMethods;
public class stringMethods {
public static void main(String[] args){
	String ex = "Computer";
	//computer
	//012345
	System.out.println("Computer has " + ex.length() + " letters");
	System.out.println(ex.substring(3));//prints p
	System.out.println(ex.substring(3, 6));//6 is exclusive, doesnt get e
	System.out.println(ex.indexOf("put"));
	System.out.println(ex.compareTo("Apple"));//K Sensitive
	//prints out two because it is the distance between Apple and Computer 
	System.out.println(ex);
	System.out.println(ex.trim());//cuts of spaces, nothing in between, only looks in beginning and end
	System.out.println(ex.toLowerCase());//changes everything lowercase
}//end static
}//end class
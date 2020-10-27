//beg of code
package ArrayCalculator;
public class ArrayCalculatorDriver {
public static void main (String[] args) {
	int[] list = {97 , 85 , 88 , 62};//way to initialize an array
	//you can do strings and all of that with this
	//faster way to hard code, you can ONLY do it on the driver
	//
	//creating an object
	ArrayCalculator calculationList = new ArrayCalculator(list);
	calculationList.calcADD();
	System.out.println(calculationList.calcADD());
	//length can change depending on what you feed it 
	//
	//isn't lesson for today, just review for unit 2
	//go back to main code to see REAL notes
}//end static 
}//end class
//end driver
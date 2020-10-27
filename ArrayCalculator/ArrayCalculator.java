//beg of code
package ArrayCalculator;
public class ArrayCalculator {
	private int[] numList = new int[4];
	//public ArrayCalculator() {
		//skip 0 argument constructor for time --meaning didn't have time for notes
	//}//end constructor
	public ArrayCalculator(int[] numList) {
		//two different ways of doing stuff down below
		this.numList = numList;//there is a catch to this, because it is 
		//easy, takes a bit of work to wrap your brain around, hard concept
		//in this case, were not making a copy of the array, we are using it directly (from the driver) 
		//any changes we make will affect original data
		//you can make a for loop inside constructor to copy data 
	}//end constructor
	//
	//REAL NOTES FOR TODAY--read driver to get what i mean
	public int calcADD() {//could have argument, but you dont need it 
		int sum = 0;
		for (int index = 0; index < numList.length; index++) {
			sum += numList[index];
			//calc divide gives you doubles
			//must be put into double form or something
			//in an integer or whatever, it will add to itself		
		}//end for loop
		return sum;
	}//end public integer
	//
	public String toString() {
		//printing the following needs to come out in a single line
		//must use for loop 
		String output = "The number in the list are: ";
		//needs some place to put it
		for (int index = 0; index < numList.length; index++) {
			output+= numList[index] + ", ";
					//"Concatenate" i don't know if its spelled right, means that whatever i put after this will make string longer
		}//END FOR 
		return output;
		//you can use getter and setters but you don't have to
	}//end to string
}//end class
//end code
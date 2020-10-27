//beg of main code
package MyInteger;
public class MyInteger {
	private int num;
	int sum = 0;
	public MyInteger(int num) {
		this.num = num;
	}//end of public
	/*public MyInteger(int num) {
		this.num = 2;
	}//end of construtor?*/
	/*public MyInteger() {
		this.num = num;
	}//end of public*/
	public int getNum(int request) {
		return num;
	}//end get num
	public int calculateSum() {
						//DONT DO NUM.LENGTH CAUSE ITS AN INT
		//use a while loop not a for loop
		while(num != 0) {
			sum = sum + num % 10;
			num = num / 10;
		}//end of for 
		return sum;
	}//end of calculateSum
	public String toString() {			//must print sum in driver
		String output = "The value of num is " + num;
		return output;
	}//end of string
}//end of class
//end of main code
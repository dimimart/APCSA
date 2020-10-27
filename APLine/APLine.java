//beg of main code
public class APLine {
	private int a;
	private int b;
	private int c;
	double slope = 0;
	boolean True;
	boolean False;
	public APLine() {
		this.a = 5;
		this.b = 4;
		this.c = 17;
	}//end of public
	public APLine(int a, int b, int c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}//end of APLine
	public double getSlope() {
		slope = -a / b;//needed to fix slope 
		return slope;
	}//end of getter
	public boolean isOnLine(int i, int k) {
		if((a*5) + (b*-2) + c == 0) {
			True = true;
		}//end of for loop
		if((a*5) + (b*-2) + c != 0) {
			True = false;
		}//end else loop
		return True;
	}//end of setter?
	public String toString() {
		String Output = "\na = " + a + "\nb = " + b + "\nc = " + c + "\nslope = " + slope + "\nIs the point on the line? " + True;
		return Output;
	}//end of string
}//end of class
//end of code

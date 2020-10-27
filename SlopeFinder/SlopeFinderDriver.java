//beg of driver
package SlopeFinder;
public class SlopeFinderDriver {
public static void main (String[] args) {
	int y1 = 2;
	int y2 = 4;
	int x1 = 1;
	int x2 = 9;
	double slope = SlopeFinder.find(y1, y2, x1, x2);
	System.out.println(slope);
}//end static
}//end class
//end code
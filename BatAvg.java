//beg of code
public class BatAvg {
public static void main(String[] args) {
	double[] bats = new double[9];
	for (int i = 0; i < bats.length; i++) {
		bats[i] = ((double)(Math.floor((Math.random()*0.500)*1000))/1000);
	}//end for loop
	for(int i = 0; i < bats.length; i++) {
		System.out.println(bats[i]);
	}//end for 
	double maxbatty = 0; 
	for(double index = 0; index<bats.length; index++) {
		if(bats[(int)index] > maxbatty) {
			maxbatty = bats[(int)index];
		}//end if loop
	}//end fr 
	System.out.println("The max batting avg is " + maxbatty);
}//end static void
}//end of class
//end of code

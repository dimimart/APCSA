//television driver 
import java.util.ArrayList;
public class AnalogDigitalDriver {
public static void main (String[] args) {
	
	ArrayList<Television> array = new ArrayList<Television>();
	
	BWTV bwtv = new BWTV("I'm a black and white TV...", false);
	HDTV hdtv = new HDTV("I'm a High Def 24 million color TV", false);
	
	array.add(bwtv);
	array.add(hdtv);
	
	for(Television object : array) {
		System.out.println(object);
	}//end for each loop
	
	for(int i = 0; i < array.size(); i++) {
		array.get(i).settvON(true);
	}//end for loop
	
	System.out.print("\n");
	
	for(Television object : array) {
		System.out.println(object);
	}//end for each loop
	
	System.out.println(bwtv.rotateRabbitEars() + "\n" + hdtv.connectHDMI());
	
}//end static 
}//end class

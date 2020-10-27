
public class SmartwatchOne extends PortableDevices{
private String[][] array;
private String name;
int row = 8;
public SmartwatchOne() {//col, then row
	super();
	name = "";
}//end con
public SmartwatchOne(String nombre) {
	name = nombre;
	array = new String[row][1];
	array[0][0] = nombre;
	array[1][0] = "Operating System 	Compatibility Android";
	array[2][0] = "Touch Sceen 		Yes";
	array[3][0] = "Internal Memory		4 gigabytes";
	array[4][0] = "Water Resistant 	Yes";
	array[5][0] = "Operating System 	Tizen";
	array[6][0] = "Body Metrics 		Measured Heart Rate";
	array[7][0] = "Band Material 		Other";
}//end con
public int returnRow() {
	return row;
}
public String[][] returnArray(){
	return array;
}//end getter
public String getName() {
	return name;
}//end toString 
public void printSmartwatchOne() {
	String output = super.toString();
	for(String[] object : array) {
		for(String something: object) {
			output += something;
		}//end for 
		output += "\n";
	}//end for 
	System.out.print(output);
}//end toString 
}//end class

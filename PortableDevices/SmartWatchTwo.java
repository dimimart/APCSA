
public class SmartWatchTwo extends PortableDevices{
private String[][] array;
private String name;
int row = 10;
public SmartWatchTwo() {//col, then row
	super();
	name = "";
}//end con
public SmartWatchTwo(String nombre) {
	name = nombre;
	array = new String[row][1];
	array[0][0] = nombre;
	array[1][0] = "Maximum Usage Time 		18 hours";
	array[2][0] = "Operating System 		Compatibility Apple iOS";
	array[3][0] = "Touch Screen 			Yes";
	array[4][0] = "Water Resistant			Yes";
	array[5][0] = "Operating System 		watchOS";
	array[6][0] = "Body Metrics 			Measured Heart rate";
	array[7][0] = "Scree Size 			42 milimeters";
	array[8][0] = "Band Material 			Other";
	array[9][0] = "Series 				Series 2";
}//end con
public int returnRow() {
	return row;
}
public String[][] returnArray(){
	return array;
}//end getter
public String getName() { return name; }//end getter
/*public String toString() {
	String output = super.toString();
	for(String[] object : array) {
		for(String something: object) {
			output += something;
		}//end for 
		output += "\n";
	}//end for 
	return output;
}//end toString */
public void printWatchTwo() {
	String output = super.toString();
	for(String[] object : array) {
		for(String something: object) {
			output += something;
		}//end for 
		output += "\n";
	}//end for 
	System.out.print(output);
}
}

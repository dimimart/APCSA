
public class LaptopOne extends PortableDevices{
private String[][] array;
private String name;
int row = 10;
public LaptopOne() {//col, then row
	super();
	name = " ";
}//end con
public LaptopOne(String nombre) {
	name = nombre;
	array = new String[row][1];
	array[0][0] = nombre;
	array[1][0] = "Hard Drive Capacity 		32 gigabytes";
	array[2][0] = "Hard Drive Type 		eMMC";
	array[3][0] = "Operating System 		Chrome OS";
	array[4][0] = "Processor Speed 		2 gigahertz";
	array[5][0] = "Processor Model 		ARM";
	array[6][0] = "System Memory (RAM) 		5 gigabytes";
	array[7][0] = "Graphics Card 			ARM Mali-T860";
	array[8][0] = "Screen Size 			12.3 inches";
	array[9][0] = "Touch Screen 			Yes";
}//end 0 arg
public int returnRow() {
	return row;
}
public String[][] returnArray(){
	return array;
}//end getter
public String getName() {
	return name;
}//end toString 
public void printLaptopOne() {
	String output = super.toString();
	for(String[] object : array) {
		for(String something: object) {
			output += something;
		}//end for 
		output += "\n";
	}//end for 
	System.out.print(output);
}//end toString 
}//end toString

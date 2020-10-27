
public class LaptopTwo extends PortableDevices{
private String[][] array;
private String name;
int row = 10;
public LaptopTwo() {//col, then row
	super();
	name = " ";
}//end con
public LaptopTwo(String nombre) {
	name = nombre;
	array = new String[row][1];
	array[0][0] = nombre;
	array[1][0] = "Hard Drive Capacity 			128 gigabytes";
	array[2][0] = "Hard Drive Type 			Solid State Drive";
	array[3][0] = "Operating System 			Windows 10";
	array[4][0] = "Processor Speed 			2.4 gigahertz";
	array[5][0] = "Processor Model 			Intel 6th Generation Cre i5";
	array[6][0] = "System Memory (RAM) 			8 gigabytes";
	array[7][0] = "Graphics Card 				Intel HD Graphics 520";
	array[8][0] = "Screen Size				13.5 inches";
	array[9][0] = "Touch Screen 				Yes";
}//end 0 arg
public int returnRow() {
	return row;
}
public String[][] returnArray(){
	return array;
}//end getter
public String getName() {
	return name;
}//end getter 
public void printLaptopTwo() {
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

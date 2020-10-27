public class SmartPhoneTwo extends PortableDevices{
	private String[][] array;
	private String name;
	int row = 10;
	public SmartPhoneTwo() {//col, then row
		super();
		name = " ";
	}//end con
	public SmartPhoneTwo(String nombre) {
		name = nombre;
		array = new String[row][1];
		array[0][0] = nombre;
		array[1][0] = "Carrier 				Sprint";
		array[2][0] = "Wireless Technology 			CDMA";
		array[3][0] = "Operating System 			Android 6.0 Marshmallow";
		array[4][0] = "Processor Speed 			2.2 gigahertz";
		array[5][0] = "Internal Memory 			32 gigabytes";
		array[6][0] = "Screen Size 				5.1 inches";
		array[7][0] = "Water Resistant 			Yes";
		array[8][0] = "Phone Memory (RAM) 			4 gigabytes";
		array[9][0] = "Internet Connectable 			Yes";
	}//end con
	public int returnRow() {
		return row;
	}
	public String[][] returnArray(){
		return array;
	}//end getter
	public String getName() {
		return name;
	}//end string
	public void printSmartPhoneTwo() {
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

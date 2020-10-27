public class SmartPhoneOne extends PortableDevices {
	private String[][] array;
	private String name;
	int row  = 9; 
	public SmartPhoneOne() {//col, then row
		super();
		name = "";
	}//end con
	public SmartPhoneOne(String nombre) {
		 name = nombre;
		 	array = new String[row][1];
		 	array[0][0] = nombre;
		 	array[1][0] = "Carrier 			Verizon";
			array[2][0] = "Wireless Technology 		4G LTE";
			array[3][0] = "Operating System 		Apple iOS";
			array[4][0] = "Maximum Usage Time 		40 hours";
			array[5][0] = "Internal Memory 		32 gigabytes";
			array[6][0] = "Screen Size 			4.7 inches";
			array[7][0] = "Water Resistant 		Yes";
			array[8][0] = "Internet Connectable 		Yes";
	}//end one arg
	
	public int returnRow(){
		return row;
	}//end getter
	
	public String[][] returnArray(){
		return array;
	}
	
	public String getName() {
		return name;
	}//end getter 
	public void printSmartPhoneOne() {
		String output = super.toString();
		for(String[] object : array) {
			for(String something: object) {
				output += something;
			}//end for 
			output += "\n";
		}//end for 
		System.out.print(output);;
	}//end toString 
}//ends class

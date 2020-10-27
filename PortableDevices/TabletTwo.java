public class TabletTwo extends PortableDevices {
	private String[][] array;
	private String name;
	int row  = 8;
	public TabletTwo() {//col, then row
		super();
		name = "";
	}//end con
	public TabletTwo(String nombre) {
		name = nombre;
		array = new String[row][1];
		array[0][0] = nombre;
		array[1][0] = "Screen Size 			7 inches";
		array[2][0] = "Operating System 		Fire OS 5";
		array[3][0] = "Internet Connectivity 		Wi- Fi";
		array[4][0] = "Processor Model 		Quad-core 1.3GHz processor with 16B of RAM";
		array[5][0] = "Processor Speed 		1.3 gigahertz";
		array[6][0] = "Screen Resolution 		1024 x 600";
		array[7][0] = "Storage Capacity 		8 gigabytes";
	}//end con
	public int returnRow() {
		return row;
	}
	public String[][] returnArray(){
		return array;
	}//end getter
	public String getName() {
		return name;
	}//end strirng 
	public void printTabletTwo() {
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

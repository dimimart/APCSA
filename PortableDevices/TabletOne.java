public class TabletOne extends PortableDevices {
	private String[][] array;
	private String name;
	int row = 8;
	public TabletOne() {//col, then row
		super();
		name = " ";
	}//end con
	public TabletOne(String nombre) {
		name = nombre;
		array = new String[row][1];
		array[0][0] = nombre;
		array[1][0] = "Screen Size 			9.7 inches";
		array[2][0] = "Operating System 		Apple iOS 9";
		array[3][0] = "Internet Connectivity 		Wi- Fi";
		array[4][0] = "Processor Brand 		Apple";
		array[5][0] = "Processor Model 		A9X chip with 64-bit architecture, M9 coprocessor";
		array[6][0] = "Screen Resolution 		2048 x 11536";
		array[7][0] = "Storage Capacity 		128 gigabytes";
	}//end con
	public int returnRow() {
		return row;
	}
	public String[][] returnArray(){
		return array;
	}//end getter
	public String getName() {
		return name;
	}//end getter
	public void printTabletOne() {
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

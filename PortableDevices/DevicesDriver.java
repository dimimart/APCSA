import javax.swing.JOptionPane;

//import javax.swing.JOptionPane;
public class DevicesDriver{
public static void main(String[] args) {
	
	String[][] array;
	int maxCol = 8;
	int maxRow = 10;
	array = new String[maxRow][maxCol];
	
	SmartPhoneOne SO = new SmartPhoneOne("SmartPhone 1");
	for(int i = 0; i < SO.returnRow(); i++) {
		array[i][0] = SO.returnArray()[i][0];
	}//end for
	SmartPhoneTwo ST = new SmartPhoneTwo("SmartPhone 2");
	for(int k = 0; k < ST.returnRow(); k++) {
		array[k][1] = ST.returnArray()[k][0];
	}//end for
	
	SmartwatchOne WO = new SmartwatchOne("SmartWatch 1");
	for(int k = 0; k < WO.returnRow(); k++) {
		array[k][2] = WO.returnArray()[k][0];
	}//end for
	SmartWatchTwo s = new SmartWatchTwo("SmartWatch 2");
	for(int k = 0; k < s.returnRow(); k++) {
		array[k][3] = s.returnArray()[k][0];
	}//end for
	
	TabletOne TO = new TabletOne("Tablet 1");
	for(int k = 0; k < TO.returnRow(); k++) {
		array[k][4] = TO.returnArray()[k][0];
	}//end for
	TabletTwo TT = new TabletTwo("Tablet 2");
	for(int k = 0; k < TT.returnRow(); k++) {
		array[k][5] = TT.returnArray()[k][0];
	}//end for
	
	LaptopOne Lo = new LaptopOne("Laptop 1");
	for(int k = 0; k < Lo.returnRow(); k++) {
		array[k][6] = Lo.returnArray()[k][0];
	}//end for
	LaptopTwo LT = new LaptopTwo("Laptop 2");
	for(int k = 0; k < LT.returnRow(); k++) {
		array[k][7] = LT.returnArray()[k][0];
	}//end for
	 
	
	//int askOne = Integer.parseInt(JOptionPane.showInputDialog("Enter the row you want."));
	String askTwo = JOptionPane.showInputDialog("Enter the which device you want you want. \nSmartPhone 1, Smart Phone 2, SmartWatch 1, SmartWatch 2, Tablet 1, Tablet 2, Laptop 1, Laptop 2");
	
	boolean check = false;
	int column = 0;
	for(int i = 0; i < array.length; i++) {
		for(int k = 0; k < array[i].length; k++) {
			//System.out.println("Debugging.");
			if(askTwo.equals(array[i][k])) {
				check = true;
				column = k;
			}//end if
		}//end for
	}//end for
	if(check == true) {
		for(int i = 0; i < array.length; i++) {
			for(int l = 0; l < array[i].length; l++) {
				if(array[i][l] == null) {
					array[i][l] = "";
				}//end if
			}//end for 
		}//end for
		for(int i = 0; i < array.length; i++) {
			System.out.println(array[i][column]);
		}//end for 	
	}//end if
	if(check != true) {
		System.out.println("Oops, that doesn't exist...");
	}//end if 
}//end static 
}//end class	

public class ComputerDriver {
	public static void main(String[] args) {
		DesktopComputer myPC = new DesktopComputer("Intel" , 3.2 , 8 , 500 , 2);
		LaptopComputer myNotebook = new LaptopComputer("Intel" , 1.1 , 4 , 150 , 15);
		System.out.println(myPC);
		System.out.println(myNotebook);

	}//end main
	
}//end class

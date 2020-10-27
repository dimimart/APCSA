
public abstract class SuperClassNotes {
	private String processorBrand;
	private double processorSpeed;
	private int ram;
	private int hardDrive;
	
	public SuperClassNotes(){
		processorBrand = "Generic";
		processorSpeed = 0.0;
		ram = 0;
		hardDrive = 0;
	}//end 0 arg constructor
	
	public SuperClassNotes(String processorBrand , double processorSpeed , int ram , int hardDrive){
		this.processorBrand = processorBrand;
		this.processorSpeed = processorSpeed;
		this.ram = ram;
		this.hardDrive = hardDrive;
	}//end Constructor
	
	public abstract String password();//make a password creator 
	
	public String toString(){
		String output;
		output = "This computer has a " + processorSpeed + "GHz " + processorBrand + " processor with " + ram + " GB of RAM, a " + hardDrive + " GB Hard Drive";
		return output;

	}// end toString

}//end class

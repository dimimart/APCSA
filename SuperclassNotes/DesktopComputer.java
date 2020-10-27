public class DesktopComputer extends SuperClassNotes{
	private int driveBays;
	
	public DesktopComputer(){
		super();
		driveBays = 0;
	}//end 0 arg const
	
	public DesktopComputer(String processorBrand , double processorSpeed , int ram , int hardDrive , int driveBays){
		super(processorBrand , processorSpeed , ram , hardDrive);
		this.driveBays = driveBays;
	}//end multi arg const
	
	public String password() {
		
	}//end method
	
	public String toString(){
		String output;
		output = super.toString() + " and is a desktop with " + driveBays + " drive bays";
		return output;
	}//end toString

}//end PersonalComputer Class

public class LaptopComputer extends SuperClassNotes{
	private int screenSize;
	
	public LaptopComputer(){
		super();
		screenSize = 0;
	}//end 0 arg const
	
	public LaptopComputer(String processorBrand , double processorSpeed , int ram , int hardDrive , int screenSize){
		super(processorBrand , processorSpeed , ram , hardDrive);
		this.screenSize = screenSize;
	}//end multi arg const
	
	public String toString(){
		String output;
		output = super.toString() + " and is a laptop with a " + screenSize + " inch screen";
		return output;
	}//end toString

}//end LaptopComputer Class

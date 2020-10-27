
public class BWTV extends Television{

	private String type;
	private boolean oN;
	
	public BWTV(String type, boolean on) {
		super();
		this.type = type;
		this.oN = on;
	}//end 0 arg
	
	public BWTV() {
		type = type;
		oN = oN;
	}//end 
	
	public String tvType() {
		return type;
	}//end getter*/
	
	public String rotateRabbitEars() {
		return "Rabbit ears rotated 45 degrees";
	}//end getter?
	
	public interface Analog {
		public abstract String rotateRabbitEars();
	}//end interface Analog

	public String toString() {
		return super.toString();
	}//end toString

	
	
}//end class

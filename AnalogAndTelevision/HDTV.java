
public class HDTV extends Television{
	private String type;
	private boolean oN;
	
	
	public HDTV(String type, boolean on) {
		super();
		this.type = type;
		this.oN = on;
	}//end 0 arg
	
	public HDTV() {
		super();
		this.type = type;
		this.oN = oN;
	}//end
	
	public String tvType() {
		return type;
	}//end getter
	
	public String connectHDMI() {
		return "HDMI cable connected";
	}//end getter?
	
	public interface Digital{
		public abstract String connectHDMI();	
	} // end interface Digital

	public String toString() {
		return super.toString();
	}//end toString
	
}//end class

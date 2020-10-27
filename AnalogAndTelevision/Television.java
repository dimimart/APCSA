
public abstract class Television {

	private String type;
	private boolean tvON;
	
	
	public Television(String type, boolean ON) {
		this.type = type;
		this.tvON = ON;
	}//end 
	
	public Television() {
		type = type;
		tvON = tvON;
	}

	public void settvON(boolean tvON) {
		this.tvON = tvON;
	}//end setter
	public boolean gettvON() {
		return this.tvON;
	}//end getter
	
	public abstract String tvType();
	
	public String toString() {
		return tvType() + "...Am I on? " + gettvON();
	}//end toString 
	
}//end classs


public class HorseBarn implements Horse{

	private Horse[] spaces;
	private String name;
	private int weight;
	
	public HorseBarn(String name, int weight) {
		this.name = name;
		this.weight = weight;
	}//end 0 arg
	
	public HorseBarn(Horse[] spaces){
		this.spaces = spaces.clone();//try practicing w/ this right before the ap test, maybe it will come in handy
	}//end
	
	public String getName() {
		return name;
	}//end getter
	
	public int getWeight() {
		return weight;
	}//end in 
	
	public int findHorseSpace(String name) {
		int Space = -1;
	    for (int i = 0; i < spaces.length; i++) {
	       if ((spaces[i]!=null) && (name.equals(this.spaces[i].getName()))) {
	          Space = i;
	       } //end if
	    }//end for 
	    return Space; 
	}//end method
	
	public void consolidate(Horse[] spaces) {
		for (int i = 0; i < spaces.length-1; i++) {
		       if (spaces[i] == null) {//USE == OR ELSE IT WONT WORK REMEMBER!!!!
		          for (int k = i + 1; k < spaces.length; k++) {
		             if (spaces[k] != null) {
		                spaces[i] = spaces[k];
		                spaces[k] = null;
		                k = spaces.length;
		             } //end if 
		           }//end for 
		        } //end if       
		}//end for
	}//end method
	
	public String toString() {
		return "\n" + name + "\n" + weight + "\n";
	}//end toString
	
}//end class

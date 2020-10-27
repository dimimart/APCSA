import java.util.Arrays;
import java.util.List;
public class MultipleGroups implements NumberGroup {
	
	private List<NumberGroup> groupList;
	
	//allows for diff amount of NumberGroup interfaces, loook more into it later 
	public MultipleGroups(NumberGroup...groups) {//TRY TO FULLY LEARn THIS BEFORE AP TEST
		this.groupList = Arrays.asList(groups);
	}//end con
	
	public boolean contains(int nummy) {
		for(NumberGroup object : groupList) {
			if(object.contains(nummy)) {
				return true;
			}//end if
		}//end for 
		return false;
	}//end method
	
	/*public String toString() {
		String output = "";
		for(int i = 0; i < groupList.size(); i++) {
			output += groupList.get(i);
		}//end for 
		return output;
	}//end toStrn*/
	
}//end class

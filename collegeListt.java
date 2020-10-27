import java.util.ArrayList;
public class collegeListt {
public static void main(String[] args) {
	ArrayList<String> collegeList = new ArrayList<String>();
	collegeList.add("SFSU");
	collegeList.add("UC Santa Cruz");
	collegeList.add("CSUMB");
	collegeList.add("SMC");
	collegeList.add("Azusa Pacfic");
	collegeList.add("UMass");
	collegeList.add("Army");
	collegeList.add("Navy");
	int lengthy = collegeList.size();
	System.out.println("First List: ");
	for(int i = 0; i < lengthy; i++) {
		System.out.println(collegeList.get(i));
	}//end for loop
	int four = 4;
	for(int i = collegeList.size()-1; i >= 0; i--) {
		if(collegeList.get(i).length()== 4) {// 
			collegeList.remove(i);
			i--;
		}//end if statement
	}//end for loop
	
	int l = collegeList.size();
	System.out.println("\nSecond List: ");
	for(int i = 0; i < l; i++) {
		System.out.println(collegeList.get(i));
	}// end for loop

}//end static
}//end main code
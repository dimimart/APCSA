import java.util.ArrayList;
public class MenInBlack {
public static void main (String[] args) {
	ArrayList<String> names = new ArrayList<String>();
	names.add("Jerry");
	names.add("Maya");
	names.add("Camila");
	names.add("Andy");
	int lengthy = names.size();
	System.out.println("First List:");
	for(int i = 0; i < lengthy; i++) {
		System.out.println(names.get(i));
	}//end for loop
	
	names.remove(1);
	int l = names.size();//removes maya
	System.out.println("\nNew list:");
	for(int i = 0; i < l; i++) {
		System.out.println(names.get(i));
	}//end for loop
}//end static
}//end public 
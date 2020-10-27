
public class MultipleGroupDriver {
public static void main(String[] args) {
	
	Range range1 = new Range(5, 8);
	Range range2 = new Range(10, 12);
	Range range3 = new Range(1, 6);
	Range range4 = new Range(-3, 2);
	
	MultipleGroups multi = new MultipleGroups(range4, range1, range2, range3);
	
	System.out.println("NumberGroup:");
	System.out.println(range4);
	System.out.println(range1);
	System.out.println(range2);
	System.out.println(range3);
	System.out.println("\n" + "\n" + multi.contains(2));
	System.out.println(multi.contains(9));
	System.out.println(multi.contains(6));
	
}//end static 
}//end class

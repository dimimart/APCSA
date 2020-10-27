package frqTicket;
public class ticketDriver {
public static void main(String[] args) {
	advance ADVANCE = new advance(50);
	walkup WALKUP = new walkup();
	studentadvance STUDENT = new studentadvance(23);
	System.out.print(ADVANCE + "\n\n" + WALKUP +"\n\n" + STUDENT);
}//end static 
}//end class

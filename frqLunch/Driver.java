//salad drink sandwhich drivre
public class Driver {
public static void main(String[] args) {
	
	salad Salad = new salad("Coleslaw", 1.25);
	sandwhich Sandwhich = new sandwhich("Cheeseburger", 2.75);
	drink Drink = new drink("Orange Soda", 1.25);
	
	trio trio1 = new trio(Sandwhich, Salad, Drink);
	//these will compile with an error, thus I am commenting them for the time being. However, I am adding them, as it is what the College Board did for the FRQ 
	//trio trio2 = new trio(Salad, Sandwhich, Drink);
	//trio trio2 = new trio(Sandwhich, Salad, Salad);
	
	System.out.println(trio1 + "\n\n" + trio1.getPrice());
	
}//end static 
}//end class

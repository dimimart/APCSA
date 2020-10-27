
public class HorseDriver {
public static void main(String[] args) {
	Horse[] sweetHome = new HorseBarn[7];
	sweetHome[0] = new HorseBarn("Trigger", 1340);
	sweetHome[2] = new HorseBarn("Silver", 1210);
	sweetHome[3] = new HorseBarn("Lady", 1575);
	sweetHome[5] = new HorseBarn("Patches", 1350);
	sweetHome[6] = new HorseBarn("Duke", 1410);
	HorseBarn notSweet = new HorseBarn(sweetHome);
	System.out.println("Horse: \nA horse named Trigger is in space " + notSweet.findHorseSpace("Trigger"));
	System.out.println("A horse named Trigger is in space " + notSweet.findHorseSpace("Silver"));
	System.out.println("A horse named Trigger is in space " + notSweet.findHorseSpace("Coco"));
	for(int i = 0; i  < sweetHome.length; i++) {
		System.out.println(sweetHome[i]);
	}//end for 
	notSweet.consolidate(sweetHome);
	System.out.println("\n");
	for(int i = 0; i  < sweetHome.length; i++) {
		System.out.println(sweetHome[i]);
	}//end for 
}//end static
}//end driver class

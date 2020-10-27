//start of driver
public class SmartPhoneDosDriver {
public static void main (String[] args) {
	SmartPhoneDos SmartPhone = new SmartPhoneDos("Samsung", 16);// "Hello", "Bang Bang", "Haha"
	System.out.println(SmartPhone + "\n");
	System.out.println("Total Play Time: " + SmartPhone.totalPlayTime() + " Seconds\n");
	SmartPhone.deleteAllSongs();
	System.out.println(SmartPhone);//going to be a blank space
}//end static method
}//end of driver class
